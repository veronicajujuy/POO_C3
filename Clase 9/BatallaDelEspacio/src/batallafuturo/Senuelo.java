package batallafuturo;

public class Senuelo extends SistemaArmas{
    public Senuelo(int energia) {
        super(energia);
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando un señuelo");
    }
}
