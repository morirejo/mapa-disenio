package com.exploramexico.dao;

import com.exploramexico.model.Estado;
import org.bson.types.ObjectId;

public interface EstadoDAO extends GeneralDAO<Estado, ObjectId> {
    Estado buscarPorNombre(String nombreEstado);
}
