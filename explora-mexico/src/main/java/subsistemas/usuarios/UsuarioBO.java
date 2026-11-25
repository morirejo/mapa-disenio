/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemas.usuarios;

import dao.UsuarioDAO;
import dao.mongo.UsuarioDAOImpl;
import dto.UsuarioDTO;
import model.Estudiante;
import model.Usuario;

class UsuarioBO {

    private final UsuarioDAO usuarioDAO;

    UsuarioBO() {
        this.usuarioDAO = new UsuarioDAOImpl();
    }

    UsuarioDTO validarLogin(String nombreUsuario, String contrasena) {
        if (nombreUsuario == null || nombreUsuario.isBlank() || contrasena == null || contrasena.isBlank()) {
            return null;
        }
        Usuario entidad = usuarioDAO.buscarPorCredenciales(nombreUsuario, contrasena);
        if (entidad == null) {
            return null;
        }
        UsuarioDTO dto = new UsuarioDTO();
        dto.setIdUsuario(entidad.getIdUsuario().toHexString());
        dto.setNombreUsuario(entidad.getNombreUsuario());
        dto.setCorreo(entidad.getCorreo());
        dto.setRolUsuario(entidad.getRolUsuario());
        if (entidad instanceof Estudiante est) {
            dto.setPuntuacionQuizzes(est.getPuntuacionQuizzes());
        }
        return dto;
    }

    boolean registrarEstudiante(UsuarioDTO dto) {
        if (dto == null || dto.getNombreUsuario() == null || dto.getNombreUsuario().isBlank()
                || dto.getCorreo() == null || dto.getContrasena() == null) {
            return false;
        }
        if (usuarioDAO.buscarPorNombre(dto.getNombreUsuario()) != null) {
            return false;
        }
        Estudiante nuevo = new Estudiante();
        nuevo.setNombreUsuario(dto.getNombreUsuario());
        nuevo.setCorreo(dto.getCorreo());
        nuevo.setContrasena(dto.getContrasena());
        nuevo.setRolUsuario("CLIENTE");
        nuevo.setPuntuacionQuizzes(0.0);
        usuarioDAO.guardar(nuevo);
        return true;
    }
}