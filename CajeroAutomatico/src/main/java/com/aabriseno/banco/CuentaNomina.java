package com.aabriseno.banco;

public
class CuentaNomina extends CuentaBancaria{


    public CuentaNomina(String titular, TipoDeCuenta tipo, double saldo){
        super(titular, tipo, saldo);
    }

    public CuentaNomina(String titular,double saldo){
        super(titular, saldo);
    }

    public CuentaNomina(){
        super();
    }

    @Override
    public void informarSobreCondicionesLegales() {
        System.out.println("Condiciones legales de la cuenta Ahorro del banco ***");
        System.out.println("Segun el acuerdo firmado por usted.....");
        System.out.println("Las comisiones por retirado de dinero de su cuenta serán de "+saldo+" euros");
    }

    @Override
    public void informarSobreCondiciones() {

    }
}
