public class Hermano {
    String nombre;
    static String apellido = "García";

    static String obtenerApellido(){

        return apellido;
    }

    static void modificarApellido(String nuevoApellido){
        apellido = nuevoApellido;
    }
}
