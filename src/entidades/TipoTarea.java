package entidades;

import java.util.Date;

public class TipoTarea extends Entidad{
    //variables de instancia
    private int codTipoTarea;
    private String nombreTipoTarea;
    private String descripcionTipoTarea;
    private Date fechaHoraFinVigenciaTipoTarea;
    
    //Constructor por defecto
    public TipoTarea(){
    }
    //Setters y Getters 
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
    
    
    
}
