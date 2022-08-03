public class Caja <T>{

    T elemento;
    Caja(T elemento){
        this.elemento = elemento;
    }

    T obtenerObjeto(){
        return elemento;
    }

    <v> boolean perteneceElContenidoALaMismaClase(v otroObjeto) {
        
        return elemento.getClass() == otroObjeto.getClass();

    }
}
