package model;

import java.util.ArrayList;
import java.util.List;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

/** Cuestionario de preguntas. */
public class Quiz {

    @BsonId
    private ObjectId idQuiz;
    private String tituloQuiz;
    private List<Pregunta> preguntas = new ArrayList<>();

    public Quiz() {
    }

    public Quiz(ObjectId idQuiz, String tituloQuiz, List<Pregunta> preguntas) {
        this.idQuiz = idQuiz;
        this.tituloQuiz = tituloQuiz;
        this.preguntas = preguntas;
    }

    public ObjectId getIdQuiz() {
        return idQuiz;
    }

    public void setIdQuiz(ObjectId idQuiz) {
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
}
