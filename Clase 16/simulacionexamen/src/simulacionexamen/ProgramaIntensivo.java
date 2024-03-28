package simulacionexamen;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo implements IOfertaAcademica{
    private String nombre;
    private int descuento;
    private List<IOfertaAcademica> cursos;

    public ProgramaIntensivo(String nombre) {
        this.nombre = nombre;
        cursos = new ArrayList<>();
    }

    public void agregarCursos(IOfertaAcademica curso){
        cursos.add(curso);
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecio() {
        double precioTotal=0;
        for(IOfertaAcademica curso: cursos){
            precioTotal+= curso.calcularPrecio();
        }
        return precioTotal - (precioTotal*descuento/100);
    }

    @Override
    public String mostrarOferta() {
        return "Programa Intensivo "+ nombre;
    }
}
