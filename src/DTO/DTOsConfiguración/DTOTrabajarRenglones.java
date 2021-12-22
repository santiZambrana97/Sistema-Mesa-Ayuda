/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO.DTOsConfiguración;

import entidades.TipoCasoTipoInstancia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julie
 */
public class DTOTrabajarRenglones {
    int codConfSelecc ;   
    List<DTORenglones> tipoCtipoIns= new ArrayList<>();

    public void setCodConfSelecc(int codConfSelecc) {
        this.codConfSelecc = codConfSelecc;
    }

    public int getCodConfSelecc() {
        return codConfSelecc;
    }
    
    
    
    public List<DTORenglones> getTipoCtipoIns() {
        return tipoCtipoIns;
    }

    public void setTipoCtipoIns(List<DTORenglones> tipoCtipoIns) {
        this.tipoCtipoIns = tipoCtipoIns;
    }
     public void addTipoCasoTipoInstancia(DTORenglones tcti) {
       tipoCtipoIns.add(tcti) ;
    }

  
    
    
    
    
}
