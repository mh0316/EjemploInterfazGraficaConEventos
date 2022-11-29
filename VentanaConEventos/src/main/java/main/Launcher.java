package main;

import guis.VentanaJugador;
import modelo.Jugador;

public class Launcher {
    public static void main(String[] args) {
        new VentanaJugador(new Jugador());
    }
}