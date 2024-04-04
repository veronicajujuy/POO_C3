package patronstate;

public class Tamagotchi {
    private Estado estado;

    public Tamagotchi() {
        setEstado(new Feliz(this));
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String comer(){
        return estado.comer();
    }

    public String beber(){
        return estado.beber();
    }

    public String recibirMimos(){
        return estado.recibirMimos();
    }

    public String comoEstas(){
        return estado.comoEstas();
    }


}
