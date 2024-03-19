package ejemploexcepciones.casocliente;

public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    private double saldoEnCuenta;
    private double limite;

    public Cliente(String nombre, String apellido, String DNI, double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.limite = limite;
        this.saldoEnCuenta = 0;
    }

    public double getSaldoEnCuenta() {
        return saldoEnCuenta;
    }

    public void comprar(double monto) throws ClienteException {
        if(monto > limite){
            throw new ClienteException("El monto no debe superar el limite establecido");
        } else{
            saldoEnCuenta += monto;
        }

    }
    public void pagarDeuda(double monto) throws ClienteException {
        if(saldoEnCuenta==0){
            throw new ClienteException("No puede pagar, dado que no posee deuda");
        } else {
            saldoEnCuenta -= monto;
        }
    }
}
