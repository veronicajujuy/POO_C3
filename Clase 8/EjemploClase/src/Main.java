import claseabstracta.*;


public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Gato("Siames",1, 4, "Mario");
        System.out.println(animal1.hacerRuido());

        animal1 = new Perro("Pastor Aleman", 3, 4, "Capitan");
        System.out.println(animal1.hacerRuido());

        Gato gato1 = new Gato("Siames",1, 4, "Fifi");

        Animal[] animales = new Animal[3];
        animales[0] = new Gato("Siames",1, 4, "Mario");
        animales[1] = new Perro("Pastor Aleman", 3, 4, "Capitan");
        animales[2] = new Gato("Siames",1, 4, "Fifi");

        Animal animal2 = new Gato("Calico",1, 4, "Pompones");
        System.out.println(gato1.comportamientoGatuno());

        System.out.println(((Gato)animal2).comportamientoGatuno());

        double numeroDouble = 10.2;
        int numeroEntero = (int) numeroDouble; // casteo explicito

        int otroNumeroEntero = 10;
        double otroNumeroDouble = otroNumeroEntero; // casteo implito
    }
}
