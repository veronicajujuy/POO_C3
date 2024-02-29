package banco;

public abstract class Cuenta {
    private double saldo;
    private Cliente cliente;


    public double getSaldo() {
        return saldo;
    }

    public Cuenta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    abstract public boolean extraerEfectivo(double monto);
    abstract public String informarSaldo();

    public void depositar(double monto){
        saldo += monto;
    };



}