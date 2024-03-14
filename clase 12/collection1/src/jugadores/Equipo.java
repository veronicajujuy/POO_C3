package jugadores;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadores = new ArrayList<Jugador>();
    }

    public void addJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    public void mostrarJugadoresTitulares(){
        jugadores.sort(null);
        for (int i = 0; i < jugadores.size(); i++) {
            if(jugadores.get(i).isEsTitular()){
                System.out.println("Jugador: "+ jugadores.get(i).getNumeroCamiseta()+"---"+  jugadores.get(i).getNombre());
            }
        }
    }

    public int getJugadoresLesionados(){
        int lesionado = 0;
        for (Jugador jugador: jugadores) {
            if(jugador.isEstaLesionado() && jugador.isEsTitular()){
                lesionado++;
            }
        }
        return lesionado;
    }
}
