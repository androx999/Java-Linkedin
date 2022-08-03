import java.util.ArrayList;

public class ListaDeLaCompra {
    public static void main(String[] args) {
        ArrayList<String> miListaDeLaCompra = new ArrayList<String>();
        miListaDeLaCompra.add("Patatas");
        miListaDeLaCompra.add("Leche");
        miListaDeLaCompra.add("Manzanas");

        System.out.println("Mi lista contiene "+miListaDeLaCompra);


        ArrayList<String> miListaDeEnero = new ArrayList<>(miListaDeLaCompra);

        miListaDeEnero.add("Harina");

        System.out.println("miListaDeLaCompra: "+miListaDeLaCompra+" miListaDeEnero: "+miListaDeEnero);

    ArrayList<String> miListaDeFebrero = miListaDeLaCompra;

        System.out.println("EL primer elemento de mi lista de la compra es "+miListaDeEnero.get(0));


        miListaDeEnero.set(1, "Leche entera");

        System.out.println("miListaDeEnero: "+miListaDeEnero);

        miListaDeEnero.remove(0);

        System.out.println("miListaDeEnero: "+miListaDeEnero);

        miListaDeEnero.remove( "Manzanas");

        System.out.println("miListaDeEnero: "+miListaDeEnero);

        miListaDeEnero.size();
    }
}
