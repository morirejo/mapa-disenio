/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemas.estados;

import dto.EstadoDTO;
import dto.ExperienciaDTO;
import dto.ONGDTO;
import java.util.List;

public class FachadaEstados implements IFachadaEstados {

    private final EstadoBO estadoBO;

    public FachadaEstados() {
        this.estadoBO = new EstadoBO();
    }

    @Override
    public EstadoDTO obtenerEstadoPorNombre(String nombreEstado) {
        return estadoBO.buscarOCrearPorNombre(nombreEstado);
    }

    @Override
    public List<EstadoDTO> obtenerTodosLosEstados() {
        return estadoBO.listarTodos();
    }

    @Override
    public void agregarExperiencia(String nombreEstado, ExperienciaDTO experienciaDTO) {
        estadoBO.registrarExperiencia(nombreEstado, experienciaDTO);
    }

    @Override
    public void eliminarExperiencia(String nombreEstado, int indice) {
        estadoBO.borrarExperiencia(nombreEstado, indice);
    }

    @Override
    public void agregarONG(String nombreEstado, ONGDTO ongDTO) {
        estadoBO.registrarONG(nombreEstado, ongDTO);
    }

    @Override
    public String consultarFichaExternaCONABIO(Long idEspecie) {
        return estadoBO.obtenerDatosCONABIO(idEspecie);
    }
}