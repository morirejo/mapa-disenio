/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.bo;

import com.exploramexico.model.Pregunta;
import com.exploramexico.model.Respuesta;
import java.util.List;

public class ValidadorDeQuizzes {

    public double obtenerPuntuacion(List<Pregunta> preguntas, List<Respuesta> respuestasUsuario) {
        if (preguntas == null || preguntas.isEmpty() || respuestasUsuario == null) {
            return 0.0;
        }
        int aciertos = 0;
        int total = preguntas.size();

        for (int i = 0; i < total && i < respuestasUsuario.size(); i++) {
            Respuesta correcta = preguntas.get(i).getRespuestaCorrecta();
            Respuesta elegida = respuestasUsuario.get(i);

            if (correcta != null && elegida != null && correcta.getEnunciado().equalsIgnoreCase(elegida.getEnunciado())) {
                aciertos++;
            }
        }
        return ((double) aciertos / total) * 100.0;
    }
}