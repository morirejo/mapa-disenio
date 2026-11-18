package com.exploramexico.controller;

import com.exploramexico.dao.QuizDAO;
import com.exploramexico.model.Quiz;
import java.util.List;
import java.util.Optional;

public class QuizController {

    private final QuizDAO quizDAO;

    public QuizController(QuizDAO quizDAO) {
        this.quizDAO = quizDAO;
    }

    public List<Quiz> listarQuizzes() {
        return quizDAO.listarTodos();
    }

    public Optional<Quiz> buscarQuiz(Long idQuiz) {
        return quizDAO.buscarPorId(idQuiz);
    }
}
