package patronstate;

public class Sediento implements Estado{
    private Tamagotchi tamagotchi;

    public Sediento(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public String comer() {
        tamagotchi.setEstado(new Triste(tamagotchi));
        return "Yo queria tomar agua! :(";
    }

    @Override
    public String beber() {
        tamagotchi.setEstado(new Feliz(tamagotchi));
        return "Gracias estoy feliz";
    }

    @Override
    public String recibirMimos() {
        return "No quiero mimos";
    }

    @Override
    public String comoEstas() {
        return "Estoy sediento";
    }
}
