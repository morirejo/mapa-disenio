package com.exploramexico.model;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

/** Especie vegetal. */
public class Flora {

    @BsonId
    private ObjectId idFlora;
    private String nombreFlora;
    private String estadoHabitat;
    private String descripcion;
    private String estadoConservacion;
    private String urlImg;

    public Flora() {
    }

    public Flora(ObjectId idFlora, String nombreFlora, String estadoHabitat, String descripcion, String estadoConservacion, String urlImg) {
        this.idFlora = idFlora;
        this.nombreFlora = nombreFlora;
        this.estadoHabitat = estadoHabitat;
        this.descripcion = descripcion;
        this.estadoConservacion = estadoConservacion;
        this.urlImg = urlImg;
    }

    public ObjectId getIdFlora() {
        return idFlora;
    }

    public void setIdFlora(ObjectId idFlora) {
        this.idFlora = idFlora;
    }

    public String getNombreFlora() {
        return nombreFlora;
    }

    public void setNombreFlora(String nombreFlora) {
        this.nombreFlora = nombreFlora;
    }

    public String getEstadoHabitat() {
        return estadoHabitat;
    }

    public void setEstadoHabitat(String estadoHabitat) {
        this.estadoHabitat = estadoHabitat;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(String estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }
}
