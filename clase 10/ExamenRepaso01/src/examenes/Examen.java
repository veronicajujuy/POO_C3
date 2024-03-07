package examenes;

public abstract class Examen {
    private Alumno alumno;
    private String titulo;
    private String enunciado;
    protected double nota;

    public Examen(Alumno alumno, String titulo, double nota) {
        this.alumno = alumno;
        this.titulo = titulo;
        this.nota = nota;
    }

    public Examen(Alumno alumno, String titulo, String enunciado, double nota) {
        this.alumno = alumno;
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }
    public boolean estaAprobado(){
    //  return nota>=4;
        if (nota>=4) return true;
        else return false;
    }
}
