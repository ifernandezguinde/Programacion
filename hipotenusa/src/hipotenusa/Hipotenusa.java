/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hipotenusa;

/**
 *Este programa calcula a hipotenusa a partir dos dous catetos
 * @author ivan.fernandezguinde
 */     
public class Hipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaramos as variables
        double cateto1,cateto2;
                cateto1= 4.56;
                cateto2= 3.28;
        // usamos a clase math para calcular e mandamoslle amosalo por pantalla
        System.out.println("a hipotenusa é " +Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2)));
    }
    
}