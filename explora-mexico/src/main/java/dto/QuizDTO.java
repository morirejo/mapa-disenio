/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import model.Pregunta;
import model.Respuesta;
import java.util.ArrayList;
import java.util.List;

public class QuizDTO {

    private String idQuiz;
    private String tituloQuiz;
    private List<Pregunta> preguntas = new ArrayList<>();
    private List<Respuesta> respuestasUsuario = new ArrayList<>();
    private Double puntuacionQuizzes;

    public QuizDTO() {
    }

    public String getIdQuiz() {
        return idQuiz;
    }

    public void setIdQuiz(String idQuiz) {
        this.idQuiz = idQuiz;
    }


    public String getTituloQuiz() {
        return tituloQuiz;
    }

    public void setTituloQuiz(String tituloQuiz) {
        this.tituloQuiz = tituloQuiz;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public List<Respuesta> getRespuestasUsuario() {
        return respuestasUsuario;
    }

    public void setRespuestasUsuario(List<Respuesta> respuestasUsuario) {
        this.respuestasUsuario = respuestasUsuario;
    }

    public Double getPuntuacionQuizzes() {
        return puntuacionQuizzes;
    }

    public void setPuntuacionQuizzes(Double puntuacionQuizzes) {
        this.puntuacionQuizzes = puntuacionQuizzes;
    }

    
}