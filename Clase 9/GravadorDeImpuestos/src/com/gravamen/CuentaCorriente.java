package com.gravamen;

public class CuentaCorriente extends Cuenta implements ImpuestoGravable{

    private double descubiertoPermitido;
    @Override
    public void extraer(double monto) {
        double saldo = getSaldo();
        if ((saldo + descubiertoPermitido) > monto){
            if(saldo >= monto) {
                setSaldo(saldo-monto);
            }else{
                descubiertoPermitido -= descubiertoPermitido - (monto - saldo);
            }
            System.out.println("El saldo es = " + getSaldo());
            System.out.println("El descubierto es = " + descubiertoPermitido);
        } else {
            System.out.println("No tiene saldo o descubierto suficiente");
        }
    }

    @Override
    public double gravar(double porcentaje) {
        double saldo = getSaldo();
        double gravamen = saldo*porcentaje;
        setSaldo(saldo - gravamen);
        return gravamen;
    }
}
