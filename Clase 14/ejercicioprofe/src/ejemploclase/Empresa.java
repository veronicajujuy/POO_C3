package ejemploclase;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    List<Empleado> empleados;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    public double calcularSueldoTotal(int dias){
        double sueldoTotal = 0;
        for (Empleado empleado:empleados) {
            sueldoTotal += empleado.calcularSueldo(dias);
        }
        return sueldoTotal;
    }
}
