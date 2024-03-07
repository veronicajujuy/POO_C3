package navetur;

public class Velero extends Embarcacion{
    private int cantMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantMastiles = cantMastiles;
    }

    public boolean veleroEsGrande(){
        if(cantMastiles > 4 && eslora > 10) return true;
        else return false;
    }

}
