package datos;

import modelo.Jugador;

public class DatosJugador {
    public static void actualizarDatosJugador(Jugador jugador, String equipo, String posicion){
        jugador.setEquipo(equipo);
        jugador.setPosicion(posicion);
    }
}