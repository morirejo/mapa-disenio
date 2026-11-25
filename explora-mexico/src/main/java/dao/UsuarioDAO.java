package dao;

import model.Usuario;
import org.bson.types.ObjectId;

public interface UsuarioDAO extends GeneralDAO<Usuario, ObjectId> {
    Usuario buscarPorCredenciales(String nombreUsuario, String contrasena);
    Usuario buscarPorNombre(String nombreUsuario);
}