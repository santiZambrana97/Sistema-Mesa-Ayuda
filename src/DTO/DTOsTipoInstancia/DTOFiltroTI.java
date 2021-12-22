
package DTO.DTOsTipoInstancia;

import java.util.Date;

public class DTOFiltroTI {
    private int codTipoInstancia;
    private String nombreTipoInstancia;
    private String nombreSector;
    private String nombreTipoTarea;
    private Date fechaHoraFinVigenciaTI;

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

    public String getNombreSector() {
        return nombreSector;
    }

    public void setNombreSector(String nombreSector) {
        this.nombreSector = nombreSector;
    }

    public String getNombreTipoTarea() {
        return nombreTipoTarea;
    }

    public void setNombreTipoTarea(String nombreTipoTarea) {
        this.nombreTipoTarea = nombreTipoTarea;
    }

    public Date getFechaHoraFinVigenciaTI() {
        return fechaHoraFinVigenciaTI;
    }

    public void setFechaHoraFinVigenciaTI(Date fechaHoraFinVigenciaTI) {
        this.fechaHoraFinVigenciaTI = fechaHoraFinVigenciaTI;
    }
    
    
    
    
}
