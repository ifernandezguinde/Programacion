/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 * debuxa e borra triangulos
 * @author ivan.fernandezguinde
 */
public class Triangle extends Shape {

    /**
     * borra un triangulo
     */
    @Override
    public void erase() {
        System.out.println("Borando triangulo");
    }

    /**
     * debuxa un triangulo
     */
    @Override
    public void draw() {
        System.out.println("Debuxando triangulo");
    }
       
}
