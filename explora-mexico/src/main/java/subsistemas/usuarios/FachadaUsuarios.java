/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemas.usuarios;

import dto.UsuarioDTO;

public class FachadaUsuarios implements IFachadaUsuarios {

    private final UsuarioBO usuarioBO;

    public FachadaUsuarios() {
        this.usuarioBO = new UsuarioBO();
    }

    @Override
    public UsuarioDTO iniciarSesion(String nombreUsuario, String contrasena) {
        return usuarioBO.validarLogin(nombreUsuario, contrasena);
    }

    @Override
    public boolean registrarEstudiante(UsuarioDTO nuevoUsuario) {
        return usuarioBO.registrarEstudiante(nuevoUsuario);
    }
}