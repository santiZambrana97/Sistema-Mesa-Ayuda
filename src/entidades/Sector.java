package entidades;

import java.util.Date;

public class Sector extends Entidad{
    
    //Variables de las instancias
    private int codSector;
    private String nombreSector;
    private String descripcionSector;
    private Date fechaHoraFinVigenciaSector;

    
    //Constructor por defecto
    public Sector(){
    }
    //Setters y Getters 
    public int getCodSector() {
        return codSector;
    }

    public void setCodSector(int codSector) {
        this.codSector = codSector;
    }

    public String getNombreSector() {
        return nombreSector;
    }

    public void setNombreSector(String nombreSector) {
     //  try{
       // if(nombreSector != null)
        this.nombreSector = nombreSector;
       //}catch(Exception e){
         //  e.getMessage();
       //}
    }

    public String getDescripcionSector() {
        return descripcionSector;
    }

    public void setDescripcionSector(String descripcionSector) {
        this.descripcionSector = descripcionSector;
    }

    public Date getFechaHoraFinVigenciaSector() {
        return fechaHoraFinVigenciaSector;
    }

    public void setFechaHoraFinVigenciaSector(Date fechaHoraFinVigenciaSector) {
        this.fechaHoraFinVigenciaSector = fechaHoraFinVigenciaSector;
    }
    
    
    
}
