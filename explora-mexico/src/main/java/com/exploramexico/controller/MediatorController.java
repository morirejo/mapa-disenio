/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exploramexico.controller;

import com.exploramexico.model.Estado;
import com.exploramexico.model.Experiencia;
import com.exploramexico.model.ONG;
import com.exploramexico.model.Pregunta;
import com.exploramexico.model.Quiz;
import com.exploramexico.model.Respuesta;
import com.exploramexico.model.Usuario;
import java.util.List;
import javax.swing.JFrame;
import negocio.bo.EstadoBO;
import negocio.bo.ValidadorDeQuizzes;
import negocio.bo.ValidadorDeUsuario;
import negocio.dto.CONABIOApiWrapper;

/**
 *
 * @author thepe
 */
public class MediatorController {
//    private static MediatorController instancia;
//
//    private final ValidadorDeUsuario validadorUsuario;
//    private final ValidadorDeQuizzes validadorQuizzes;
//    private final EstadoBO estadoBO;
//    private final CONABIOApiWrapper conabioFacade;
//
//    private Usuario usuarioActual;
//    private Estado estadoActual;
//    private JFrame ventanaActual;
//
//    private MediatorController() {
//        this.validadorUsuario = new ValidadorDeUsuario();
//        this.validadorQuizzes = new ValidadorDeQuizzes();
//        this.estadoBO = new EstadoBO();
//        this.conabioFacade = new CONABIOApiWrapper();
//    }
//
//    public static MediatorController getInstancia() {
//        if (instancia == null) {
//            instancia = new MediatorController();
//        }
//        return instancia;
//    }
//
//    public void mostrarVentana(JFrame nuevaVentana) {
//        if (ventanaActual != null) {
//            ventanaActual.dispose();
//        }
//        ventanaActual = nuevaVentana;
//        ventanaActual.setLocationRelativeTo(null);
//        ventanaActual.setVisible(true);
//    }
//
//    // --- FLUJO DE INICIO DE SESIÓN Y REGISTRO ---
//
//    public boolean iniciarSesion(String nombreUsuario, String contrasena) {
//        Usuario user = validadorUsuario.iniciarSesion(nombreUsuario, contrasena);
//        if (user != null) {
//            this.usuarioActual = user;
//            return true;
//        }
//        return false;
//    }
//
//    public void iniciarComoInvitado() {
//        Usuario invitado = new Usuario();
//        invitado.setNombreUsuario("Invitado");
//        invitado.setRolUsuario("INVITADO");
//        this.usuarioActual = invitado;
//    }
//
//    public boolean registrarUsuario(String nombreUsuario, String correo, String contrasena) {
//        return validadorUsuario.registrarEstudiante(nombreUsuario, correo, contrasena);
//    }
//
//    public boolean esAdministrador() {
//        return usuarioActual != null && "ADMIN".equalsIgnoreCase(usuarioActual.getRolUsuario());
//    }
//
//    // --- FLUJO DEL MAPA Y ESTADOS ---
//
//    public Estado seleccionarEstado(String nombreEstado) {
//        Estado estado = estadoBO.obtenerPorNombre(nombreEstado);
//        if (estado == null) {
//            estado = new Estado();
//            estado.setNombreEstado(nombreEstado);
//            estado.setDescripcion("Información ecológica y cultural de " + nombreEstado);
//            estadoBO.guardarOActualizarEstado(estado);
//        }
//        this.estadoActual = estado;
//        return estado;
//    }
//
//    public List<Estado> obtenerTodosLosEstados() {
//        return estadoBO.obtenerTodos();
//    }
//
//    public void actualizarEstado(Estado estado) {
//        estadoBO.guardarOActualizarEstado(estado);
//        this.estadoActual = estado;
//    }
//
//    // --- FLUJO DE QUIZZES ---
//
//    public double evaluarQuiz(List<Pregunta> preguntas, List<Respuesta> respuestasUsuario) {
//        return validadorQuizzes.obtenerPuntuacion(preguntas, respuestasUsuario);
//    }
//
//    public void agregarQuizAEstado(String nombreEstado, Quiz nuevoQuiz) {
//        estadoBO.agregarQuiz(nombreEstado, nuevoQuiz);
//    }
//
//    // --- FLUJO DE EXPERIENCIAS Y ONGs ---
//
//    public void agregarExperiencia(String nombreEstado, Experiencia exp) {
//        estadoBO.agregarExperiencia(nombreEstado, exp);
//    }
//
//    public void eliminarExperiencia(String nombreEstado, int indice) {
//        estadoBO.eliminarExperiencia(nombreEstado, indice);
//    }
//
//    public void agregarONG(String nombreEstado, ONG ong) {
//        estadoBO.agregarONG(nombreEstado, ong);
//    }
//
//    // --- CONSULTA EXTERNA CONABIO (FACADE) ---
//
//    public String obtenerDatosExternosEspecie(Long idEspecie) {
//        return conabioFacade.consultarEspeciePorId(idEspecie);
//    }
//
//    // --- GETTERS DE SESIÓN ---
//
//    public Usuario getUsuarioActual() {
//        return usuarioActual;
//    }
//
//    public Estado getEstadoActual() {
//        return estadoActual;
//    }
}
