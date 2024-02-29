package claseabstracta;

public abstract class Animal {
    private String tipo;
    private int edad;
    private int cantPatas;
    private String nombre;

    protected Animal(String tipo, int edad, int cantPatas, String nombre) {
        this.tipo = tipo;
        this.edad = edad;
        this.cantPatas = cantPatas;
        this.nombre = nombre;
    }

    public abstract String hacerRuido();

    public String jugar(){
        return nombre + "esta jugando";
    }

}
