public class Main {
    public static void main(String[] args) {

        System.out.println("La variable estática apellido de la clase Hermano es "+Hermano.apellido);

        Hermano hermanoPequeno = new Hermano();
        hermanoPequeno.nombre = "Juan";
        Hermano hermanoMayor = new Hermano();
        hermanoMayor.nombre = "Pedro";
        System.out.println("El hermano pequeño se llama "+hermanoPequeno.nombre+" "+hermanoPequeno.apellido);
        System.out.println("El hermano mayo se llama "+hermanoMayor.nombre+" "+hermanoMayor.apellido);
        hermanoPequeno.nombre = "Luis";

        System.out.println("El hermano pequeño se llama "+hermanoPequeno.nombre+" "+hermanoPequeno.apellido);
        System.out.println("El hermano mayo se llama "+hermanoMayor.nombre+" "+hermanoMayor.apellido);

       hermanoPequeno.apellido = "Díaz";

        System.out.println("El hermano pequeño se llama "+hermanoPequeno.nombre+" "+hermanoPequeno.apellido);
        System.out.println("El hermano mayo se llama "+hermanoMayor.nombre+" "+hermanoMayor.apellido);
    }
}
