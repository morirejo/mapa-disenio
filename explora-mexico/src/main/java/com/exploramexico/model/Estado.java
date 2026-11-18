package com.exploramexico.model;

import java.util.ArrayList;
import java.util.List;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

/** Estado de México; contiene su flora, fauna, ONG, experiencias y quizzes. */
public class Estado {

    @BsonId
    private ObjectId idEstado;
    private String nombreEstado;
    private String descripcion;
    private String urlImg;
    private List<Quiz> quizzes = new ArrayList<>();
    private List<Flora> flora = new ArrayList<>();
    private List<Fauna> fauna = new ArrayList<>();
    private List<ONG> ongs = new ArrayList<>();
    private List<Experiencia> experiencias = new ArrayList<>();

    public Estado() {
    }

    public Estado(ObjectId idEstado, String nombreEstado, String descripcion, String urlImg, List<Quiz> quizzes, List<Flora> flora, List<Fauna> fauna, List<ONG> ongs, List<Experiencia> experiencias) {
        this.idEstado = idEstado;
        this.nombreEstado = nombreEstado;
        this.descripcion = descripcion;
        this.urlImg = urlImg;
        this.quizzes = quizzes;
        this.flora = flora;
        this.fauna = fauna;
        this.ongs = ongs;
        this.experiencias = experiencias;
    }

    public ObjectId getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(ObjectId idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(List<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    public List<Flora> getFlora() {
        return flora;
    }

    public void setFlora(List<Flora> flora) {
        this.flora = flora;
    }

    public List<Fauna> getFauna() {
        return fauna;
    }

    public void setFauna(List<Fauna> fauna) {
        this.fauna = fauna;
    }

    public List<ONG> getOngs() {
        return ongs;
    }

    public void setOngs(List<ONG> ongs) {
        this.ongs = ongs;
    }

    public List<Experiencia> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(List<Experiencia> experiencias) {
        this.experiencias = experiencias;
    }
}
