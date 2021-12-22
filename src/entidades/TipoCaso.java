package entidades;

import java.util.Date;

public class TipoCaso extends Entidad {
    
    //Variables de instancia
    private int codTipoCaso;
    private String nombreTipoCaso;
    private Date fechaFinVigenciaTipoCaso;
    
    //Constructor por defecto
    public TipoCaso(){ 
    }
    
    
    //Getters y Setters
    public int getCodTipoCaso() {
        return codTipoCaso;
    }

    public void setCodTipoCaso(int codTipoCaso) {
        this.codTipoCaso = codTipoCaso;
    }

    public String getNombreTipoCaso() {
        return nombreTipoCaso;
    }

    public void setNombreTipoCaso(String nombreTipoCaso) {
        this.nombreTipoCaso = nombreTipoCaso;
    }

    public Date getFechaFinVigenciaTipoCaso() {
        return fechaFinVigenciaTipoCaso;
    }

    public void setFechaFinVigenciaTipoCaso(Date fechaFinVigenciaTipoCaso) {
        this.fechaFinVigenciaTipoCaso = fechaFinVigenciaTipoCaso;
    }
  
    
}
