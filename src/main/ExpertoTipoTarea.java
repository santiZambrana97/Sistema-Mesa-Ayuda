package main;
import DTO.*;
import entidades.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpertoTipoTarea {
    
    public DTOTipoTarea agregarTipoTarea(DTOTipoTarea dtotipotarea) { //Metodo del experto con el cual creamos un objeto Tipo Tarea 
      try{
        FachadaPersistencia.getInstance().iniciarTransaccion();          
        
        TipoTarea tipotarea = new TipoTarea();    
        FachadaPersistencia.getInstance().iniciarTransaccion();    
        DTOCriterio dtoCriterio = new DTOCriterio();
        List<DTOCriterio> listadtoCrit = new ArrayList<>();
            dtoCriterio.setAtributo("codTipoTarea"); 
            dtoCriterio.setOperacion("=");
            dtoCriterio.setValor(dtotipotarea.getCodTipoTarea());
            listadtoCrit.add(dtoCriterio);
       try{ 
        List objetoList = FachadaPersistencia.getInstance().buscar("TipoTarea",listadtoCrit );
        int verificar = 0;
        for(Object x : objetoList){
            TipoTarea tita = (TipoTarea)x;
            verificar = tita.getCodTipoTarea(); 
            dtotipotarea.setVerificarError(verificar);
        }
        
        if(dtotipotarea.getVerificarError() == 0 ){ //Verificamos que El codigo no se repita  
        if(dtotipotarea.getCodTipoTarea() == 0){ 
//Verificamos que el codigo no sea cero
            dtotipotarea.setVerificarError(1);
            dtotipotarea.setMensajeError("El Código no está permitido"); 
        }else{
        tipotarea.setCodTipoTarea(dtotipotarea.getCodTipoTarea());
        tipotarea.setNombreTipoTarea(dtotipotarea.getNombreTipoTarea());
        tipotarea.setDescripcionTipoTarea(dtotipotarea.getDescripcionTipoTarea());;
        FachadaPersistencia.getInstance().guardar(tipotarea);            
        }}else{
            dtotipotarea.setMensajeError("El código ya existe");        
        }}catch(Exception e){
               System.out.println("No se pudo registrar tipo tarea"); 
        }    
        }catch(Exception e){
                System.out.println("No se pudo encontrar tipo tarea");                
        }
        return dtotipotarea;
    }
    
    public DTOTipoTarea modificarTipoTarea (DTOTipoTarea dtotitarea){
        try{
            FachadaPersistencia.getInstance().iniciarTransaccion();    
            DTOCriterio dtoCrit = new DTOCriterio();//Lo necesitamos para hacer la busqueda en la base de datos
            List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
            dtoCrit.setAtributo("codTipoTarea");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(dtotitarea.getCodTipoTarea()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
        
            try{
        List objetoList = FachadaPersistencia.getInstance().buscar("TipoTarea",listadtoCrit );
       
         for (Object x : objetoList){
              TipoTarea tita = (TipoTarea) x;
              tita.setNombreTipoTarea(dtotitarea.getNombreTipoTarea());
              tita.setDescripcionTipoTarea(dtotitarea.getDescripcionTipoTarea());
              FachadaPersistencia.getInstance().modificar(tita);  
         }}catch(Exception e){
               System.out.println("No se pudo modificar tipo tarea"); 
        }    
        }catch(Exception e){
                System.out.println("No se pudo encontrar tipo tarea");                
        }
       
        return null;   
  
    }
    
    public void bajaTipoTarea(DTOTipoTarea dtotitarea){
       Date fecha = new Date();
            
        DTOCriterio dtoCrit = new DTOCriterio();
        List<DTOCriterio> listadtoCrit = new ArrayList<>();
            dtoCrit.setAtributo("codTipoTarea");
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(dtotitarea.getCodTipoTarea());
            listadtoCrit.add(dtoCrit);

        // datos que Setteamos fecha y hora              
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-MM-yyyy HH:mm"); 
        String fechaFin = objSDF.format(fecha);    
        
        List objetoList = FachadaPersistencia.getInstance().buscar("TipoTarea",listadtoCrit );        
        for(Object x : objetoList){
            TipoTarea tita = (TipoTarea) x ;
            try{
            tita.setFechaHoraFinVigenciaTipoTarea(objSDF.parse(fechaFin));
            }catch(Exception e){
                e.getMessage();
            }
        }
    }
    
    public List<DTOTipoTarea> filtrado(String nombreTipoTarea) {
        DTOCriterio dtoCriterio = new DTOCriterio();
        List<DTOCriterio> listadtoCriterio = new ArrayList<>();

        if(nombreTipoTarea.matches("[0-9]+") ) {
            dtoCriterio.setAtributo("codTipoTarea");
            dtoCriterio.setOperacion(">=");
            dtoCriterio.setValor(Integer.parseInt(nombreTipoTarea)); 
            listadtoCriterio.add(dtoCriterio);
        }else {
            dtoCriterio.setAtributo("nombreTipoTarea");
            dtoCriterio.setOperacion("like");
            dtoCriterio.setValor(nombreTipoTarea); 
            listadtoCriterio.add(dtoCriterio);
        }


        List objetoList = FachadaPersistencia.getInstance().buscar("TipoTarea",listadtoCriterio );
        List<DTOTipoTarea> dtoLista = new ArrayList<>();
        for (Object x : objetoList) {
            DTOTipoTarea dtotitarea = new DTOTipoTarea();
            TipoTarea tipotarea = (TipoTarea) x;
            dtotitarea.setCodTipoTarea(tipotarea.getCodTipoTarea());
            dtotitarea.setNombreTipoTarea(tipotarea.getNombreTipoTarea());
            dtotitarea.setDescripcionTipoTarea(tipotarea.getDescripcionTipoTarea());
            dtotitarea.setFechaHoraFinVigenciaTipoTarea(tipotarea.getFechaHoraFinVigenciaTipoTarea());
            dtoLista.add(dtotitarea);
        }
       return dtoLista;

    } 
}
