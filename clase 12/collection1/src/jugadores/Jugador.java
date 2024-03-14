package jugadores;

public class Jugador implements Comparable{
    private int numeroCamiseta;
    private String nombre;
    private boolean estaLesionado;
    private boolean esTitular;

    public Jugador(int numeroCamiseta, String nombre, boolean estaLesionado, boolean esTitular) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.estaLesionado = estaLesionado;
        this.esTitular = esTitular;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstaLesionado() {
        return estaLesionado;
    }

    public boolean isEsTitular() {
        return esTitular;
    }

    @Override
    public int compareTo(Object o) {
        Jugador jugador = (Jugador)o;
        return this.numeroCamiseta - jugador.numeroCamiseta;
    }
}
