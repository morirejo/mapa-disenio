/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

public class UsuarioDTO {

    private String idUsuario;
    private String nombreUsuario;
    private String correo;
    private String contrasena;
    private String rolUsuario;
    private Double puntuacionQuizzes;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String idUsuario, String nombreUsuario, String correo, String contrasena, String rolUsuario, Double puntuacionQuizzes) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contrasena = contrasena;
        this.rolUsuario = rolUsuario;
        this.puntuacionQuizzes = puntuacionQuizzes;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public Double getPuntuacionQuizzes() {
        return puntuacionQuizzes;
    }

    public void setPuntuacionQuizzes(Double puntuacionQuizzes) {
        this.puntuacionQuizzes = puntuacionQuizzes;
    }
}