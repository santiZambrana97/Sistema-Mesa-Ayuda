
package DTO.DTOsConfiguración;

public class DTOAgregarRenglon {
    
   private int numConfig; 
   private int ordenTCTI;
   private int minutosMAXReso;
   private int codTI;

    public int getOrdenTCTI() {
        return ordenTCTI;
    }

    public void setOrdenTCTI(int ordenTCTI) {
        this.ordenTCTI = ordenTCTI;
    }

    public int getMinutosMAXReso() {
        return minutosMAXReso;
    }

    public void setMinutosMAXReso(int minutosMAXReso) {
        this.minutosMAXReso = minutosMAXReso;
    }

    public int getCodTI() {
        return codTI;
    }

    public void setCodTI(int codTI) {
        this.codTI = codTI;
    }

    public int getNumConfig() {
        return numConfig;
    }

    public void setNumConfig(int numConfig) {
        this.numConfig = numConfig;
    }
    
    
}
