package banco;


public class Transacciones {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("123", "Valdez", "1122", "1122");
        CuentaCorriente cuenta1 = new CuentaCorriente(1000, cliente1, 500);
        CajaAhorro cuenta2 = new CajaAhorro(2000, cliente1, 0.15);

        cuenta1.depositar(200);
        System.out.println("cuenta1.informarSaldo() = " + cuenta1.informarSaldo());
        System.out.println("Pudo extraer: "+ cuenta1.extraerEfectivo(1500));
        System.out.println("cuenta1.informarSaldo() = " + cuenta1.informarSaldo());

        cuenta2.depositar(200);
        System.out.println("cuenta2.informarSaldo() = " + cuenta2.informarSaldo());
        System.out.println("Pudo extraer: "+ cuenta1.extraerEfectivo(2500));
        System.out.println("cuenta2.informarSaldo() = " + cuenta2.informarSaldo());

        // polimormismo y casteo
        Cuenta cuenta3 = new CajaAhorro(3500, cliente1, 0.05);

        System.out.println("cuenta3.informarSaldo() = " + cuenta3.informarSaldo());
        ((CajaAhorro)cuenta3).cobrarInteres();
        System.out.println("cuenta3 = " + cuenta3.informarSaldo());

    }
}
