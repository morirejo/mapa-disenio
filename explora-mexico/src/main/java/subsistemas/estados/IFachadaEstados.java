/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemas.estados;

import dto.EstadoDTO;
import dto.ExperienciaDTO;
import dto.ONGDTO;
import java.util.List;

public interface IFachadaEstados {
    EstadoDTO obtenerEstadoPorNombre(String nombreEstado);
    List<EstadoDTO> obtenerTodosLosEstados();
    void agregarExperiencia(String nombreEstado, ExperienciaDTO experienciaDTO);
    void eliminarExperiencia(String nombreEstado, int indice);
    void agregarONG(String nombreEstado, ONGDTO ongDTO);
    String consultarFichaExternaCONABIO(Long idEspecie);
}