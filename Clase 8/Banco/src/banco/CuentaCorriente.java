package banco;

public class CuentaCorriente extends Cuenta{
    private double descubierto;

    public CuentaCorriente(double saldo, Cliente cliente, double descubierto) {
        super(saldo, cliente);
        this.descubierto = descubierto;
    }

    @Override
    public boolean extraerEfectivo(double monto) {
        double saldo = getSaldo();
        if(saldo+descubierto>0 && saldo+descubierto>= monto){
            if (saldo >= monto) setSaldo(saldo-monto);
            else {

                descubierto -= (monto - saldo);
                setSaldo(0);
            }
            return true;
        }
        else return false;
    }

    @Override
    public String informarSaldo() {
        return "el Saldo es: " + getSaldo() + "el descubierto es de: "+ descubierto;
    }
    // saldo 300 - descubierto 500
    // sacar 400
    // monto - saldo: 100

}
