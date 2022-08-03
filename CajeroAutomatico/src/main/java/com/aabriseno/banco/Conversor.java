package com.aabriseno.banco;

import java.math.BigDecimal;
import java.util.Scanner;


public class Conversor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float euros;

        System.out.println("Bienvenido a su conversor de dinero");
        System.out.println("Favor de ingresar la cantidad de euros que posee para decirle cuanto es en dlls: ");
        euros = entrada.nextFloat();
        float dolares = (float) (euros * 1.05);

        System.out.println("Tienes " + euros + " euros que eso equivale a " + dolares + " dolares");

        String eurosString = Double.toString(euros);
        BigDecimal eurosBigDecimal = new BigDecimal(euros);
        double tasaDeCambio = 1.09;
        String tasaDeCambioString = Double.toString(tasaDeCambio);
        BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambioString);

        BigDecimal dolaresBigDeciaml = eurosBigDecimal.multiply(tasaDeCambioBigDecimal);

        System.out.println(euros + " euros equivalen a " + dolaresBigDeciaml.toString() + " US dolares");
    }
}