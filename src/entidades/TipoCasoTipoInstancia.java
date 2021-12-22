package entidades;
public class TipoCasoTipoInstancia extends Entidad {
    
    private int minutosMaximoResolucion; //cuando hagamos el diagrama hay que cambiar el nombre del atributo
    private int ordenTipoCasoTipoInstancia;
    //Variables de relaciones 
    private TipoInstancia tipoInstancia;
    //Constructor por defecto
    public TipoCasoTipoInstancia(){}
    

    //Getters y Setters 

    public int getMinutosMaximoResolucion() {
        return minutosMaximoResolucion;
    }

    public void setMinutosMaximoResolucion(int minutosMaximoResolucion) {
        this.minutosMaximoResolucion = minutosMaximoResolucion;
    }
    

    public int getOrdenTipoCasoTipoInstancia() {
        return ordenTipoCasoTipoInstancia;
    }

    public void setOrdenTipoCasoTipoInstancia(int ordenTipoCasoTipoInstancia) {
        this.ordenTipoCasoTipoInstancia = ordenTipoCasoTipoInstancia;
    }
    //Getters y Setters de relaciones

    public TipoInstancia getTipoInstancia() {
        return tipoInstancia;
    }

    public void setTipoInstancia(TipoInstancia tipoInstancia) {
        this.tipoInstancia = tipoInstancia;
    }
    
    
    
}
