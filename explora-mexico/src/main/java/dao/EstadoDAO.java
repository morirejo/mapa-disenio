package dao;

import model.Estado;
import org.bson.types.ObjectId;

public interface EstadoDAO extends GeneralDAO<Estado, ObjectId> {
    Estado buscarPorNombre(String nombreEstado);
}
