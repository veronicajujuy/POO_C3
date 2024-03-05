package claseabstracta;

public class Lobo implements Ladrador, Cuidador{
    private int edad;
    private String colorPelo;

    public Lobo(int edad, String colorPelo) {
        this.edad = edad;
        this.colorPelo = colorPelo;
    }

    @Override
    public String cuidar() {
        return "El lobo cuida de su manada";
    }

    @Override
    public String ladrar() {
        return "El lobo aunque es raro tambien ladra";
    }
}
