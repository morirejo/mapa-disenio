/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;


import dto.EstadoDTO;
import dto.ExperienciaDTO;
import dto.ONGDTO;
import dto.QuizDTO;
import dto.UsuarioDTO;
import java.util.List;
import javax.swing.JFrame;
import subsistemas.estados.FachadaEstados;
import subsistemas.estados.IFachadaEstados;
import subsistemas.quizzes.FachadaQuizzes;
import subsistemas.quizzes.IFachadaQuizzes;
import subsistemas.usuarios.FachadaUsuarios;
import subsistemas.usuarios.IFachadaUsuarios;

public class ControladorMediator {

    private static ControladorMediator instancia;

    private final IFachadaUsuarios fachadaUsuarios;
    private final IFachadaEstados fachadaEstados;
    private final IFachadaQuizzes fachadaQuizzes;

    private UsuarioDTO usuarioActual;
    private EstadoDTO estadoActual;
    private JFrame ventanaActual;

    private ControladorMediator() {
        this.fachadaUsuarios = new FachadaUsuarios();
        this.fachadaEstados = new FachadaEstados();
        this.fachadaQuizzes = new FachadaQuizzes();
    }

    public static ControladorMediator getInstancia() {
        if (instancia == null) {
            instancia = new ControladorMediator();
        }
        return instancia;
    }

    public void mostrarVentana(JFrame nuevaVentana) {
        if (ventanaActual != null) {
            ventanaActual.dispose();
        }
        ventanaActual = nuevaVentana;
        ventanaActual.setLocationRelativeTo(null);
        ventanaActual.setVisible(true);
    }

    // --- FLUJO DE USUARIOS ---

    public boolean iniciarSesion(String nombreUsuario, String contrasena) {
        UsuarioDTO usuario = fachadaUsuarios.iniciarSesion(nombreUsuario, contrasena);
        if (usuario != null) {
            this.usuarioActual = usuario;
            return true;
        }
        return false;
    }

    public void iniciarComoInvitado() {
        UsuarioDTO invitado = new UsuarioDTO();
        invitado.setNombreUsuario("Invitado");
        invitado.setRolUsuario("INVITADO");
        invitado.setPuntuacionQuizzes(0.0);
        this.usuarioActual = invitado;
    }

    public boolean registrarEstudiante(String nombreUsuario, String correo, String contrasena) {
        UsuarioDTO nuevo = new UsuarioDTO();
        nuevo.setNombreUsuario(nombreUsuario);
        nuevo.setCorreo(correo);
        nuevo.setContrasena(contrasena);
        nuevo.setRolUsuario("CLIENTE");
        return fachadaUsuarios.registrarEstudiante(nuevo);
    }

    public boolean esAdministrador() {
        return usuarioActual != null && "ADMIN".equalsIgnoreCase(usuarioActual.getRolUsuario());
    }

    // --- FLUJO DE ESTADOS, EXPERIENCIAS, ONGs Y CONABIO ---

    public EstadoDTO seleccionarEstado(String nombreEstado) {
        this.estadoActual = fachadaEstados.obtenerEstadoPorNombre(nombreEstado);
        return this.estadoActual;
    }

    public List<EstadoDTO> obtenerTodosLosEstados() {
        return fachadaEstados.obtenerTodosLosEstados();
    }

    public void agregarExperiencia(String nombreEstado, ExperienciaDTO expDTO) {
        fachadaEstados.agregarExperiencia(nombreEstado, expDTO);
        if (estadoActual != null && estadoActual.getNombreEstado().equalsIgnoreCase(nombreEstado)) {
            this.estadoActual = fachadaEstados.obtenerEstadoPorNombre(nombreEstado);
        }
    }

    public void eliminarExperiencia(String nombreEstado, int indice) {
        fachadaEstados.eliminarExperiencia(nombreEstado, indice);
        if (estadoActual != null && estadoActual.getNombreEstado().equalsIgnoreCase(nombreEstado)) {
            this.estadoActual = fachadaEstados.obtenerEstadoPorNombre(nombreEstado);
        }
    }

    public void agregarONG(String nombreEstado, ONGDTO ongDTO) {
        fachadaEstados.agregarONG(nombreEstado, ongDTO);
        if (estadoActual != null && estadoActual.getNombreEstado().equalsIgnoreCase(nombreEstado)) {
            this.estadoActual = fachadaEstados.obtenerEstadoPorNombre(nombreEstado);
        }
    }

    public String consultarFichaExternaCONABIO(Long idEspecie) {
        return fachadaEstados.consultarFichaExternaCONABIO(idEspecie);
    }

    // --- FLUJO DE QUIZZES ---

    public void registrarQuizEnEstado(String nombreEstado, QuizDTO quizDTO) {
        fachadaQuizzes.registrarQuizEnEstado(nombreEstado, quizDTO);
        if (estadoActual != null && estadoActual.getNombreEstado().equalsIgnoreCase(nombreEstado)) {
            this.estadoActual = fachadaEstados.obtenerEstadoPorNombre(nombreEstado);
        }
    }

    public List<QuizDTO> obtenerQuizzesPorEstado(String nombreEstado) {
        return fachadaQuizzes.obtenerQuizzesPorEstado(nombreEstado);
    }

    public double evaluarQuiz(QuizDTO quizRespondido) {
        return fachadaQuizzes.evaluarYGuardarPuntaje(quizRespondido, usuarioActual);
    }

    // --- GETTERS DE SESIÓN ---

    public UsuarioDTO getUsuarioActual() {
        return usuarioActual;
    }

    public EstadoDTO getEstadoActual() {
        return estadoActual;
    }
}
