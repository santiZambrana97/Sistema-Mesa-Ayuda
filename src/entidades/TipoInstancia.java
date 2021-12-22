package entidades;

import java.util.Date;

public class TipoInstancia extends Entidad{
    //Variables de instancia
    private int codTipoInstancia;
    private String nombreTipoInstancia;
    private Date fechaHoraFinVigenciaTipoInstancia;
    //Variables de las relaciones
    private TipoTarea tipoTarea;
    private Sector sector;
    //Constructor por defecto
    public TipoInstancia(){
    }
    //Setters y Getters 
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

    public Date getFechaHoraFinVigenciaTipoInstancia() {
        return fechaHoraFinVigenciaTipoInstancia;
    }

    public void setFechaHoraFinVigenciaTipoInstancia(Date fechaHoraFinVigenciaTipoInstancia) {
        this.fechaHoraFinVigenciaTipoInstancia = fechaHoraFinVigenciaTipoInstancia;
    }
    //Setters y Getters de las relaciones

    public TipoTarea getTipoTarea() {
        return tipoTarea;
    }

    public void setTipoTarea(TipoTarea tipoTarea) {
        this.tipoTarea = tipoTarea;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
    
    
            
    
}
