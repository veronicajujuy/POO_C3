package batallafuturo;

public class RobotPesado extends SistemaArmas implements Volador, Defensor, Atacante{
    public RobotPesado(int energia) {
        super(energia);
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando Robot Pesado");
    }

    @Override
    public void atacar() {
        System.out.println("El robot Pesado ataca");
    }

    @Override
    public void defender() {
        System.out.println("El robot Pesado defiende");
    }

    @Override
    public void volar() {
        System.out.println("El robot Pesado vuela");
    }
}
