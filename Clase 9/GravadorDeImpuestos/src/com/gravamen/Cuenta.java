package com.gravamen;

abstract class Cuenta {
    private double saldo;

    public Cuenta() {
        saldo = 0;
    }

    public abstract void extraer(double monto);
    public void depositar(double monto){
        this.saldo += monto;
    }

    public String informarSaldo(){
        return "El saldo es: "+ this.saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
