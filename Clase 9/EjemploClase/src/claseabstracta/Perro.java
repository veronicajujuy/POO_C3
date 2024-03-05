package claseabstracta;

public class Perro extends Mascota implements Ladrador, Cuidador {

    private boolean esGuardian;

    public Perro(String tipo, int edad, int cantPatas, String nombre) {
        super(tipo, edad, cantPatas, nombre);
    }

    @Override
    public String hacerRuido() {
        return "El perro ladra";
    }


    @Override
    public String cuidar() {
        return "El perro cuida de sus dueños";
    }

    @Override
    public String ladrar() {
        return "El perro ladra por multiples razones";
    }
}
