import java.util.Scanner;

public class ElBucleWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el numero del que quiera realizar la raiz: ");
        double numero = entrada.nextDouble();
        double candidatoRaizCuadrado = 0.0;
        while (candidatoRaizCuadrado * candidatoRaizCuadrado <= numero){
            candidatoRaizCuadrado += 0.01;
            System.out.println("¿Será el número "+candidatoRaizCuadrado+" ?"+"Su cuadrado es "+candidatoRaizCuadrado);
        }
        candidatoRaizCuadrado -= 0.01;
        System.out.println("La raiz cuadrada que hemos calculado es "+candidatoRaizCuadrado);
        System.out.println("La raiz cuadrada real es: "+Math.sqrt(numero));

    }
}
