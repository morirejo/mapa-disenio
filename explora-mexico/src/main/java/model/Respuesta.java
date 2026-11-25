package model;

import java.util.ArrayList;
import java.util.List;

/** Respuesta de una pregunta. */
public class Respuesta {

    private String contRespuesta;
    private boolean estadoRespuesta;
    private String enunciado;
    private List<String> opciones = new ArrayList<>();

    public Respuesta() {
    }

    public Respuesta(String contRespuesta, boolean estadoRespuesta, String enunciado, List<String> opciones) {
        this.contRespuesta = contRespuesta;
        this.estadoRespuesta = estadoRespuesta;
        this.enunciado = enunciado;
        this.opciones = opciones;
    }

    public String getContRespuesta() {
        return contRespuesta;
    }

    public void setContRespuesta(String contRespuesta) {
        this.contRespuesta = contRespuesta;
    }

    public boolean isEstadoRespuesta() {
        return estadoRespuesta;
    }

    public void setEstadoRespuesta(boolean estadoRespuesta) {
        this.estadoRespuesta = estadoRespuesta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public List<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<String> opciones) {
        this.opciones = opciones;
    }
}
