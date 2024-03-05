package batallafuturo;

public class Tanque extends SistemaArmas implements Defensor, Atacante{
    public Tanque(int energia) {
        super(energia);
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando Tanque");
    }

    @Override
    public void atacar() {
        System.out.println("El tanque ataca");
    }

    @Override
    public void defender() {
        System.out.println("El tanque defiende");
    }
}
