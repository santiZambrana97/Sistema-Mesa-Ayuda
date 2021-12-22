/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO.DTOsConfiguración;

import java.util.Date;

/**
 *
 * @author julie
 */
public class DTOModificarConf {
    int nroConfiguracion;
    int codTipoCaso;
    String nombreTipoCaso;
    Date fechaDesde;

    public void setCodTipoCaso(int codTipoCaso) {
        this.codTipoCaso = codTipoCaso;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public void setNombreTipoCaso(String nombreTipoCaso) {
        this.nombreTipoCaso = nombreTipoCaso;
    }

    public void setNroConfiguracion(int nroConfiguracion) {
        this.nroConfiguracion = nroConfiguracion;
    }

    public int getCodTipoCaso() {
        return codTipoCaso;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public String getNombreTipoCaso() {
        return nombreTipoCaso;
    }

    public int getNroConfiguracion() {
        return nroConfiguracion;
    }
    
    
            
    
}
