package Controller;

import DTO.DTOTipoTarea;

import java.util.List;
import main.ExpertoTipoTarea;

public class ControladorABMTipoTarea {
    
    private ExpertoTipoTarea experto = new ExpertoTipoTarea();

    public void agregarTipoTarea(DTOTipoTarea dtotipotarea){
        experto.agregarTipoTarea(dtotipotarea);
    }
    public DTOTipoTarea modificarTipoTarea(DTOTipoTarea dtotita){
        experto.modificarTipoTarea(dtotita);
        return null; 
    }
     
    public void bajaTipoTarea(DTOTipoTarea dtotitarea){
        experto.bajaTipoTarea(dtotitarea);
    }
    
    public List<DTOTipoTarea> FiltradoMostrarDTO(String nombreTipoTarea){
        return experto.filtrado(nombreTipoTarea);
    }

}
