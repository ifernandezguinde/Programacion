/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroprimo;
import java.util.Scanner;

/**
 * mostra por pantalla se o número intoducido é primo ou non ata que se 
 * introduza un 0
 * @author ivan
 */
public class Numeroprimo {

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
            
            boolean prime = false;
            
            if (number >1) {
                prime = true;
            }
 
            for (int i = 2; i < number; i++){
                if (number%i == 0) {
                    prime = false;
                }
            }
            
            if (prime) {
                System.out.println("o número é primo");
            } else {
                System.out.println("o número non é primo");
            }
        } while (number != 0);
    }
    
}