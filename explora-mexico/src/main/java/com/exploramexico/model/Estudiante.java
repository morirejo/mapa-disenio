package com.exploramexico.model;

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/** Estudiante: hereda de Usuario y realiza Quizzes. */
public class Estudiante extends Usuario {

    private Double puntuacionQuizzes;
    private List<Quiz> quizzesRealizados = new ArrayList<>();

    public Estudiante() {
    }

    public Estudiante(ObjectId idUsuario, String nombreUsuario, String correo, String contrasena, String rolUsuario, Double puntuacionQuizzes, List<Quiz> quizzesRealizados) {
        super(idUsuario, nombreUsuario, correo, contrasena, rolUsuario);
        this.puntuacionQuizzes = puntuacionQuizzes;
        this.quizzesRealizados = quizzesRealizados;
    }

    public Double getPuntuacionQuizzes() {
        return puntuacionQuizzes;
    }

    public void setPuntuacionQuizzes(Double puntuacionQuizzes) {
        this.puntuacionQuizzes = puntuacionQuizzes;
    }

    public List<Quiz> getQuizzesRealizados() {
        return quizzesRealizados;
    }

    public void setQuizzesRealizados(List<Quiz> quizzesRealizados) {
        this.quizzesRealizados = quizzesRealizados;
    }
}
