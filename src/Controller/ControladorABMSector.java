package Controller;

import DTO.DTOsSector.DTOSector;
import java.util.List;


import main.ExpertoSector;

public class ControladorABMSector {

    private ExpertoSector experto = new ExpertoSector();

   /* public void Metodo() {
        experto.Metodo();
    }*/
    public DTOSector agregarSector(DTOSector dtoSec){   
        return  experto.agregarSector(dtoSec);
    }
    public DTOSector modificarSector(DTOSector dtoSec){
        
        return experto.modificarSector(dtoSec);
    }
     
    public void bajaSector(DTOSector dtobaja){
        experto.bajaSector(dtobaja);
    }
    
    public List<DTOSector> FiltradoMostrarDTO(String nombreSector){
        return experto.filtrado(nombreSector);
    }
    
    
    
    
}
