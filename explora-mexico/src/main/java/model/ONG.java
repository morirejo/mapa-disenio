package model;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

/** ONG de conservación. */
public class ONG {

    @BsonId
    private ObjectId idONG;
    private String nombreONG;
    private String descripcionONG;
    private String contacto;

    public ONG() {
    }

    public ONG(ObjectId idONG, String nombreONG, String descripcionONG, String contacto) {
        this.idONG = idONG;
        this.nombreONG = nombreONG;
        this.descripcionONG = descripcionONG;
        this.contacto = contacto;
    }

    public ObjectId getIdONG() {
        return idONG;
    }

    public void setIdONG(ObjectId idONG) {
        this.idONG = idONG;
    }

    public String getNombreONG() {
        return nombreONG;
    }

    public void setNombreONG(String nombreONG) {
        this.nombreONG = nombreONG;
    }

    public String getDescripcionONG() {
        return descripcionONG;
    }

    public void setDescripcionONG(String descripcionONG) {
        this.descripcionONG = descripcionONG;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
}
