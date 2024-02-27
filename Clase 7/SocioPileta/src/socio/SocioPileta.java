package socio;

public class SocioPileta extends Socio{
    private double costoPileta;
    private boolean estaHabiltado;
    public SocioPileta(int numero, String nombre, double cuotaMensual, String actividad) {
        super(numero, nombre, cuotaMensual, actividad);
    }

    public SocioPileta(int numero, String nombre, double cuotaMensual, String actividad, double costoPileta, boolean estaHabiltado) {
        super(numero, nombre, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabiltado = estaHabiltado;
    }

    public String mostrarSocio(){
        return "El socio es: "+ super.nombre + " numero: "+ super.getNumero();
    }

    @Override
    public double calcularCostoMensual() {
        if (estaHabiltado) {
            return super.calcularCostoMensual()+costoPileta;
        } else {
            return super.calcularCostoMensual();
        }
    }

//    @Override
//    public String toString() {
//        return "SocioPileta{" +
//                ", nombre='" + nombre + '\'' + "numero Socio "+ super.getNumero()+
//                "costoPileta=" + costoPileta +
//                ", estaHabiltado=" + estaHabiltado ;
//
//    }


    @Override
    public String toString() {
        return "SocioPileta{" +
                super.toString()+
                "costoPileta=" + costoPileta +
                ", estaHabiltado=" + estaHabiltado +
                "} " ;
    }
}
