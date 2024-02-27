package socio;

public class Socio {
    private int numero;
    protected String nombre;
    private double cuotaMensual;
    private String actividad;

    public Socio(int numero, String nombre, double cuotaMensual, String actividad) {
        this.numero = numero;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public int getNumero() {
        return numero;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public double calcularCostoMensual(){
        return cuotaMensual + 0.05*cuotaMensual;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", cuotaMensual=" + cuotaMensual +
                ", actividad='" + actividad + '\'' +
                '}';
    }
}
