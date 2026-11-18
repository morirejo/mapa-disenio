package com.exploramexico.model;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

/** Pregunta con su respuesta correcta. */
public class Pregunta {

    @BsonId
    private ObjectId idPregunta;
    private String contPregunta;
    private String enunciado;
    private Respuesta respuestaCorrecta;

    public Pregunta() {
    }

    public Pregunta(ObjectId idPregunta, String contPregunta, String enunciado, Respuesta respuestaCorrecta) {
        this.idPregunta = idPregunta;
        this.contPregunta = contPregunta;
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public ObjectId getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(ObjectId idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getContPregunta() {
        return contPregunta;
    }

    public void setContPregunta(String contPregunta) {
        this.contPregunta = contPregunta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Respuesta getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(Respuesta respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
}
