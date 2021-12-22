package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConfiguracionTipoCaso extends Entidad{
    
    //Variables de instancia
    private int nroConfigTC;
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;
    private Date fechaVerificacion;
    //Variables de relaciones
    private TipoCaso tipoCaso;
    private List<TipoCasoTipoInstancia> tipoCtipoIns= new ArrayList<>();
    
    //Constructor por defecto
    public ConfiguracionTipoCaso(){}

    //Getters y Setters
    public int getNroConfigTC() {
        return nroConfigTC;
    }

    public void setNroConfigTC(int nroConfigTC) {
        this.nroConfigTC = nroConfigTC;
    }

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public Date getFechaVerificacion() {
        return fechaVerificacion;
    }

    public void setFechaVerificacion(Date fechaVerificacion) {
        this.fechaVerificacion = fechaVerificacion;
    }
    //Getters y Setters 

    public TipoCaso getTipoCaso() {
        return tipoCaso;
    }

    public void setTipoCaso(TipoCaso tipoCaso) {
        this.tipoCaso = tipoCaso;
    }

    public List<TipoCasoTipoInstancia> getTipoCtipoIns() {
        return tipoCtipoIns;
    }

    public void setTipoCtipoIns(List<TipoCasoTipoInstancia> tipoCtipoIns) {
        this.tipoCtipoIns = tipoCtipoIns;
    }
     public void addTipoCasoTipoInstancia(TipoCasoTipoInstancia tcti) {
       tipoCtipoIns.add(tcti) ;
    }
     public void removeTCTI (TipoCasoTipoInstancia tipocasotipoinstancia){
         tipoCtipoIns.remove(tipocasotipoinstancia);
     }
     
     public void updateTCTI(int index, TipoCasoTipoInstancia tipocasotipoinstancia){
         tipoCtipoIns.set(index, tipocasotipoinstancia);
     }
       
    
}
