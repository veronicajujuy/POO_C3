package banco;

public class CajaAhorro extends Cuenta{

    private double tasaInteres;
    public CajaAhorro(double saldo, Cliente cliente, double tasaInteres) {
        super(saldo, cliente);
        this.tasaInteres= tasaInteres;
    }

    @Override
    public boolean extraerEfectivo(double monto) {
        if(getSaldo()>0 && getSaldo()>= monto){
            setSaldo(getSaldo()-monto);
            return true;
        }
        else return false;
    }

    @Override
    public String informarSaldo() {
        return "el Saldo es: " + getSaldo();
    }

    public void cobrarInteres(){
        this.setSaldo(getSaldo() + getSaldo()*tasaInteres);
    }


}
