package simulacionexamen;

public class Taller implements IOfertaAcademica{
    private String nombre;
    private int nroTps;
    private double costoTp;

    public Taller(String nombre) {
        this.nombre = nombre;
    }

    public int getNroTps() {
        return nroTps;
    }

    public void setNroTps(int nroTps) {
        this.nroTps = nroTps;
    }

    public double getCostoTp() {
        return costoTp;
    }

    public void setCostoTp(double costoTp) {
        this.costoTp = costoTp;
    }

    @Override
    public double calcularPrecio() {
        return costoTp * nroTps;
    }

    @Override
    public String mostrarOferta() {
        return "Taller: "+ nombre;
    }
}
