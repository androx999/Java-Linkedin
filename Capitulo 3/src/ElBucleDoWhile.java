import java.util.Scanner;

public class ElBucleDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        do{
            System.out.println("Introduzca un número y le mostraremos la raíz cuadrada. Para salir introduzca el 0");
            numero = entrada.nextDouble();
            if (numero == 0) {
                System.out.println("Hasta la vista");
            }else{
                System.out.println("La raiz cuadrada de "+numero+" es "+Math.sqrt(numero));
            }
            }while (numero != 0);
        }

    }

