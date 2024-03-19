import ejemplo.FechaInternacionException;
import ejemplo.Paciente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1;
        Paciente paciente2;

        try {
            paciente1 = new Paciente("Juan", "Perez", "5464646", LocalDate.of(2024,3,17));
            paciente2 = new Paciente("Juan", "Perez", "5464646", LocalDate.of(2024,3,22));
        } catch (FechaInternacionException e) {
            System.err.println(e.getMessage());

        }
        System.out.println("Se termino el programa");
    }

}
