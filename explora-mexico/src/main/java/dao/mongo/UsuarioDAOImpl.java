/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.mongo;

import dao.UsuarioDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import config.ConexionMongo;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import model.Usuario;
import org.bson.types.ObjectId;

public class UsuarioDAOImpl implements UsuarioDAO {

    private final MongoCollection<Usuario> coleccion;

    public UsuarioDAOImpl() {
        this.coleccion = ConexionMongo.getDatabase().getCollection("usuarios", Usuario.class);
    }

    @Override
    public Usuario guardar(Usuario entidad) {
        if (entidad.getIdUsuario() == null) {
            entidad.setIdUsuario(new ObjectId());
        }
        coleccion.insertOne(entidad);
        return entidad;
    }

    @Override
    public void actualizar(Usuario entidad) {
        coleccion.replaceOne(Filters.eq("_id", entidad.getIdUsuario()), entidad);
    }

    @Override
    public void eliminar(ObjectId id) {
        coleccion.deleteOne(Filters.eq("_id", id));
    }

    @Override
    public Optional<Usuario> buscarPorId(ObjectId id) {
        Usuario usuario = coleccion.find(Filters.eq("_id", id)).first();
        return Optional.ofNullable(usuario);
    }

    @Override
    public List<Usuario> listarTodos() {
        return coleccion.find().into(new ArrayList<>());
    }

    @Override
    public Usuario buscarPorCredenciales(String nombreUsuario, String contrasena) {
        return coleccion.find(Filters.and(
                Filters.eq("nombreUsuario", nombreUsuario),
                Filters.eq("contrasena", contrasena)
        )).first();
    }

    @Override
    public Usuario buscarPorNombre(String nombreUsuario) {
        return coleccion.find(Filters.eq("nombreUsuario", nombreUsuario)).first();
    }
}