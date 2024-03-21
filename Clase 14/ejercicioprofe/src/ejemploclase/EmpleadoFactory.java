package ejemploclase;

public class EmpleadoFactory {
    public static Empleado crearEmpleado(String tipo){
        switch (tipo) {
            case "EMP-RD":
                return new EmpleadoRelacionDependencia(1000);
            case "EMP-PH":
                return new EmpleadoContratado(7, 14);
            default:
                return null;
        }
    }
}
