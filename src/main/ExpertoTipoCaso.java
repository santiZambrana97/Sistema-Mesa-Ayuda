/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import DTO.DTOCriterio;
import DTO.DTOsTipoCaso.*;
import entidades.TipoCaso;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author julie
 */
public class ExpertoTipoCaso {
    public List<DTOTipoCaso> filtrado(String nombreTipoCaso) {
        DTOCriterio dtoCrit = new DTOCriterio();
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia

        if(nombreTipoCaso.matches("[0-9]+") ) {//El matches es propia d ejava y evalua lo que hay entre parentesis
            dtoCrit.setAtributo("codTipoCaso");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion(">=");
            dtoCrit.setValor(Integer.parseInt(nombreTipoCaso)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
        }else {
            dtoCrit.setAtributo("nombreTipoCaso");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("like");
            dtoCrit.setValor(nombreTipoCaso); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
        }


        List objetoList = FachadaPersistencia.getInstance().buscar("TipoCaso",listadtoCrit );
        List<DTOTipoCaso> dtoList = new ArrayList<>();
        for (Object x : objetoList) {
            DTOTipoCaso dtoTipoCaso = new DTOTipoCaso();
            TipoCaso tipocaso = (TipoCaso) x;
            dtoTipoCaso.setCodTipoCaso(tipocaso.getCodTipoCaso());
            dtoTipoCaso.setNombreTipoCaso(tipocaso.getNombreTipoCaso());

            if(tipocaso.getFechaFinVigenciaTipoCaso()!= null){
            dtoTipoCaso.setFechaFinVigenciaTipoCaso(tipocaso.getFechaFinVigenciaTipoCaso());
            }
            dtoList.add(dtoTipoCaso);
            
            
        }
       return dtoList ;

    }  

    
//    Agregar un tipo caso
    public DTOTipoCaso agregarTipoCaso(DTOTipoCaso dtoTCaso) {
        try {
            FachadaPersistencia.getInstance().iniciarTransaccion(); 
            TipoCaso tipoCaso = new TipoCaso();
            FachadaPersistencia.getInstance().iniciarTransaccion(); 
            
            DTOCriterio dtoCrit = new DTOCriterio();
            List<DTOCriterio> listadtoCrit = new ArrayList<>();
            dtoCrit.setAtributo("codTipoCaso");   
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(dtoTCaso.getCodTipoCaso()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);   
            try {
                List objetoList = FachadaPersistencia.getInstance().buscar("TipoCaso",listadtoCrit );
                int verificar = 0;
                for(Object x : objetoList){
                    TipoCaso tipoCaso1 = (TipoCaso)x;
                    verificar = tipoCaso1.getCodTipoCaso(); 
                    dtoTCaso.setVerificarerror(verificar);
                }
                if(dtoTCaso.getVerificarerror() == 0 ){
                    if(dtoTCaso.getCodTipoCaso() == 0){ //Verificamos que el codigo no sea cero
                        dtoTCaso.setVerificarerror(1);
                        dtoTCaso.setMensajeError("El Código no está permitido");                                                                        
                    }else{
                        tipoCaso.setCodTipoCaso(dtoTCaso.getCodTipoCaso());
                        tipoCaso.setNombreTipoCaso(dtoTCaso.getNombreTipoCaso());                  
                        FachadaPersistencia.getInstance().guardar(tipoCaso);            
                    }
                }else{
                    dtoTCaso.setMensajeError("El código ya existe"); 
                }
                
                
            } catch (Exception e) {
                System.out.println("No se pudo registrar el tipo caso"); 
            }
        } catch (Exception e) {
            System.out.println("No se pudo encontrar el tipo caso"); 
        }

        return dtoTCaso;
    }

    public DTOTipoCaso modificarTipoCaso(DTOTipoCaso dtoTCaso) {
        try {
            FachadaPersistencia.getInstance().iniciarTransaccion();
            DTOCriterio dtoCrit = new DTOCriterio();
            List<DTOCriterio> listadtoCrit = new ArrayList<>();
            dtoCrit.setAtributo("codTipoCaso"); 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(dtoTCaso.getCodTipoCaso()); 
            listadtoCrit.add(dtoCrit);    
            
            try {
                List objetoList = FachadaPersistencia.getInstance().buscar("TipoCaso",listadtoCrit );

                for (Object x : objetoList){
                   TipoCaso tipoCaso = (TipoCaso) x;
                   tipoCaso.setNombreTipoCaso(dtoTCaso.getNombreTipoCaso());       
                   FachadaPersistencia.getInstance().modificar(tipoCaso);  
                }
                
            } catch (Exception e) {
                System.out.println("No se pudo modificar Tipo Caso");
            }
            
        } catch (Exception e) {
            System.out.println("No se pudo encontrar el Tipo Caso");
        }
        return null;
    }

    public void bajaTipoCaso(DTOTipoCaso dtoTCaso) {
        Date fecha = new Date(System.currentTimeMillis());
        DTOCriterio dtoCrit = new DTOCriterio();
        List<DTOCriterio> listadtoCrit = new ArrayList<>();
        
        dtoCrit.setAtributo("codTipoCaso");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
        dtoCrit.setOperacion("=");
        dtoCrit.setValor(dtoTCaso.getCodTipoCaso()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
        
        listadtoCrit.add(dtoCrit);
        
        
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-MM-yyyy HH:mm"); // La cadena de formato de fecha se pasa como un argumento al objeto 
        String fechaFin = objSDF.format(fecha); 
        
        List objetoList = FachadaPersistencia.getInstance().buscar("TipoCaso",listadtoCrit ); 
        for(Object x : objetoList){
            TipoCaso tipocaso = (TipoCaso) x ;
            try{
                tipocaso.setFechaFinVigenciaTipoCaso(objSDF.parse(fechaFin));
            }catch(Exception e){
                e.getMessage();
            }
        }
    }
}
