package simulacionexamen;

public abstract class OfertaAcademicaFactory {
    public static IOfertaAcademica crearCurso(String tipo, String nombre){
        switch (tipo){
            case "curso": return new Curso(nombre);
            case "intensivo": return new ProgramaIntensivo(nombre);
            case "carrera": return  new Carrera(nombre);
            case "taller": return  new Taller(nombre);
            default:
                System.out.println("Esa oferta no es valida");
        }
        return null;
    }
}
