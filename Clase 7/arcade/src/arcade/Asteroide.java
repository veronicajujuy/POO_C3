package arcade;

public class Asteroide extends ObjetoGrafico{
    private int lesion;

    public Asteroide(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    @Override
    public String toString() {
        return "Asteroide{" +
                "lesion=" + lesion +
                "} " + super.toString();
    }
}
