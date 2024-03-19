package ejemplo;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    private String nombre;
    private String apellido;
    private String DNI;
    private LocalDate fechaInternacion;
    private LocalDate fechaAlta = null;

    public Paciente(String nombre, String apellido, String DNI, LocalDate fechaInternacion) throws FechaInternacionException {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
            if(fechaInternacion.isAfter(LocalDate.now())){
                throw new FechaInternacionException("La fecha de internacion no debe ser posterior al dia de hoy");
            } else {
                this.fechaInternacion = fechaInternacion;
            }
    }

    public void darAlta(LocalDate fechaAlta) throws FechaInternacionException {
        if (fechaAlta.isAfter(fechaInternacion))
            System.out.println("Ok");
        else
            throw new FechaInternacionException("La fecha de alta debe ser posterior al de internacion");
    }
}
