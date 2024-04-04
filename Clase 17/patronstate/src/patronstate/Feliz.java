package patronstate;

public class Feliz implements Estado{
    private Tamagotchi tamagotchi;

    public Feliz(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public String comer() {
        tamagotchi.setEstado(new Sediento(tamagotchi));
        return "Gracias por darme de comer";
    }

    @Override
    public String beber() {
        tamagotchi.setEstado(new Hambriento(tamagotchi));
        return "Gracias por darme de beber";
    }

    @Override
    public String recibirMimos() {
        return "Gracias por hacerme mimos";
    }

    @Override
    public String comoEstas() {
        return "Estoy Feliz";
    }
}
