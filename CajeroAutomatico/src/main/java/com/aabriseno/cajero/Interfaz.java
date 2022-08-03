/*
 Debemos crear un programa que emula la interfaz de un cajero automático.
 El programa presentará las siguientes opciones al usuario.
  Elija una de las siguientes opciones.
  Escriba 1 para consultar su saldo.
  Escriba 2 para ingresar dinero.
  Escriba 3 para sacar dinero.
  Escriba 4 para consultar sus últimos movimientos.
   Una vez escrita la opción, pulse la tecla Enter.
    Una vez el usuario ha elegido la opción, el programa le mostrará por pantalla el número correspondiente a la opción elegida.
* */
package com.aabriseno.cajero;
import java.util.Scanner;

public class Interfaz {
    public static void main (String[] args) {
        System.out.println("Por favor introduzca su numero de identificación");
        Scanner scanner = new Scanner(System.in);
        String identificador = scanner.nextLine();
        System.out.println("Por favor introduzca su contraseña");
        String contrasena = scanner.nextLine();
        CajeroAutómatico cajero = new CajeroAutómatico(identificador,contrasena);

        int opcion;
        do{


            System.out.println("Bienvenido a su cajero automatico: ");
            System.out.println("\nQue desea hacer?: ");
            System.out.println("Escriba 1 para consultar su saldo: ");
            System.out.println("Escriba 2 para ingresar dinero");
            System.out.println("Escriba 3 para sacar dinero");
            System.out.println("Escriba 4 para consultar sus ultimos movimientos");
            System.out.println("Escriba 5 para consultar las condiciones legales");
            System.out.println("Para salir escriba cualquier numero");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                  cajero.mostrarSaldo();
                    break;
                case 2:
                    cajero.ingresarDinero();
                    break;
                case 3:
                    cajero.sacarDinero();
                    break;
                case 4:
               cajero.consultarUltimosMovimientos();
                    break;
                case 5:
                    cajero.mostrarCondicionesLegales();
                    break;
                default:
                    cajero.salir();
                    break;
            }

        }while(opcion>=1 || opcion<=5);

    }
}

