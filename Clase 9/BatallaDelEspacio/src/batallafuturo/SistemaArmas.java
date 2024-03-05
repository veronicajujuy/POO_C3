package batallafuturo;

public abstract class  SistemaArmas {
    private int energia;

    public SistemaArmas(int energia) {
        this.energia = energia;
    }
    public abstract void mostrar();
}
