/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO.DTOsConfiguración;

/**
 *
 * @author julie
 */
public class DTOVerRenglon {
   public int nroConfig;
   public int ordenTCTI;
   public int minutosMAXReso;
   public int codTI;
   public String nombreTI;

    public void setCodTI(int codTI) {
        this.codTI = codTI;
    }

    public void setMinutosMAXReso(int minutosMAXReso) {
        this.minutosMAXReso = minutosMAXReso;
    }

    public void setNombreTI(String nombreTI) {
        this.nombreTI = nombreTI;
    }

    public void setNroConfig(int nroConfig) {
        this.nroConfig = nroConfig;
    }

    public void setOrdenTCTI(int ordenTCTI) {
        this.ordenTCTI = ordenTCTI;
    }

    public int getCodTI() {
        return codTI;
    }

    public int getMinutosMAXReso() {
        return minutosMAXReso;
    }

    public String getNombreTI() {
        return nombreTI;
    }

    public int getNroConfig() {
        return nroConfig;
    }

    public int getOrdenTCTI() {
        return ordenTCTI;
    }
   
   
   
}
