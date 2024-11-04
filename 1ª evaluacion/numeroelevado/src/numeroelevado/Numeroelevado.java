/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroelevado;
import java.util.Scanner;

/**
 * este programa di se o número introducido é primo ou non
 * @author ivan
 */
public class Numeroelevado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
        
        //creamos as variables
        int number;
        
        
        
        do{
            //pedimoslle o número por teclado
            System.out.println("introduce o número que queiras: ");
            number = scan.nextInt();
            
            boolean prime = true;
            
            if (number >1) {
                prime = true;
            }
 
            //condición para que non sea primo
            for (int i = 2; i < number; i++){
                if (number%i == 0) {
                    prime = false;
                }
            }
            
            //facemos que mostre por pantalla se é primo ou non
            if (prime) {
                System.out.println("o número é primo");
            } else {
                System.out.println("o número non é primo");
            }
        //facemos que o programa remate se introduce o numero 0
        } while (number != 0);
    }
    
}
