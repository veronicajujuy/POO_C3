import navetur.Capitan;
import navetur.Embarcacion;
import navetur.Velero;
import navetur.Yate;

public class Cliente {
    public static void main(String[] args) {

            Capitan jack = new Capitan("Jack", "Sparrow", "00001");
            Embarcacion perlaNegra = new Velero(jack, 1000, 50, 2020, 15, 6);
            System.out.println(((Velero)perlaNegra).veleroEsGrande());
            Embarcacion yate1 = new Yate(jack, 1500, 50, 2020, 15, 5);
            Embarcacion yate2 = new Yate(jack, 1500, 50, 2021, 10, 3);
            System.out.println("comparando yates:");
            if(((Yate)yate1).compareTo(yate2) == 1) System.out.println("yate1 es mayor");
            else if(((Yate)yate1).compareTo(yate2) == -1) System.out.println("yate1 es menor");
            else System.out.println("son iguales");


    }


}
