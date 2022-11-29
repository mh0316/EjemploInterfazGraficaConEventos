package guis;

import javax.swing.*;

public abstract class Ventana extends JFrame {
    public Ventana(){
        this.setLayout(null);
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    protected JTextField crearCajasDeTexto(int x, int y, int ancho, int largo){
        JTextField cajaDeTexto = new JTextField();
        cajaDeTexto.setBounds(x,y,ancho,largo);
        this.add(cajaDeTexto);
        return cajaDeTexto;
    }

    protected JButton crearBotones(String texto, int x, int y, int ancho, int largo){
        JButton boton = new JButton(texto);
        boton.setBounds(x,y,ancho,largo);
        this.add(boton);
        return boton;
    }

    protected JLabel crearEtiqueta (String texto, int x, int y, int ancho, int largo) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setBounds(x, y, ancho, largo);
        this.add(etiqueta);
        return etiqueta;
    }
}