/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Hilo extends Thread{
    tableroJuego lamina;
    public Hilo(tableroJuego lamina){
        this.lamina = lamina;
    }
    
    @Override
    public void run(){
    while(true){
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        lamina.repaint();
    }
    }
}
