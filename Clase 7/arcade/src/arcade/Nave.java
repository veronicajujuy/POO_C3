package arcade;

public class Nave extends ObjetoGrafico{
    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad, int vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    public void girar(char direccion){
        if(direccion != super.getDireccion()){
            super.setDireccion(direccion);
        }
    }
    @Override
    public void irA(int x, int y, char direccion) {
        if(direccion != super.getDireccion()){
            girar(direccion);
        }
        super.irA(x, y, direccion);
    }
    public void restaVida(int valor){
        if (vida >= valor) vida -=valor;
        else vida = 0;
    }

    @Override
    public String toString() {
        return "Nave{" + super.toString()+
                "velocidad=" + velocidad +
                ", vida=" + vida +
                "} " ;
    }
}
