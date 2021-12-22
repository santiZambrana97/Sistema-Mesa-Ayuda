
package Controller;

import DTO.DTOsConfiguración.*;
import DTO.DTOsConfiguración.DTOErroresMensajes;
import DTO.DTOsConfiguración.DTOModificarConf;
import DTO.DTOsConfiguración.DTOTipoConfiguracionGrilla;
import DTO.DTOsConfiguración.DTOTrabajarRenglones;
import DTO.DTOsConfiguración.DTOVerRenglon;
import DTO.DTOsConfiguración.DTOVisualizarVerificar;
import java.util.List;
import main.ExpertoConfigurar;

public class ControladorConfiguracionTipoCaso {
    
    ExpertoConfigurar expertoC = new ExpertoConfigurar();
    
    public DTOErroresMensajes agregarConfiguracion(DTOAgregarConfiguracion dtoAgregarConf){
       return expertoC.agregarConfiguracion(dtoAgregarConf);
    }
    /*public DTOErroresMensajes validarFecha(Date fechaDesde){
        return expertoC.validarFecha(fechaDesde);
    }*/
    public DTOErroresMensajes modificarConfiguracion(DTOModificarConf dtoModificarConfig){
       return expertoC.modificarConfiguracion(dtoModificarConfig);
    }
    public DTOVisualizarVerificar visualizarDatosYVerificar(int codConf){
      return expertoC.visualizarDatosYVerificar(codConf);
    }
    public DTOErroresMensajes verificarConfiguracion(int numConf){
        return expertoC.verificarConfiguracion(numConf);
    }
    public List<DTOTipoConfiguracionGrilla> filtroConfiguracion( int codTC, int codNumConf){
        return expertoC.filtroConfiguracion(codTC, codNumConf);
    }
    
    public String inputCodTipoCaso (String codCaso){   //Método para buscar un código de tipo caso para dar de alta una configuración
        return expertoC.inputCodTipoCaso(codCaso);
    }
    
    public DTOModificarConf buscarPorNumConfig(int codSeleccionado){ 
        return expertoC.buscarPorNumConfig(codSeleccionado);       
    }
    
    public DTOErroresMensajes agregarRenglon(DTOAgregarRenglon dtoAR){
        return expertoC.agregarRenglon(dtoAR);
    }
    
    public String buscarNombTipoInstancia(int codTI){
        return expertoC.buscarNombTipoInstancia(codTI);
    }
    public DTOErroresMensajes eliminarRenglon(int nroConfigCaso, int ordenTCTISelec){
        return expertoC.eliminarRenglon(nroConfigCaso, ordenTCTISelec);
    }
    
    public DTOTrabajarRenglones buscarRenglones(int codConfSelecc) {
        return expertoC.buscarRenglones(codConfSelecc);
    }

    public DTOVerRenglon verDatosRenglon(int nroConfigCaso, int ordenTCTISelec) {
        return expertoC.verDatosRenglon( nroConfigCaso, ordenTCTISelec);
    }
    
    public DTOErroresMensajes modificarRenglon(DTOModificarRenglon dtoMofidRenglon) {
        return expertoC.modificarRenglon(dtoMofidRenglon);
    }
    
    public String inputCodTipoInstancia(String codTipoInstancia) {
        return expertoC.inputCodTipoInstancia(codTipoInstancia);
    }
    
    public DTOModificarRenglon buscarRenglonModificar(int nroConfigCaso, int ordenTCTISelec) {
        return expertoC.buscarRenglonModificar( nroConfigCaso, ordenTCTISelec);
    }

    public List<DTOLupitaTipoCaso> buscarLupitaTipoCaso() {
        return expertoC.buscarLupitaTipoCaso();
    }

    public List<DTOLupitaTipoInstancia> buscarLupitaTipoInstancia() {
        return expertoC.buscarLupitaTipoInstancia();
    }
    
    
}
