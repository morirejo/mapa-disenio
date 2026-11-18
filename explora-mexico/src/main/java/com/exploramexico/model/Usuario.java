package com.exploramexico.model;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

/** Usuario de la plataforma. */
public class Usuario {

    @BsonId
    private ObjectId idUsuario;
    private String nombreUsuario;
    private String correo;
    private String contrasena;
    private String rolUsuario;

    public Usuario() {
    }

    public Usuario(ObjectId idUsuario, String nombreUsuario, String correo, String contrasena, String rolUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contrasena = contrasena;
        this.rolUsuario = rolUsuario;
    }

    public ObjectId getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(ObjectId idUsuario) {
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
}
