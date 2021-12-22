package DTO;

import java.util.Date;

public class DTOTipoTarea {
    
    int codTipoTarea;
    String nombreTipoTarea;
    String descripcionTipoTarea;
    Date fechaHoraFinVigenciaTipoTarea;
    String mensajeError;
    int verificarError = 0;
   
    
    
    public int getCodTipoTarea() {
        return codTipoTarea;
    }

    public void setCodTipoTarea(int codTipoTarea) {
        this.codTipoTarea = codTipoTarea;
    }

    public String getNombreTipoTarea() {
        return nombreTipoTarea;
    }

    public void setNombreTipoTarea(String nombreTipoTarea) {
        this.nombreTipoTarea = nombreTipoTarea;
    }

    public String getDescripcionTipoTarea() {
        return descripcionTipoTarea;
    }

    public void setDescripcionTipoTarea(String descripcionTipoTarea) {
        this.descripcionTipoTarea = descripcionTipoTarea;
    }

    public Date getFechaHoraFinVigenciaTipoTarea() {
        return fechaHoraFinVigenciaTipoTarea;
    }

    public void setFechaHoraFinVigenciaTipoTarea(Date fechaHoraFinVigenciaTipoTarea) {
        this.fechaHoraFinVigenciaTipoTarea = fechaHoraFinVigenciaTipoTarea;
    }
    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public int getVerificarError() {
        return verificarError;
    }

    public void setVerificarError(int verificarError) {
        this.verificarError = verificarError;
    }
    

}
