/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.bo;

import com.exploramexico.dao.UsuarioDAO;
import com.exploramexico.dao.mongo.UsuarioDAOImpl;
import com.exploramexico.model.Estudiante;
import com.exploramexico.model.Usuario;

public class ValidadorDeUsuario {

    private final UsuarioDAO usuarioDAO;

    public ValidadorDeUsuario() {
        this.usuarioDAO = new UsuarioDAOImpl();
    }

    public Usuario iniciarSesion(String nombreUsuario, String contrasena) {
        if (nombreUsuario == null || nombreUsuario.isBlank() || contrasena == null || contrasena.isBlank()) {
            return null;
        }
        return usuarioDAO.buscarPorCredenciales(nombreUsuario, contrasena);
    }

    public boolean registrarEstudiante(String nombreUsuario, String correo, String contrasena) {
        if (nombreUsuario == null || nombreUsuario.isBlank() || correo == null || correo.isBlank() || contrasena == null || contrasena.isBlank()) {
            return false;
        }
        if (usuarioDAO.buscarPorNombre(nombreUsuario) != null) {
            return false;
        }
        Estudiante nuevo = new Estudiante();
        nuevo.setNombreUsuario(nombreUsuario);
        nuevo.setCorreo(correo);
        nuevo.setContrasena(contrasena);
        nuevo.setRolUsuario("CLIENTE");
        usuarioDAO.guardar(nuevo);
        return true;
    }
}