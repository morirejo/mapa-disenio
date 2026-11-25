/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

public class FloraDTO {
    private Long idFlora;
    private String nombreFlora;
    private String estadoHabitat;
    private String descripcion;
    private String estadoConservacion;
    private String urlImg;

    public FloraDTO() {
    }

    public Long getIdFlora() {
        return idFlora;
    }

    public void setIdFlora(Long idFlora) {
        this.idFlora = idFlora;
    }

    public String getNombreFlora() {
        return nombreFlora;
    }

    public void setNombreFlora(String nombreFlora) {
        this.nombreFlora = nombreFlora;
    }

    public String getEstadoHabitat() {
        return estadoHabitat;
    }

    public void setEstadoHabitat(String estadoHabitat) {
        this.estadoHabitat = estadoHabitat;
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

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

     
}