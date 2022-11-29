package guis;

import modelo.Jugador;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMostrarDatosJugador extends Ventana implements ActionListener {
    JButton volver;
    Jugador jugador;
    JButton salir;

    public VentanaMostrarDatosJugador(Jugador jugador){
        this.jugador = jugador;

        this.crearEtiqueta("Nombre: "+jugador.getNombre(),50,100,200,25);
        this.crearEtiqueta("Apellido: "+jugador.getApellido(),50,150,200,25);
        this.crearEtiqueta("Equipo: "+jugador.getEquipo(),50,200,200,25);
        this.crearEtiqueta("Posición: "+jugador.getPosicion(),50,250,200,25);

        volver = this.crearBotones("Volver",10,10,140,25);
        volver.addActionListener(this);
        salir = this.crearBotones("Salir",380,400,80,25);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == volver){
            this.dispose();
            new VentanaJugador(jugador);
        }
    }
}