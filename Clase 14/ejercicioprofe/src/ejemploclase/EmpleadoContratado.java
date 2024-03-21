package ejemploclase;

public class EmpleadoContratado extends Empleado{
    private double importePorHora;
    private double retencionImpuesto;

    public EmpleadoContratado(double importePorHora, double retencionImpuesto) {
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public double calcularSueldo(int dias) {
        double sueldo =  importePorHora*8*dias;
        return sueldo - (sueldo*retencionImpuesto/100);
    }
}
