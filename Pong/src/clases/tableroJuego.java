/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class tableroJuego extends JPanel {
    Pelota pelota = new Pelota(0,0);
    Raqueta r1 = new Raqueta(10,200);
    Raqueta r2 = new Raqueta(784-10-Raqueta.ancho,200);
    public tableroJuego() {
        setBackground(Color.BLACK);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);
        g2.fill(new Rectangle2D.Double(0,0,20,20));
        dibujar(g2);
        actualizar();
    }
    public void dibujar(Graphics2D g){
        g.fill(pelota.getPelota());
        g.fill(r1.getRaqueta());
        g.fill(r2.getRaqueta());
    }
    
    public void actualizar(){
        pelota.mover(getBounds());
    }
    public void iterarJuego(){
        while(true){
            repaint();
            try {
                Thread.sleep(6);
            } catch (InterruptedException ex) {
                Logger.getLogger(tableroJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
