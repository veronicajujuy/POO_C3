import ejemploclase.Empleado;
import ejemploclase.EmpleadoFactory;
import ejemploclase.Empresa;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = EmpleadoFactory.crearEmpleado("EMP-RD");
        System.out.println("sueldo: "+ empleado1.calcularSueldo(21));
        Empleado empleado2 = EmpleadoFactory.crearEmpleado("EMP-PH");
        System.out.println("sueldo: "+ empleado2.calcularSueldo(21));
        empleado1.setNombre("Juan");
        empleado1.setApellido("Perez");

        Empresa empresaNueva = new Empresa("Coca Cola");
        empresaNueva.agregarEmpleado(empleado1);
        empresaNueva.agregarEmpleado(empleado2);
        System.out.println(empresaNueva.calcularSueldoTotal(21));
    }
}
