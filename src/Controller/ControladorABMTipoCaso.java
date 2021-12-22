
package Controller;

import DTO.DTOsTipoCaso.DTOTipoCaso;
import main.ExpertoTipoCaso;
import java.util.List;

public class ControladorABMTipoCaso {
    private ExpertoTipoCaso experto = new ExpertoTipoCaso();

    public DTOTipoCaso agregarTipoCaso(DTOTipoCaso dtoTCaso){   
        return  experto.agregarTipoCaso(dtoTCaso);
    }
    public DTOTipoCaso modificarTipoCaso(DTOTipoCaso dtoTCaso){
        
        return experto.modificarTipoCaso(dtoTCaso);
    }
     
    public void bajaTipoCaso(DTOTipoCaso dtoTCaso){
        experto.bajaTipoCaso(dtoTCaso);
    }
    
    public List<DTOTipoCaso> FiltradoMostrarDTO(String nombreTipoCaso){
        return experto.filtrado(nombreTipoCaso);
    }
}
