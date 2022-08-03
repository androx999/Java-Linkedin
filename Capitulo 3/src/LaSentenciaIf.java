import java.util.Scanner;

public class LaSentenciaIf {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numeroPensado = 5;
        System.out.println("\nAdivina en el numero que estoy pensando del 1 al 10: ");
        int numeroIntroducido = entrada.nextInt();

        String color;
        if(numeroIntroducido == numeroPensado) {
            color = "\033[0;32m";
            System.out.println(color+"!Enhorabuena¡");
        }
        else {
            color = "\033[0;31m";
            System.out.println(color+"!Lo sentimos, el numero en el que estaba pensando es " + numeroPensado);
        }
        }
}
