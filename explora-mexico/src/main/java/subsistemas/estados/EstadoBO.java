/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemas.estados;

import dao.EstadoDAO;
import dao.mongo.EstadoDAOImpl;
import dto.EstadoDTO;
import dto.ExperienciaDTO;
import dto.ONGDTO;
import infraestructura.CONABIOApiWrapper;
import model.Estado;
import model.Experiencia;
import model.ONG;
import java.util.ArrayList;
import java.util.List;

class EstadoBO {

    private final EstadoDAO estadoDAO;
    private final CONABIOApiWrapper conabioWrapper;

    EstadoBO() {
        this.estadoDAO = new EstadoDAOImpl();
        this.conabioWrapper = new CONABIOApiWrapper();
    }

    EstadoDTO buscarOCrearPorNombre(String nombreEstado) {
        Estado entidad = estadoDAO.buscarPorNombre(nombreEstado);
        if (entidad == null) {
            entidad = new Estado();
            entidad.setNombreEstado(nombreEstado);
            entidad.setDescripcion("Explora la biodiversidad, cultura y organizaciones de " + nombreEstado + ".");
            estadoDAO.guardar(entidad);
        }
        return convertirADTO(entidad);
    }

    List<EstadoDTO> listarTodos() {
        List<Estado> entidades = estadoDAO.listarTodos();
        List<EstadoDTO> dtos = new ArrayList<>();
        for (Estado e : entidades) {
            dtos.add(convertirADTO(e));
        }
        return dtos;
    }

    void registrarExperiencia(String nombreEstado, ExperienciaDTO dto) {
        if (dto == null || dto.getNombreExperiencia() == null || dto.getNombreExperiencia().isBlank()) {
            return;
        }
        Estado entidad = estadoDAO.buscarPorNombre(nombreEstado);
        if (entidad != null) {
            Experiencia nueva = new Experiencia();
            nueva.setNombreExperiencia(dto.getNombreExperiencia());
            nueva.setDescripcionExperiencia(dto.getDescripcionExperiencia());
            entidad.getExperiencias().add(nueva);
            estadoDAO.actualizar(entidad);
        }
    }

    void borrarExperiencia(String nombreEstado, int indice) {
        Estado entidad = estadoDAO.buscarPorNombre(nombreEstado);
        if (entidad != null && indice >= 0 && indice < entidad.getExperiencias().size()) {
            entidad.getExperiencias().remove(indice);
            estadoDAO.actualizar(entidad);
        }
    }

    void registrarONG(String nombreEstado, ONGDTO dto) {
        if (dto == null || dto.getNombreONG() == null || dto.getNombreONG().isBlank()) {
            return;
        }
        Estado entidad = estadoDAO.buscarPorNombre(nombreEstado);
        if (entidad != null) {
            ONG nueva = new ONG();
            nueva.setNombreONG(dto.getNombreONG());
            nueva.setDescripcionONG(dto.getDescripcionONG());
            nueva.setContacto(dto.getContacto());
            entidad.getOngs().add(nueva);
            estadoDAO.actualizar(entidad);
        }
    }

    String obtenerDatosCONABIO(Long idEspecie) {
        return conabioWrapper.consultarEspeciePorId(idEspecie);
    }

    private EstadoDTO convertirADTO(Estado entidad) {
        EstadoDTO dto = new EstadoDTO();
        if (entidad.getIdEstado() != null) {
            dto.setIdEstado(entidad.getIdEstado().toHexString());
        }
        dto.setNombreEstado(entidad.getNombreEstado());
        dto.setDescripcion(entidad.getDescripcion());
        dto.setUrlImg(entidad.getUrlImg());
        dto.setQuizzes(entidad.getQuizzes());
        dto.setFlora(entidad.getFlora());
        dto.setFauna(entidad.getFauna());
        dto.setOngs(entidad.getOngs());
        dto.setExperiencias(entidad.getExperiencias());
        return dto;
    }
}
