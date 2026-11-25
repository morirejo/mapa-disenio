/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemas.quizzes;

import dao.EstadoDAO;
import dao.UsuarioDAO;
import dao.mongo.EstadoDAOImpl;
import dao.mongo.UsuarioDAOImpl;
import model.Estado;
import model.Estudiante;
import model.Pregunta;
import model.Quiz;
import model.Respuesta;
import model.Usuario;
import dto.QuizDTO;
import dto.UsuarioDTO;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

class QuizBO {

    private final EstadoDAO estadoDAO;
    private final UsuarioDAO usuarioDAO;

    QuizBO() {
        this.estadoDAO = new EstadoDAOImpl();
        this.usuarioDAO = new UsuarioDAOImpl();
    }

    void crearQuiz(String nombreEstado, QuizDTO dto) {
        Estado estado = estadoDAO.buscarPorNombre(nombreEstado);
        if (estado != null && dto != null) {
            Quiz nuevo = new Quiz();
            nuevo.setIdQuiz(new ObjectId());
            nuevo.setTituloQuiz(dto.getTituloQuiz());
            nuevo.setPreguntas(dto.getPreguntas());
            estado.getQuizzes().add(nuevo);
            estadoDAO.actualizar(estado);
        }
    }

    List<QuizDTO> listarPorEstado(String nombreEstado) {
        Estado estado = estadoDAO.buscarPorNombre(nombreEstado);
        List<QuizDTO> lista = new ArrayList<>();
        if (estado != null && estado.getQuizzes() != null) {
            for (Quiz q : estado.getQuizzes()) {
                QuizDTO dto = new QuizDTO();
                dto.setIdQuiz(q.getIdQuiz().toHexString());
                dto.setTituloQuiz(q.getTituloQuiz());
                dto.setPreguntas(q.getPreguntas());
                lista.add(dto);
            }
        }
        return lista;
    }

    double calificar(QuizDTO quizDTO, UsuarioDTO usuarioDTO) {
        List<Pregunta> preguntas = quizDTO.getPreguntas();
        List<Respuesta> respuestas = quizDTO.getRespuestasUsuario();

        if (preguntas == null || preguntas.isEmpty() || respuestas == null) {
            return 0.0;
        }

        int aciertos = 0;
        int total = preguntas.size();

        for (int i = 0; i < total && i < respuestas.size(); i++) {
            Respuesta correcta = preguntas.get(i).getRespuestaCorrecta();
            Respuesta elegida = respuestas.get(i);
            if (correcta != null && elegida != null && correcta.getEnunciado().equalsIgnoreCase(elegida.getEnunciado())) {
                aciertos++;
            }
        }

        double calificacion = ((double) aciertos / total) * 100.0;

        if (usuarioDTO != null && usuarioDTO.getNombreUsuario() != null) {
            Usuario u = usuarioDAO.buscarPorNombre(usuarioDTO.getNombreUsuario());
            if (u instanceof Estudiante est) {
                double puntajePrevio = est.getPuntuacionQuizzes() != null ? est.getPuntuacionQuizzes() : 0.0;
                est.setPuntuacionQuizzes(puntajePrevio + calificacion);
                usuarioDAO.actualizar(est);
                usuarioDTO.setPuntuacionQuizzes(est.getPuntuacionQuizzes());
            }
        }

        return calificacion;
    }
}