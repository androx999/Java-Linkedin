/*
* Clase generará una lista de movimientos bancarios típicos de forma aleatoria.
*
* La clase tendrá un único método público con dos parámetros, uno de tipo int con el número de movimientos deseado y otro de tipo String en el que se le indicará el tipo de moneda para los movimientos.
*
* Los tipos de movimiento disponibles serán:
*
* Transferencia -> "Transferencia de x moneda".
*
* Ingreso -> en el que pondremos "Ingreso de x moneda".
*
* Retirada -> "Retirada de x moneda"
*
* Pago con tarjeta -> "Pago con tarjeta de x moneda"
*
* Nomina -> "Ingreso nómina de x moneda"
*
* Pago recibo -> "Pago de recibo de x moneda"
*
* Se generará una lista con el número de movimientos indicados por parámetro, en el que cada movimiento será de uno de los anteriores tipos, seleccionado de modo aleatorio y en el que la cantidad de dinero será un número de tipo double, aleatorio entre 1 y 3000. Comenzamos con una serie de constantes con el comienzo de la frase para cada posible movimiento. Las constantes serán estas, para para transferencia comenzaremos por "Transferencia de", para ingreso, "Ingreso de", "Retirada de", "Pago con tarjeta de", "Ingreso a nómina de", "Pago de recibo de". Añadimos el método público obtenerMovimientos con dos parámetros. Este método devolverá una lista de Strings con los movimientos. Número de movimientos y aquí pondremos la moneda.
*
*
* */

package com.aabriseno.mock;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorAleatorioDeMovimientos {

    private static final String TRANSFERENCIA = "Transferencia de ";
    private  static  final String INGRESO = "Ingreso de ";
    private static final String RETIRADA = "Retirada de ";
    private static final String PAGO_CON_TARJETA = "Pago con tarjeta de ";
    private static final String NOMINA = "Ingreso nómina de ";
    private static final String PAGO_RECIBO = "Pago de recibo de ";

    public ArrayList<String> obtenerMovimiento(int numeroDeMovimientos, String moneda){
        ArrayList<String> movimientos = new ArrayList<>();
        for (int i = 0; i < numeroDeMovimientos; i++) {
            int numeroDeMovimiento = obtenerIntAleatorio(1,6);
            String tipoDeMovimiento;
            switch (numeroDeMovimiento){
                case 1:
                    tipoDeMovimiento = TRANSFERENCIA;
                    break;
                case 2:
                    tipoDeMovimiento = INGRESO;
                    break;
                case 3:
                    tipoDeMovimiento = RETIRADA;
                    break;
                case 4:
                tipoDeMovimiento = PAGO_CON_TARJETA;
                break;
                case 5:
                tipoDeMovimiento = NOMINA;
                break;
                default:
                    tipoDeMovimiento = PAGO_RECIBO;
            }
            double cantidadAleatoria = obtenerDoubleAleatorio(1.0,3000.0);
            String movimiento = tipoDeMovimiento + String.format("%.2f",cantidadAleatoria) + " "+moneda;
            movimientos.add(movimiento);
        }
        return movimientos;
    }

    private double obtenerDoubleAleatorio(double minimo, double maximo) {
        return ThreadLocalRandom.current().nextDouble(minimo,maximo + 1.0);
    }

    private int obtenerIntAleatorio(int minimo, int maximo){
        return ThreadLocalRandom.current().nextInt(minimo,maximo + 1);

    }


}
