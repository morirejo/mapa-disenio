/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemas.quizzes;

import dto.QuizDTO;
import dto.UsuarioDTO;
import java.util.List;

public class FachadaQuizzes implements IFachadaQuizzes {

    private final QuizBO quizBO;

    public FachadaQuizzes() {
        this.quizBO = new QuizBO();
    }

    @Override
    public void registrarQuizEnEstado(String nombreEstado, QuizDTO quizDTO) {
        quizBO.crearQuiz(nombreEstado, quizDTO);
    }

    @Override
    public List<QuizDTO> obtenerQuizzesPorEstado(String nombreEstado) {
        return quizBO.listarPorEstado(nombreEstado);
    }

    @Override
    public double evaluarYGuardarPuntaje(QuizDTO quizRespondido, UsuarioDTO estudianteDTO) {
        return quizBO.calificar(quizRespondido, estudianteDTO);
    }
}