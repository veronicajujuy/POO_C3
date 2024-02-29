package claseabstracta;

public class Perro extends Animal{

    private boolean esGuardian;

    public Perro(String tipo, int edad, int cantPatas, String nombre) {
        super(tipo, edad, cantPatas, nombre);
    }

    @Override
    public String hacerRuido() {
        return "El perro ladra";
    }
}
