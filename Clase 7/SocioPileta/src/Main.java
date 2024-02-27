import socio.Socio;
import socio.SocioPileta;
import socio.SocioPiletaClimatizada;

public class Main {
    public static void main(String[] args) {
        SocioPileta socio1 = new SocioPileta(1,"Juan",4500,"Spinning", 1500, true);
        SocioPileta socio2 = new SocioPileta(2,"Lucia",4500,"Pesas", 1500, false);

        System.out.println(socio1.calcularCostoMensual());
        System.out.println(socio2.calcularCostoMensual());

        System.out.println(socio1.mostrarSocio());
        System.out.println(socio2.mostrarSocio());

        System.out.println(socio1);
        System.out.println(socio2);

        Socio socio3 = new Socio(4,"Pedro", 4500, "Pesas");
        System.out.println(socio3);



    }
}
