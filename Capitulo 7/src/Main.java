public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal("Canis Lupus",4);
        Animal gato = new Animal("Fix silvestris",4);
        Animal otroperro = new Animal("Canis Lupus",4);

        System.out.println("¿Es igual el objeto de gato que el de perro?"+perro.equals(gato));
        System.out.println("¿Es igual el objeto de otroPerro que el de perro?"+perro.equals(otroperro));
        System.out.println("Hashcode para perro: "+perro.hashCode());
        System.out.println("Hashcode para gato: "+gato.hashCode());
        System.out.println("Hashcode para otroPerro: "+otroperro.hashCode());

        System.out.println("Nuestro objeto perro en forma de String: "+perro.toString());
    }
}
