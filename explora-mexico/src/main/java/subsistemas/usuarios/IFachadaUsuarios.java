/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemas.usuarios;

import dto.UsuarioDTO;

public interface IFachadaUsuarios {
    UsuarioDTO iniciarSesion(String nombreUsuario, String contrasena);
    boolean registrarEstudiante(UsuarioDTO nuevoUsuario);
}