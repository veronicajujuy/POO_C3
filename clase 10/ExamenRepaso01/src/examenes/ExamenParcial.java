package examenes;


public class ExamenParcial extends Examen{
    private int numUnidad;
    private int numIntentos;

    public ExamenParcial(Alumno alumno, String titulo, double nota, int numUnidad, int numIntentos) {
        super(alumno, titulo, nota);
        this.numUnidad = numUnidad;
        this.numIntentos = numIntentos;
    }

    public ExamenParcial(Alumno alumno, String titulo, String enunciado, double nota, int numUnidad, int numIntentos) {
        super(alumno, titulo, enunciado, nota);
        this.numUnidad = numUnidad;
        this.numIntentos = numIntentos;
    }

    public boolean puedeRecuperar(){
        if(numIntentos<=3 && numUnidad<=3) return true;
        else if(numIntentos<=2 && numUnidad >3) return true;
        else return false;
    }
}
