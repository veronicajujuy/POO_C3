package claseabstracta;

public class Gato extends Animal{

    public Gato(String tipo, int edad, int cantPatas, String nombre) {
        super(tipo, edad, cantPatas, nombre);
    }

    @Override
    public String hacerRuido() {
        return "El gato hace miau";
    }

    public String comportamientoGatuno(){
        return "El gato siempre cae parado";
    }
}
