/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;
import java.util.Scanner;

/**
 *este programa calcula o cafactorial dun número
 * @author ivan
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // pedimos o número por pantalla
        System.out.println("escribe o número: ");
        int number = scan.nextInt();
    
        int factorial = 1; 
   
        //facemos que calcule o factorial cun bucle for
        for (int factor = 1; factor <= number; factor++) {
            factorial = factorial * factor;
        }
    
        //mostramos o resultado
        System.out.println("o factorial de " +number+ " é: " +factorial);
    
    }
    
}