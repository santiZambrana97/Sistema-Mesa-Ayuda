
package DTO.DTOsSector;

import java.util.Date;

public class DTOSector {
    int  codSector;
    String nombreSector;
    String descripcionSector;
    Date fechaFinVigenciaSector;
    String mensajeError;
    int verificarerror = 0;

    

    //Setters y Getters
    public int getCodSector() {
        return codSector;
    }

    public void setCodSector(int codSector) {
        this.codSector = codSector;
    }

    public String getNombreSector() {
        return nombreSector;
    }

    public void setNombreSector(String nombreSector) {
        this.nombreSector = nombreSector;
    }

    public String getDescripcionSector() {
        return descripcionSector;
    }

    public void setDescripcionSector(String descripcionSector) {
        this.descripcionSector = descripcionSector;
    }

    public Date getFechaFinVigenciaSector() {
        return fechaFinVigenciaSector;
    }

    public void setFechaFinVigenciaSector(Date fechaFinVigenciaSector) {
        this.fechaFinVigenciaSector = fechaFinVigenciaSector;
    }
    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public int getVerificarerror() {
        return verificarerror;
    }

    public void setVerificarerror(int verificarerror) {
        this.verificarerror = verificarerror;
    }
    
    
    
}
