package com.aabriseno.banco;

public abstract class CuentaBancaria {
    private String titular;
    private TipoDeCuenta tipoDeCuenta;
    protected double saldo;

    //public static final String TIPO_AHORRO = "ahorro";
    //public static final String TIPO_NOMINA = "nómina";

    private final double COMISION = 1.2;

    protected CuentaBancaria(String titular, TipoDeCuenta tipo, double saldo){
        this.titular = titular;
        this.tipoDeCuenta = tipo;
        this.saldo = saldo;
    }
    public CuentaBancaria(String titular, double saldo) {
        this(titular,TipoDeCuenta.AHORRO,saldo);
    }

    public CuentaBancaria(){

        this("",TipoDeCuenta.AHORRO, 0);
    }

    public void sacarDinero(double cantidad){
        if(cantidad<0){
            return;
        }
        saldo -= cantidad;

    }

    public void ingresarDinero(double cantidad){
        if(cantidad<0){
            return;
        }
        saldo+=cantidad;
    }

    public void cambiarTipoDeCuenta(TipoDeCuenta nuevoTipo){
        tipoDeCuenta = nuevoTipo;
    }

    public double obtenerSaldo(){
        return saldo;
    }

    public abstract void informarSobreCondicionesLegales();

    public abstract void informarSobreCondiciones();
}
