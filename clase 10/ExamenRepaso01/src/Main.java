import examenes.Alumno;
import examenes.ExamenFinal;
import examenes.ExamenParcial;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan","Perez", 112);
        ExamenParcial examenParcialPOO = new ExamenParcial(alumno1, "parcial POO", 3, 4,1);
        System.out.println(examenParcialPOO.estaAprobado());

        ExamenFinal examenPOO = new ExamenFinal(alumno1,"finalPOO", 6,8,"clases abstractas");
        ExamenFinal examenTesting = new ExamenFinal(alumno1,"finaltesting", 10,6,"nose algo de testing");

        System.out.println(examenPOO.compareTo(examenTesting));

}}
