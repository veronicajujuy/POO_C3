package com.gravamen;

public class CajaAhorro extends Cuenta{

    public final double INTERES_CAJA_AHORRO = 1.2;

    public CajaAhorro() {
    }

    public void extraer(double monto){
        double saldo = getSaldo();
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Ahora el saldo es  = " + saldo);
        } else {
            System.out.println("El saldo es insuficiente");
        }
    }

    public void cobrarIntereses(){
        double saldo = getSaldo();
        setSaldo(saldo + saldo*INTERES_CAJA_AHORRO);
    }
}
