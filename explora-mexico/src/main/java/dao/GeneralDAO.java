package dao;

import java.util.List;
import java.util.Optional;

/** CRUD para todos los DAOs. */
public interface GeneralDAO<T, ID> {

    T guardar(T entidad);

    void actualizar(T entidad);

    void eliminar(ID id);

    Optional<T> buscarPorId(ID id);

    List<T> listarTodos();
}
