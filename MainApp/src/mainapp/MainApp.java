/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainapp;

/**
 *creamos dous obxectos da clase Circle, un con radio 3 e outro con radio 9 e invocamos 
 * o método enlarge, despois o método show e o getMaxRadius
 * @author ivan.fernandezguinde
 */
public class MainApp {

    public static void main(String args[]){
    // creamos dous obxectos da clase Circle
    Circle r1= new Circle(3);
    Circle r2= new Circle(9);
        //invocamos o método enlarge
        r1.enlarge();
        r2.enlarge();
        //invocamos o método show
        r1.show();
        r2.show();
        //invocamos o método de clase "getMaxRadius" para que nos mostre por pantalla o radio máximo
        System.out.println("o radio máximo permitido é "+ Circle.getMaxRadius());
    }
}