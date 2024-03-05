import claseabstracta.*;


public class Main {
    public static void main(String[] args) {
        Mascota gato1 = new Gato("Siames", 2, 4, "Caramelo");
        System.out.println(gato1.hacerRuido());

        Mascota perro1 = new Perro("Doberman", 3, 4, "Pepe");
        System.out.println(((Perro)perro1).cuidar());
        System.out.println(((Perro)perro1).ladrar());
        System.out.println(perro1.jugar());

        Perro perro2 = new Perro("chicho", 4, 4, "Chichin");
        System.out.println(perro2.ladrar());

        Lobo lobo1 = new Lobo(10, "Gris");
        System.out.println(lobo1.cuidar());
        System.out.println(lobo1.ladrar());





    }
}
