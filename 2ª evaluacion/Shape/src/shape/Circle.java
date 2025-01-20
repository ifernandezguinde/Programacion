/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 * debuxa e borra circulos
 * @author ivan.fernandezguinde
 */
public class Circle extends Shape {

    /**
     * borra un circulo
     */
    @Override
    public void erase() {
        System.out.println("Borando circulo");
    }

    /**
     * debuxa un circulo
     */
    @Override
    public void draw() {
        System.out.println("Debuxando circulo");
    }
       
}
