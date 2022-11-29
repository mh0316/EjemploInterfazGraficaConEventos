package guis;

import datos.DatosJugador;
import modelo.Jugador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaModificarDatosJugador extends Ventana implements ActionListener {
    Jugador jugador;
    JTextField cajaEquipo;
    JTextField cajaPosicion;
    JButton aceptar;
    JButton cancelar;

    public VentanaModificarDatosJugador(Jugador jugador){
        this.jugador = jugador;

        this.crearEtiqueta("Nombre: "+jugador.getNombre(),50,150,200,25);
        this.crearEtiqueta("Apellido: "+jugador.getApellido(),50,200,200,25);
        this.crearEtiqueta("Equipo: ",50,250,200,25);
        this.crearEtiqueta("Posición: ",50,300,200,25);

        cajaEquipo = this.crearCajasDeTexto(125,250,200,25);
        cajaPosicion = this.crearCajasDeTexto(125,300,200,25);

        aceptar = this.crearBotones("Aceptar",125,350,100,25);
        aceptar.addActionListener(this);
        cancelar = this.crearBotones("Cancelar",225,350,100,25);
        cancelar.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == aceptar){
            DatosJugador.actualizarDatosJugador(this.jugador,cajaEquipo.getText(),cajaPosicion.getText());
        }
        this.dispose();
        new VentanaJugador(jugador);
    }
}