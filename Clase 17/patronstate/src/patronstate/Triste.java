package patronstate;

public class Triste implements Estado{
    private Tamagotchi tamagotchi;

    public Triste(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public String comer() {
        return "Aujjj";
    }

    @Override
    public String beber() {
        return "Beep";
    }

    @Override
    public String recibirMimos() {
        tamagotchi.setEstado(new Feliz(tamagotchi));
        return "Gracias por hacerme mimos";
    }

    @Override
    public String comoEstas() {
        return "Estoy triste";
    }
}
