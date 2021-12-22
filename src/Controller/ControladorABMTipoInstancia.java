
package Controller;

import DTO.DTOsTipoInstancia.*;
import java.util.List;
import main.ExpertoTipoInstancia;

public class ControladorABMTipoInstancia {
 ExpertoTipoInstancia expertoTI = new ExpertoTipoInstancia();
    
    //Método para agreagar un Tipo Instancia
    public DTOErrorMensajes agregarTipoInstancia(DTOAgregarTipoInstancia dtoAgregarTI){
       return expertoTI.agregarTipoInstancia(dtoAgregarTI);      
    }
    //Método para modificar un Tipo Instancia
    public DTOErrorMensajes modificarTipoInstancia(DTOModificarTipoInstancia dtoModificarTI){
       return expertoTI.modificarTipoInstancia(dtoModificarTI);
    }
    //Método para la baja de un Tipo Instancia
    public void bajaTipoInstancia(int codTipoInstancia){
         expertoTI.bajaTipoInstancia(codTipoInstancia);
    }
    //Método para filtrar los Tipo Instancia en la tabla de la interfaz pasando el código o el nombre del Ti 
   
    public List<DTOFiltroTI> filtroTINombreTI2(int cod,String filTipoInstanciaNom){
        return expertoTI.filtroTINombreTI2(cod,filTipoInstanciaNom);
    }
    
    //Método para buscar los datos de un Tipo Instancia pasando el código para modificarla
    public DTOModificarTipoInstancia buscarPorCodTipoInstancia(int codTipoInstancia){ //Método para buscar el nombre TipoInstancia y devolver el nombre a pantalla
        return expertoTI.buscarPorCodTipoInstancia(codTipoInstancia);       
    }
    //Método para buscar los datos de un Tipo Instancia pasando el código
    public DTOVisualizarDatosTI visualizarDatosTipoInstancia(int codTipoInstancia){ //Buscamos por codigo los datos para mostrar las cosas en la pantalla
        return expertoTI.visualizarDatosTipoInstancia(codTipoInstancia);
    }
    //Método para buscar los datos de un Sector pasando el código
    public String buscarNombSector(int codSector){ //Método para buscar el nombre Sector y devolver el nombre a pantalla
       return expertoTI.buscarNombSector(codSector); 
    }
    //Método para buscar los datos de un Sector pasando el código
    public String buscarNombTipoTarea(int codTipoTarea){ //Método para buscar el nombre TipoTarea y devolver el nombre a pantalla
       return expertoTI.buscarNombTipoTarea(codTipoTarea); 
    }

    public List<DTOLupaBuscarSector> buscarLupitaSector(){
        return expertoTI.buscarLupitaSector();
    }

    public List<DTOLupaBuscarTarea> buscarLupitaTarea() {
        return expertoTI.buscarLupitaTarea();
    }
   
    
}
