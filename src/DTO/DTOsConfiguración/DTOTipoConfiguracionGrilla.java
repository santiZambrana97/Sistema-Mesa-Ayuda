/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO.DTOsConfiguración;


import java.util.Date;

/**
 *
 * @author leand
 */
public class DTOTipoConfiguracionGrilla {
    int nroConfig;
    Date fechaInicioVigencia;
    Date fechaFinVigencia;
    Date fechaVerificacion;
    int codTipoCaso;
    String nombreTipoCaso;

    public int getNroConfig() {
        return nroConfig;
    }

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public int getCodTipoCaso() {
        return codTipoCaso;
    }

    public Date getFechaVerificacion() {
        return fechaVerificacion;
    }

    public void setCodTipoCaso(int codTipoCaso) {
        this.codTipoCaso = codTipoCaso;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public void setFechaVerificacion(Date fechaVerificacion) {
        this.fechaVerificacion = fechaVerificacion;
    }

    public void setNroConfig(int nroConfig) {
        this.nroConfig = nroConfig;
    }

    public String getNombreTipoCaso() {
        return nombreTipoCaso;
    }

    public void setNombreTipoCaso(String nombreTipoCaso) {
        this.nombreTipoCaso = nombreTipoCaso;
    }
}
