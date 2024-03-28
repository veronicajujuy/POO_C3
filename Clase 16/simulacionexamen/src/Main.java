import simulacionexamen.*;

public class Main {
    public static void main(String[] args) {
        Curso frontEnd = (Curso) OfertaAcademicaFactory.crearCurso("curso","Front End");
        frontEnd.setCantMeses(2);
        frontEnd.setValorHora(1000);
        frontEnd.setCargaHorariaMensual(16);

        Curso backEnd = (Curso) OfertaAcademicaFactory.crearCurso("curso","Back End");
        backEnd.setCantMeses(2);
        backEnd.setValorHora(900);
        backEnd.setCargaHorariaMensual(20);

        ProgramaIntensivo fullStack = (ProgramaIntensivo) OfertaAcademicaFactory.crearCurso("intensivo", "Full Stack");
        fullStack.setDescuento(20);
        fullStack.agregarCursos(frontEnd);
        fullStack.agregarCursos(backEnd);
        System.out.println("precio programa "+ fullStack.calcularPrecio());

        Instituto instituto = new Instituto();
        instituto.agregarOfertas(backEnd);
        instituto.agregarOfertas(frontEnd);
        instituto.agregarOfertas(fullStack);

        System.out.println("Mostrando Ofertas academicas "+ instituto.mostrarOfertas());

        Carrera ctd = new Carrera("CTD");
        Taller tallerUxUi = new Taller("UX UI");
        tallerUxUi.setCostoTp(1000);
        tallerUxUi.setNroTps(5);
        ctd.agregarCursosOTalleres(frontEnd);
        ctd.agregarCursosOTalleres(backEnd);
        ctd.agregarCursosOTalleres(tallerUxUi);

        instituto.agregarOfertas(ctd);

        System.out.println("Mostrando Ofertas academicas "+ instituto.mostrarOfertas());



    }
}
