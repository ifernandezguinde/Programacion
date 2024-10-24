/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainapp1;

/**
 *creamos duas clases "Pine" e invocamos dous métodos "cut"
 * @author ivan.fernandezguinde
 */
public class MainApp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos duas clases "Pine"
        Pine pine1 = new Pine(34);
        Pine pine2 = new Pine(25);
        
        //invocamos o método "cut" para cada clase pine
        pine1.cut(7);
        pine2.cut(12);
        
        //mostramos por pantalla o resultado
        System.out.println("a altura é " +pine1.getHeight());
        System.out.println("a altura é " +pine2.getHeight());
    }
    
}
