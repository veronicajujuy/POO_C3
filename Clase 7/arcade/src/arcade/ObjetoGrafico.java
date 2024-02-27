package arcade;

public class ObjetoGrafico {
    private int posx;
    private int posy;
    private char direccion;

    public ObjetoGrafico(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }
    public void irA(int x, int y, char direccion){
       posx = x;
       posy = y;
       this.direccion = direccion;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "posx=" + posx +
                ", posy=" + posy +
                ", direccion=" + direccion;
    }
}
