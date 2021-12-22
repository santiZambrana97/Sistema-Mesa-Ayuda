
package DTO.DTOsTipoInstancia;

import java.util.Date;

public class DTOVisualizarDatosTI {
    private int codTipoInstancia;    
    private String nombreTipoInstancia;   
    private Date fechaHoraFinVigenciaTipoInstancia;
    private int codSector;
    private String nombreSector;
    private Date fechaHoraFinVigenciaTipoTarea  ;
    private int codTipoTarea;
    private String nombreTipoTarea;
    private Date fechaHoraFinVigenciaSector;

    public int getCodTipoInstancia() {
        return codTipoInstancia;
    }

    public void setCodTipoInstancia(int codTipoInstancia) {
        this.codTipoInstancia = codTipoInstancia;
    }

    public String getNombreTipoInstancia() {
        return nombreTipoInstancia;
    }

    public void setNombreTipoInstancia(String nombreTipoInstancia) {
        this.nombreTipoInstancia = nombreTipoInstancia;
    }

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

    public Date getFechaHoraFinVigenciaTipoInstancia() {
        return fechaHoraFinVigenciaTipoInstancia;
    }

    public void setFechaHoraFinVigenciaTipoInstancia(Date fechaHoraFinVigenciaTipoInstancia) {
        this.fechaHoraFinVigenciaTipoInstancia = fechaHoraFinVigenciaTipoInstancia;
    }

    public Date getFechaHoraFinVigenciaTipoTarea() {
        return fechaHoraFinVigenciaTipoTarea;
    }

    public void setFechaHoraFinVigenciaTipoTarea(Date fechaHoraFinVigenciaTipoTarea) {
        this.fechaHoraFinVigenciaTipoTarea = fechaHoraFinVigenciaTipoTarea;
    }

    public Date getFechaHoraFinVigenciaSector() {
        return fechaHoraFinVigenciaSector;
    }

    public void setFechaHoraFinVigenciaSector(Date fechaHoraFinVigenciaSector) {
        this.fechaHoraFinVigenciaSector = fechaHoraFinVigenciaSector;
    }
    
    
}
