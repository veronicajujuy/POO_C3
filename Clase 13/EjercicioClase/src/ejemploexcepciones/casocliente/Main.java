package ejemploexcepciones.casocliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "Perez", "456646", 300);
        try{
            cliente.comprar(310);
            System.out.println(cliente.getSaldoEnCuenta());
        } catch (ClienteException e){
            System.err.println("Se produjo la excepcion "+ e.getMessage());
            // System.out.println("Se produjo la excepcion "+ e.getMessage());
        } finally {
            System.out.println("finalizo la compra");
        }

        Cliente cliente2 = new Cliente("Pedro", "Perez", "456646", 300);

        try{
            cliente2.pagarDeuda(100);
            System.out.println(cliente2.getSaldoEnCuenta());
        } catch (ClienteException e){
            System.out.println("Se produjo la excepcion "+ e.getMessage());
        }
    }
}
