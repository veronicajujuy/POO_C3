package examenes;

public class ExamenFinal extends Examen implements Comparable{
    private double notaOral;
    private String temaOral;

    public ExamenFinal(Alumno alumno, String titulo, double nota, double notaOral, String temaOral) {
        super(alumno, titulo, nota);
        this.notaOral = notaOral;
        this.temaOral = temaOral;
    }

    public ExamenFinal(Alumno alumno, String titulo, String enunciado, double nota, double notaOral, String temaOral) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.temaOral = temaOral;
    }

    @Override
    public boolean estaAprobado() {
        return (notaOral >=4 && super.nota >=4);
    }

// examen1.compareTo(examen2)
    @Override
    public int compareTo(Object o) {
        ExamenFinal examen =(ExamenFinal)o;
        double promedioEstaClase = (this.notaOral+super.nota)/2;
        double promedioClaseParametro = (examen.notaOral+examen.nota)/2;
        if(promedioEstaClase > promedioClaseParametro) return 1;
        else if(promedioEstaClase < promedioClaseParametro) return -1;
        else return 0;
    }
}
