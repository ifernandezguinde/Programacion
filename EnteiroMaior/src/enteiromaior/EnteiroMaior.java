/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enteiromaior;

/**
 * A partir de tres enteiros móstranois por pantalla o maior deles
 * @author ivan.fernandezguinde
 */
public class EnteiroMaior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // cdeclaramos as variables
        int a, b, c, max, max2;
        a = 20;
        b = 40;
        c = 33;
        max = (a>b)?a:b;
        max2 = (max>c)?max:c;
       
        //facemos que nos mostre por pantalla o maior facendo uso do número 
        //enteiro maior creado cun if comprimido co operador
        System.out.println("o enteiro maior é " + max2);
        
    }
    
}