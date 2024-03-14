import jugadores.Equipo;
import jugadores.Jugador;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador(10, "Leonel Messi",false,true);
        Jugador jugador2 = new Jugador(9, "Luis Suarez",true,true);
        Jugador jugador3 = new Jugador(22, "Javier Hernandez",false,true);
        Jugador jugador4 = new Jugador(3, "Gerard Pique",false,false);
        Equipo superEquipo = new Equipo("Super Equipo");

        superEquipo.addJugador(jugador1);
        superEquipo.addJugador(jugador2);
        superEquipo.addJugador(jugador3);
        superEquipo.addJugador(jugador4);

        superEquipo.mostrarJugadoresTitulares();
        System.out.println(superEquipo.getJugadoresLesionados());
    }
}
