
package DTO.DTOsConfiguración;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DTOVisualizarVerificar {
   public int nroConfigTipoCaso;
   public int codTipoCaso;
   public String nombreTipoCaso;
   public Date fechaInicioVig;
   public Date fechaFinVig;
   public Date fechaVerificacion;
   public List<DTORenglones> renglones = new ArrayList<>();
   
   
   public int getNroConfigTipoCaso() {
        return nroConfigTipoCaso;
    }

    public void setNroConfigTipoCaso(int nroConfigTipoCaso) {
        this.nroConfigTipoCaso = nroConfigTipoCaso;
    }

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

    public Date getFechaInicioVig() {
        return fechaInicioVig;
    }

    public void setFechaInicioVig(Date fechaInicioVig) {
        this.fechaInicioVig = fechaInicioVig;
    }

    public Date getFechaFinVig() {
        return fechaFinVig;
    }

    public void setFechaFinVig(Date fechaFinVig) {
        this.fechaFinVig = fechaFinVig;
    }

    public Date getFechaVerificacion() {
        return fechaVerificacion;
    }

    public void setFechaVerificacion(Date fechaVerificacion) {
        this.fechaVerificacion = fechaVerificacion;
    }

    public List<DTORenglones> getRenglones() {
        return renglones;
    }

    public void setRenglones(List<DTORenglones> renglones) {
        this.renglones = renglones;
    }
    public void addRenglones(DTORenglones dtoRenglon){
        renglones.add(dtoRenglon);
    }
   





}




