package contenedores;

public class Contenedor implements Comparable {
    private int num;
    private Procedencia paisProcedencia;
    private boolean esPeligrosa;

    public Contenedor(int num, Procedencia paisProcedencia, boolean esPeligrosa) {
        this.num = num;
        this.paisProcedencia = paisProcedencia;
        this.esPeligrosa = esPeligrosa;
    }

    public int getNum() {
        return num;
    }

    public Procedencia getPaisProcedencia() {
        return paisProcedencia;
    }

    public boolean isEsPeligrosa() {
        return esPeligrosa;
    }

    @Override
    public int compareTo(Object o) {
        Contenedor contenedor = (Contenedor) o;
        return this.num - contenedor.num;
    }
}
