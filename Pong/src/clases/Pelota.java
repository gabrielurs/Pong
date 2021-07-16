/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author usuario
 */
public class Pelota {

    private int x;
    private int y;
    private int dx = 1, dy = 1;
    private int ancho = 15, alto = 15;

    public Pelota(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Pelota() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Rectangle2D getPelota() {
        return new Rectangle2D.Double(x, y, ancho, alto);
    }

    public void mover(Rectangle limites, boolean colisionR1, boolean coloisionR2) {
        x += dx;
        y += dy;
        if (colisionR1) {
            dx=-dx;
            x=25;
        }
        if (coloisionR2) {
            dx=-dx;
            x=755;
        }
        
        if (x > limites.getMaxX()) {
            dx = -dx;
        }
        if (y > limites.getMaxY()) {
            dy = -dy;
        }
        if (x < 0) {
            dx = -dx;
        }

        if (y < 0) {
            dy = -dy;
        }

    }
}
