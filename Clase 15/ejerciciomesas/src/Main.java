import patroncomposite.Circulo;
import patroncomposite.FiguraCompleja;
import patroncomposite.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(5, 4);
        Circulo circulo1 = new Circulo(1);
        FiguraCompleja vagon = new FiguraCompleja("Vagon");
        vagon.agregarFigura(rectangulo1);
        vagon.agregarFigura(circulo1);
        vagon.agregarFigura(circulo1);
        vagon.agregarFigura(circulo1);
        System.out.println("Area del vagon: "+ vagon.calcularArea());
    }
}
