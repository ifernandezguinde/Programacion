/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuacionsegundogrado;

/**
 *
 * @author ivan.fernandezguinde
 */
public class EcuacionSegundoGrado {

    /**
     * este programa calcula as incógnitas X1 e X2 dunha ecuacion de segundo
     * grado (x^2-2x-15=0) coa axuda da clase Math
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaramos as variables
        double a, b, c;
        a = 1;
        b = 2;
        c = -15;
        //mandamoslle amosar os resultados por pantalla utilizando a ecuacion de segundo grado coa clase math
        System.out.println("X1= " + (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a));
        System.out.println("X2=" + (-b - Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a));
    }

}
