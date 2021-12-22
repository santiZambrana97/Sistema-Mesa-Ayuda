/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO.DTOsTipoCaso;

import java.util.Date;

/**
 *
 * @author julie
 */
public class DTOTipoCaso {
    int codTipoCaso;
    String nombreTipoCaso;
    Date fechaFinVigenciaTipoCaso;
    String mensajeError;
    int verificarerror = 0;
    
//    Set y Get

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

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public int getVerificarerror() {
        return verificarerror;
    }

    public void setVerificarerror(int verificarerror) {
        this.verificarerror = verificarerror;
    }

    
    
    
    
    
}
