/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablado5;

/**
 * mostra a tabla do 5 a través de un bucle
 * @author ivan
 */
public class Tablado5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaramos as variables
        int number, resultado;
        number = 5;
        
        
        //creamos o blucle que nos mostra por pantalla a tabla do 5
        for (int i = 1; i <= 10; i++) {
            resultado = number*i;
            System.out.println("5 x " +i+ " = " +resultado);
        }
        
    }
    
}
