package guis;

import modelo.Jugador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaJugador extends Ventana implements ActionListener {
    JButton mostrarInformacion;
    JButton modificarInformacion;
    Jugador jugador;

    public VentanaJugador(Jugador jugador){
        this.crearEtiqueta("Jugador",220,100,125,50);
        this.jugador = jugador;

        mostrarInformacion = this.crearBotones("Mostrar información", 100,200,150,50);
        modificarInformacion = this.crearBotones("Modificar información", 250,200,160,50);

        mostrarInformacion.addActionListener(this);
        modificarInformacion.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        if(e.getSource() == mostrarInformacion){
            new VentanaMostrarDatosJugador(this.jugador);
        }else{
            new VentanaModificarDatosJugador(this.jugador);
        }
    }
}