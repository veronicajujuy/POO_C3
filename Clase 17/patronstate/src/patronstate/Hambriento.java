package patronstate;

public class Hambriento implements Estado{
    private Tamagotchi tamagotchi;

    public Hambriento(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public String comer() {
        tamagotchi.setEstado(new Feliz(tamagotchi));
        return "Estoy Feliz";
    }

    @Override
    public String beber() {
        tamagotchi.setEstado(new Triste(tamagotchi));
        return "Yo queria comer";
    }

    @Override
    public String recibirMimos() {
        return "Yo quieria comer :(";
    }

    @Override
    public String comoEstas() {
        return "Estoy Hambriento";
    }
}
