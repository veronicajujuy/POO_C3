package navetur;

public class Yate extends Embarcacion implements Comparable{
    private int cantCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantCamarotes = cantCamarotes;
    }



    @Override
    public int compareTo(Object o) {
        Yate yate = (Yate)o;
        if(this.cantCamarotes > yate.cantCamarotes) return 1;
        else if(this.cantCamarotes < yate.cantCamarotes)return -1;
        else return 0;
    }
}
