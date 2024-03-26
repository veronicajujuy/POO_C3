package patroncomposite;

import java.util.ArrayList;
import java.util.List;

public class FiguraCompleja implements IFigura{
    private String nombre;
    List<IFigura> figuras;

    public FiguraCompleja(String nombre) {
        this.nombre = nombre;
        figuras = new ArrayList<>();
    }

    public void agregarFigura(IFigura figura){
        figuras.add(figura);
    }

    public void removerFigura(IFigura figura){
        figuras.remove(figura);
    }

    @Override
    public double calcularArea() {
        double areaFinal = 0;
        for (IFigura figura:figuras) {
            areaFinal+=figura.calcularArea();
        }
        return areaFinal;
    }
}
