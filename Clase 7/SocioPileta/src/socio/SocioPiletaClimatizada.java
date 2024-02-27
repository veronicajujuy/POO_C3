package socio;

public class SocioPiletaClimatizada extends SocioPileta{
    private String nombrePileta;

    public SocioPiletaClimatizada(int numero, String nombre, double cuotaMensual, String actividad, String nombrePileta) {
        super(numero, nombre, cuotaMensual, actividad);
        this.nombrePileta = nombrePileta;
    }

    public SocioPiletaClimatizada(int numero, String nombre, double cuotaMensual, String actividad, double costoPileta, boolean estaHabiltado, String nombrePileta) {
        super(numero, nombre, cuotaMensual, actividad, costoPileta, estaHabiltado);
        this.nombrePileta = nombrePileta;
    }

}
