package patroncomposite;

public class Rectangulo implements IFigura{
    private double alto;
    private double largo;

    public Rectangulo(double alto, double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return alto * largo;
    }

}
