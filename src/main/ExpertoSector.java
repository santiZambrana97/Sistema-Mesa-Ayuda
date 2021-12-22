package main;
import DTO.DTOCriterio;
import DTO.DTOsSector.*;
import entidades.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ExpertoSector {

    public DTOSector agregarSector(DTOSector dtoSec) { //Metodo del experto con el cual creamos un objeto Sector
      try{
        FachadaPersistencia.getInstance().iniciarTransaccion();          
        //Instanciaciones de objetos a usar      
        Sector sector = new Sector();          
        FachadaPersistencia.getInstance().iniciarTransaccion();    
        DTOCriterio dtoCrit = new DTOCriterio();//Lo necesitamos para hacer la busqueda en la base de datos
            List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
                dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                dtoCrit.setOperacion("=");
                dtoCrit.setValor(dtoSec.getCodSector()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
                listadtoCrit.add(dtoCrit);
                try{ 
                    List objetoList = FachadaPersistencia.getInstance().buscar("Sector",listadtoCrit );
                    int verificar = 0;
                        for(Object x : objetoList){
                            Sector sec = (Sector)x;
                            verificar = sec.getCodSector(); 
                            dtoSec.setVerificarerror(verificar);
                            }                            
                            if(dtoSec.getVerificarerror() == 0 ){ //Verificamos que El codigo no se repita
                                //Pasamos los parametros al Sector   
                                if(dtoSec.getCodSector() == 0){ //Verificamos que el codigo no sea cero
                                    dtoSec.setVerificarerror(1);
                                    dtoSec.setMensajeError("El Código no está permitido");                                                                        
                                }else{
                                    sector.setCodSector(dtoSec.getCodSector());
                                    sector.setNombreSector(dtoSec.getNombreSector());
                                    sector.setDescripcionSector(dtoSec.getDescripcionSector());;
                                    FachadaPersistencia.getInstance().guardar(sector);            
                            }}else{
                                dtoSec.setMensajeError("El código ya existe");        
                 }}catch(Exception e){
                        System.out.println("No se pudo registrar el sector"); 
                 }    
            }catch(Exception e){
                    System.out.println("No se pudo encontrar el sector");                
            }
        return dtoSec;
    }
    
    
    
    public DTOSector modificarSector(DTOSector dtoSec){
       
        try{
            FachadaPersistencia.getInstance().iniciarTransaccion();    
            DTOCriterio dtoCrit = new DTOCriterio();//Lo necesitamos para hacer la busqueda en la base de datos
          List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
                dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                dtoCrit.setOperacion("=");
                dtoCrit.setValor(dtoSec.getCodSector()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
                listadtoCrit.add(dtoCrit);
           try{
            List objetoList = FachadaPersistencia.getInstance().buscar("Sector",listadtoCrit );

             for (Object x : objetoList){
                  Sector sec = (Sector) x;
                  sec.setNombreSector(dtoSec.getNombreSector());
                  sec.setDescripcionSector(dtoSec.getDescripcionSector());
                  FachadaPersistencia.getInstance().modificar(sec);  
            }}catch(Exception e){
               System.out.println("No se pudo modificar el sector"); 
                 }    
        }catch(Exception e){
                System.out.println("No se pudo encontrar el sector");                
        }
       
        return null;  
        
        
    }
    
    
    
    public void bajaSector(DTOSector dtoSec){
        Date fecha = new Date();
            
        DTOCriterio dtoCrit = new DTOCriterio();//Lo necesitamos para hacer la busqueda en la base de datos
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
            dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(dtoSec.getCodSector()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            
        
            // datos que Setteamos fecha y hora              
            SimpleDateFormat objSDF = new SimpleDateFormat("dd-MM-yyyy HH:mm"); // La cadena de formato de fecha se pasa como un argumento al objeto 
            String fechaFin = objSDF.format(fecha);    

                List objetoList = FachadaPersistencia.getInstance().buscar("Sector",listadtoCrit );        
                for(Object x : objetoList){
                    Sector sec = (Sector) x ;
                    try{
                    sec.setFechaHoraFinVigenciaSector(objSDF.parse(fechaFin));
                    }catch(Exception e){
                        e.getMessage();
                    }
                    
        }
       
    }
   
    
    
    public List<DTOSector> filtrado(String nombreSector) {
        DTOCriterio dtoCrit = new DTOCriterio();
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia

        if(nombreSector.matches("[0-9]+") ) {//El matches es propia d ejava y evalua lo que hay entre parentesis
            dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion(">=");
            dtoCrit.setValor(Integer.parseInt(nombreSector)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
        }else {
            dtoCrit.setAtributo("nombreSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("like");
            dtoCrit.setValor(nombreSector); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
        }


        List objetoList = FachadaPersistencia.getInstance().buscar("Sector",listadtoCrit );
        List<DTOSector> dtoList = new ArrayList<>();
        for (Object x : objetoList) {
            DTOSector dtosec = new DTOSector();
            Sector sector = (Sector) x;
            dtosec.setCodSector(sector.getCodSector());
            dtosec.setNombreSector(sector.getNombreSector());
            dtosec.setDescripcionSector(sector.getDescripcionSector());
            if(sector.getFechaHoraFinVigenciaSector() != null){
            dtosec.setFechaFinVigenciaSector(sector.getFechaHoraFinVigenciaSector());
            }
            dtoList.add(dtosec);
            
            
        }
       return dtoList ;

    }   
}  