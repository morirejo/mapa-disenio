/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.bo;

import com.exploramexico.dao.EstadoDAO;
import com.exploramexico.dao.mongo.EstadoDAOImpl;
import com.exploramexico.model.Estado;
import com.exploramexico.model.Experiencia;
import com.exploramexico.model.ONG;
import com.exploramexico.model.Quiz;
import java.util.List;

public class EstadoBO {

    private final EstadoDAO estadoDAO;

    public EstadoBO() {
        this.estadoDAO = new EstadoDAOImpl();
    }

    public Estado obtenerPorNombre(String nombreEstado) {
        return estadoDAO.buscarPorNombre(nombreEstado);
    }

    public List<Estado> obtenerTodos() {
        return estadoDAO.listarTodos();
    }

    public void guardarOActualizarEstado(Estado estado) {
        if (estado.getIdEstado() == null) {
            estadoDAO.guardar(estado);
        } else {
            estadoDAO.actualizar(estado);
        }
    }

    public void agregarExperiencia(String nombreEstado, Experiencia experiencia) {
        Estado estado = estadoDAO.buscarPorNombre(nombreEstado);
        if (estado != null) {
            estado.getExperiencias().add(experiencia);
            estadoDAO.actualizar(estado);
        }
    }

    public void eliminarExperiencia(String nombreEstado, int indice) {
        Estado estado = estadoDAO.buscarPorNombre(nombreEstado);
        if (estado != null && indice >= 0 && indice < estado.getExperiencias().size()) {
            estado.getExperiencias().remove(indice);
            estadoDAO.actualizar(estado);
        }
    }

    public void agregarONG(String nombreEstado, ONG ong) {
        Estado estado = estadoDAO.buscarPorNombre(nombreEstado);
        if (estado != null) {
            estado.getOngs().add(ong);
            estadoDAO.actualizar(estado);
        }
    }

    public void agregarQuiz(String nombreEstado, Quiz quiz) {
        Estado estado = estadoDAO.buscarPorNombre(nombreEstado);
        if (estado != null) {
            estado.getQuizzes().add(quiz);
            estadoDAO.actualizar(estado);
        }
    }
}