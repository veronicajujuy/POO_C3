package patroncomposite;

public class Circulo implements IFigura{
    private double radio;
    private final double PI = 3.14;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return radio *radio * PI;
    }
}
