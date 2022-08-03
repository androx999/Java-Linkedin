import java.util.Scanner;

public class ElBucleFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        for (int i = 0, j = 100; i < j; i++,j--) {

            System.out.println("Iteración número "+i+" sumando "+i+" y "+j );
            suma = suma+i+j;
        }
        System.out.println("El resultado de sumar los números del 1 al 100 es "+suma);
    }
}

/*
int primerOperando = scanner.nextInt();
        System.out.println("Por favor, introduzca el primer numero: ");
        int segundoOperando = scanner.nextInt();
        System.out.println("Por favor, introduzca el segundo numero: ");
        int resultado = 0;
        for (int i = 0; i < segundoOperando; i++) {
            System.out.println("Iteración número: "+i);
            resultado += primerOperando;
        }
        System.out.println("El resultado de multiplicar "+primerOperando+ " por "+segundoOperando+" es "+resultado);
 */