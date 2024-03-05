import com.gravamen.CuentaCorriente;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente();
        cuenta1.depositar(20000);
        System.out.println(cuenta1.informarSaldo());
        System.out.println("Gravamen: "+ cuenta1.gravar(0.15));
        System.out.println(cuenta1.informarSaldo());

    }
}