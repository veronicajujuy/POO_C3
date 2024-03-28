package simulacionexamen;

import java.util.ArrayList;
import java.util.List;

public class Carrera implements IOfertaAcademica{
    private String nombre;
    private double costoBasico;
    private List<IOfertaAcademica> cursosTalleres;

    public Carrera(String nombre) {
        this.nombre = nombre;
        cursosTalleres = new ArrayList<>();
    }

    public double getCostoBasico() {
        return costoBasico;
    }

    public void setCostoBasico(double costoBasico) {
        this.costoBasico = costoBasico;
    }

    public void agregarCursosOTalleres(IOfertaAcademica oferta){
        cursosTalleres.add(oferta);
    }

    @Override
    public double calcularPrecio() {
        double precioTotal=0;
        for(IOfertaAcademica curso: cursosTalleres){
            precioTotal+= curso.calcularPrecio();
        }
        return costoBasico + precioTotal;
    }

    @Override
    public String mostrarOferta() {
        return "Carrera: "+nombre;
    }
}
