package model;

import java.util.ArrayList;
import java.util.List;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

/** Especie animal. */
public class Fauna {

    @BsonId
    private ObjectId idFauna;
    private String nombreCientifico;
    private String nombreComun;
    private String descripcion;
    private String estadoConservacion;
    private List<String> ecosistema = new ArrayList<>();
    private String urlImg;

    public Fauna() {
    }

    public Fauna(ObjectId idFauna, String nombreCientifico, String nombreComun, String descripcion, String estadoConservacion, List<String> ecosistema, String urlImg) {
        this.idFauna = idFauna;
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.descripcion = descripcion;
        this.estadoConservacion = estadoConservacion;
        this.ecosistema = ecosistema;
        this.urlImg = urlImg;
    }

    public ObjectId getIdFauna() {
        return idFauna;
    }

    public void setIdFauna(ObjectId idFauna) {
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
