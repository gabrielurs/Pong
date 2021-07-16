/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.geom.Rectangle2D;

/**
 *
 * @author usuario
 */
public class Raqueta {
    private int x,y;
    static final int ancho = 10,alto = 40;
    
    public Raqueta(int x,int y){
    this.x = x;
    this.y=y;
    }
    
    public Rectangle2D getRaqueta(){
        return new Rectangle2D.Double(x, y, ancho, alto);
    }
}
