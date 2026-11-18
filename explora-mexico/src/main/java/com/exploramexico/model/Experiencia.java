package com.exploramexico.model;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

/** Experiencia asociada a un estado. */
public class Experiencia {

    @BsonId
    private ObjectId idExperiencia;
    private String nombreExperiencia;
    private String descripcionExperiencia;

    public Experiencia() {
    }

    public Experiencia(ObjectId idExperiencia, String nombreExperiencia, String descripcionExperiencia) {
        this.idExperiencia = idExperiencia;
        this.nombreExperiencia = nombreExperiencia;
        this.descripcionExperiencia = descripcionExperiencia;
    }

    public ObjectId getIdExperiencia() {
        return idExperiencia;
    }

    public void setIdExperiencia(ObjectId idExperiencia) {
        this.idExperiencia = idExperiencia;
    }

    public String getNombreExperiencia() {
        return nombreExperiencia;
    }

    public void setNombreExperiencia(String nombreExperiencia) {
        this.nombreExperiencia = nombreExperiencia;
    }

    public String getDescripcionExperiencia() {
        return descripcionExperiencia;
    }

    public void setDescripcionExperiencia(String descripcionExperiencia) {
        this.descripcionExperiencia = descripcionExperiencia;
    }
}
