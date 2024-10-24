/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dezprimeirosnumeroswhile;

/**
 * Mostra os 10 primeiros numeros cun bucle do while
 * @author ivan
 */
public class DezPrimeirosNumerosWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaramos a variable
        int i = 0;
        
        // facemos que mostre os 10 primeiros numeros cun bucle tipo do while
        do {
            i++;
            System.out.println(+i);
        } while (i<10);
    }
    
}
