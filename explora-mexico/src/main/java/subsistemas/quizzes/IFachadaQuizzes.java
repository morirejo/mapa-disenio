/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemas.quizzes;

import dto.QuizDTO;
import dto.UsuarioDTO;
import java.util.List;

public interface IFachadaQuizzes {
    void registrarQuizEnEstado(String nombreEstado, QuizDTO quizDTO);
    List<QuizDTO> obtenerQuizzesPorEstado(String nombreEstado);
    double evaluarYGuardarPuntaje(QuizDTO quizRespondido, UsuarioDTO estudianteDTO);
}