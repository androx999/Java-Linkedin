/*
El CajeroAutomatico será una clase que emula las funcionalidades de un cajero automático. La clase tendrá una variable de instancia llamada cuentaBancariaActual de tipo CuentaBancaria. La clase tendrá un constructor que tendrá como parámetros un String que identifica al usuario y otro String que contiene una contraseña. Como se trata de una emulación, en lugar de conectar con la base de datos del banco para que nos devuelva la cuenta bancaria del usuario

* */
package com.aabriseno.cajero;
import com.aabriseno.banco.CuentaAhorro;
import com.aabriseno.banco.CuentaBancaria;
import com.aabriseno.mock.GeneradorAleatorioDeMovimientos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutómatico {
    private CuentaBancaria cuentaBancariaActual;


   protected CajeroAutómatico(String identificador, String contraseña){
        double cantidadAleatorio = ThreadLocalRandom.current().nextDouble(0,50000);

        cuentaBancariaActual = new CuentaAhorro("Nombre cualquiera",cantidadAleatorio);
    }

    protected void mostrarSaldo(){
        System.out.println("Su saldo es "+cuentaBancariaActual.obtenerSaldo());

    }

    protected void ingresarDinero(){
        System.out.println("¿Cuanto dinero quiere ingresar? ");
        Scanner entrada = new Scanner(System.in);
        double cantidad = entrada.nextDouble();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }

    protected void sacarDinero(){
        System.out.println("¿Cuanto dinero desea sacar? ");
        Scanner entrada = new Scanner(System.in);
        double cantidad = entrada.nextDouble();
        cuentaBancariaActual.sacarDinero(cantidad);
    }

    protected void consultarUltimosMovimientos() {
        GeneradorAleatorioDeMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
        System.out.println("¿Cuántos movimientos quiere consultar?");
        Scanner scanner = new Scanner(System.in);
        int numeroDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimiento(numeroDeMovimientos,"euros");
        mostrarMovimientos(movimientos);
    }

    protected void mostrarMovimientos(ArrayList<String> movimientos) {
        for (String movimiento:movimientos) {
            System.out.println(movimiento);
        }
    }

    protected void mostrarCondicionesLegales(){
       cuentaBancariaActual.informarSobreCondicionesLegales();
    }
    protected void salir(){
        System.out.println("Muchas gracias por usar nuestros servicios");
    }
}

