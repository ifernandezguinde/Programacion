/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shape;

import java.awt.Color;

/**
 *
 * @author ivan.fernandezguinde
 */
public abstract class Shape implements Coloreable {
    
    
    
    /**
     * debuxa unha figura
     */
    public abstract void draw();
    
    /**
     * borra unha figura
     */
    public abstract void erase();

    @Override
    public void setColor(Color c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Color getColor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    

   
    
}
