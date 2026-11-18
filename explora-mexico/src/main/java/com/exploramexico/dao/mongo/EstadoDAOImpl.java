/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exploramexico.dao.mongo;


import com.exploramexico.dao.EstadoDAO;
import com.exploramexico.model.Estado;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import config.ConexionMongo;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;

public class EstadoDAOImpl implements EstadoDAO {

    private final MongoCollection<Estado> coleccion;

    public EstadoDAOImpl() {
        this.coleccion = ConexionMongo.getDatabase().getCollection("estados", Estado.class);
    }

    @Override
    public Estado guardar(Estado entidad) {
        if (entidad.getIdEstado() == null) {
            entidad.setIdEstado(new ObjectId());
        }
        coleccion.insertOne(entidad);
        return entidad;
    }

    @Override
    public void actualizar(Estado entidad) {
        coleccion.replaceOne(Filters.eq("_id", entidad.getIdEstado()), entidad);
    }

    @Override
    public void eliminar(ObjectId id) {
        coleccion.deleteOne(Filters.eq("_id", id));
    }

    @Override
    public Optional<Estado> buscarPorId(ObjectId id) {
        Estado estado = coleccion.find(Filters.eq("_id", id)).first();
        return Optional.ofNullable(estado);
    }

    @Override
    public List<Estado> listarTodos() {
        return coleccion.find().into(new ArrayList<>());
    }

    @Override
    public Estado buscarPorNombre(String nombreEstado) {
        return coleccion.find(Filters.eq("nombreEstado", nombreEstado)).first();
    }
}