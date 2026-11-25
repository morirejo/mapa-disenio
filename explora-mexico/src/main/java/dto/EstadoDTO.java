/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import model.Experiencia;
import model.Fauna;
import model.Flora;
import model.ONG;
import model.Quiz;
import java.util.ArrayList;
import java.util.List;

public class EstadoDTO {

    private String idEstado;
    private String nombreEstado;
    private String descripcion;
    private String urlImg;
    private List<Quiz> quizzes = new ArrayList<>();
    private List<Flora> flora = new ArrayList<>();
    private List<Fauna> fauna = new ArrayList<>();
    private List<ONG> ongs = new ArrayList<>();
    private List<Experiencia> experiencias = new ArrayList<>();

    public EstadoDTO() {
    }

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
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