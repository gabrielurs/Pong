/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JFrame;

/**
 *
 * @author usuario
 */
public class Ventana extends JFrame {

    private final int ancho=800, alto=500;
    private tableroJuego lamina;
    public Ventana() {

        setTitle("Pong");
        setSize(ancho,alto);
        setLocationRelativeTo(null); 
        setResizable(false);
        lamina = new tableroJuego();
        add(lamina);
    }
}