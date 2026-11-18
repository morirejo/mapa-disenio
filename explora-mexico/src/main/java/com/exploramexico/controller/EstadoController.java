package com.exploramexico.controller;

import com.exploramexico.dao.EstadoDAO;
import com.exploramexico.model.Estado;
import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;

public class EstadoController {

    private final EstadoDAO estadoDAO;

    public EstadoController(EstadoDAO estadoDAO) {
        this.estadoDAO = estadoDAO;
    }

    public List<Estado> listarEstados() {
        return estadoDAO.listarTodos();
    }

    public Optional<Estado> buscarEstado(ObjectId idEstado) {
        return estadoDAO.buscarPorId(idEstado);
    }
}
