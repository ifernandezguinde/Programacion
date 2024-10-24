/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp;

/**
 * Esta é unha clase cun atributo "radius" e un método "show"
 *
 * @author ivan.fernandezguinde
 */
public class Circle {

    /**
     * Número máximo que se puede introducir en "radius"
     */
    public final static int MAX_RADIUS = 10;
    
    /**
    * Devolve o valor máximo que pode ter o radio
    * @return MAX_RADIUS
    */
    public static int getMaxRadius(){
        return MAX_RADIUS;
    }

    //creamos unha variable
    private int radius;

    /**
     *Devolve o valor "radius"
     * @return radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     *Permite modificar o valor "radius"
     * @param radius
     */
    public void setRadius(int radius) {
        if (radius <= MAX_RADIUS) {
            this.radius = radius;
        }
    }

    /**
     *Asigna a radius o valor que se poña o invocar a clase 
     * "Circle" e comproba que o valor máximo do radio non sexa superior a "10"
     * @param radius
     */
    public Circle(int radius) {
         if (radius <= MAX_RADIUS) {
            this.radius = radius;
         }
    }

    /**
     * Multiplica o radio por 2
     */
    public void enlarge() {
        if (radius * 2 <= MAX_RADIUS){
            radius = radius * 2;
        }         
    }

    /**
     * Mostra por pantalla o valor do radio
     */
    public void show() {
        System.out.println("Son un círculo de radio " + radius);
    }

}
