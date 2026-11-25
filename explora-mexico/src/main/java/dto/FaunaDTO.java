/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.ArrayList;
import java.util.List;

public class FaunaDTO {
    private String idFauna;
    private String nombreCientifico;
    private String nombreComun;
    private String descripcion;
    private String estadoConservacion;
    private List<String> ecosistema = new ArrayList<>();
    private String urlImg;

    public FaunaDTO() {
    }

    public String getIdFauna() {
        return idFauna;
    }

    public void setIdFauna(String idFauna) {
        this.idFauna = idFauna;
    }
    
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(String estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    public List<String> getEcosistema() {
        return ecosistema;
    }

    public void setEcosistema(List<String> ecosistema) {
        this.ecosistema = ecosistema;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    
}