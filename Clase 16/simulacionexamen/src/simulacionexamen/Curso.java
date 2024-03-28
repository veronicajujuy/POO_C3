package simulacionexamen;

public class Curso implements IOfertaAcademica{
    private String nombre;
    private String descripcion;
    private int cantMeses;
    private double valorHora;
    private int cargaHorariaMensual;

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantMeses() {
        return cantMeses;
    }

    public void setCantMeses(int cantMeses) {
        this.cantMeses = cantMeses;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getCargaHorariaMensual() {
        return cargaHorariaMensual;
    }

    public void setCargaHorariaMensual(int cargaHorariaMensual) {
        this.cargaHorariaMensual = cargaHorariaMensual;
    }

    @Override
    public double calcularPrecio() {
        return cantMeses * cargaHorariaMensual * valorHora;
    }

    @Override
    public String mostrarOferta() {
        return "Curso: "+nombre;
    }
}


