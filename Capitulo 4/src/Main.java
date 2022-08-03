public class Main {
    public static void main(String[] args) {


        Informador informador = new Informador();
        informador.mostrarPorPantalla(3);

        byte unByte = 2;
        informador.mostrarPorPantalla(unByte);

        informador.mostrarPorPantalla(5.3);

        informador.mostrarPorPantalla("hola",Informador.COLOR_ROJO);
        informador.mostrarPorPantalla("hola");
    }
}
/*Métodos
 double cantidad = 500;
        cuentaDeJuan.sacarDinero(cantidad);
        System.out.println("Ahora cuentaDeJuan tiene "+cuentaDeJuan.saldo);

        cantidad = 1000;
        cuentaDeJuan.ingresarDinero(cantidad);

        System.out.println("Después de ingresar dinero cuentaDeJuan tiene "+cuentaDeJuan.saldo);

        final String nuevoTipo = "ahorro";
        cuentaDeJuan.cambiarTipoDeCuenta(nuevoTipo);
* */


/* Valor return
* CuentaBancaria cuentaDeJuan = new CuentaBancaria();

        cuentaDeJuan.titular = "Juan Martinez";
                cuentaDeJuan.tipoDeCuenta = "nómina";
                cuentaDeJuan.saldo = 23_500;

                double saldo = cuentaDeJuan.obtenerSaldo();

                System.out.println("El saldo de Juan es "+saldo);


                cuentaDeJuan.sacarDinero(-1000);

                System.out.println("El saldo de Juan tras sacar una cantidad negativa es "+cuentaDeJuan.obtenerSaldo());
*
* */

/*
* Parámetros
*
* Calculadora calculadora = new Calculadora();
        double radio = 4.0;
        double area = calculadora.calcularAreaCirculo(radio);
        System.out.println("El área de un circulo de radio 4 es "+area);


        System.out.println("El volumen de un prisma de 5 por 4 por 8 es "+calculadora.calcularVolumenPrismaRectangular( 5,  4,  8));

      calculadora.calcularMedia(2.6, 2, 5.9, 8);
* */

/*
* Constantes
*
*  CuentaBancaria cuentaDeJuan = new CuentaBancaria("Juan Martínez",CuentaBancaria.TIPO_AHORRO, 23_500);
*
* */

/*
* Enumeradores
*
*        CuentaBancaria cuentaDeAna = new CuentaBancaria("Ana García",TipoDeCuenta.INFANTIL, 23_500);
* */