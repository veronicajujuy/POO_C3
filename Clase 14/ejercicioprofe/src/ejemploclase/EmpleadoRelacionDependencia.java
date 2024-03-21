package ejemploclase;

public class EmpleadoRelacionDependencia extends Empleado{
    private double sueldoMensual;

    public EmpleadoRelacionDependencia(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo(int dias) {
        return (sueldoMensual/30)*dias;
    }
}
