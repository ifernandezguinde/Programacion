/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicacion;
import java.util.Scanner;


/**
 * multiplica un numero por outro sumando number1 number2 veces
 * @author ivan
 */
public class Multiplicacion {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // pedimos o primeiro número
        System.out.println("indica o primeiro número: ");
        int number1 = scan.nextInt();
        
        // pedimos o segundo numero
        System.out.println("indica o segundo número: ");
        int number2 = scan.nextInt();
    
      
        // declaramos a variable
        int resultado =0;
        
        // facemos que sume o number1 number2 veces
        for (int i=0; i<number2; i++) {
            resultado += number1;     
        }
        //mandamoslle que nos mostre o resultado por pantalla
        System.out.println("o resultado da multiplicación é: " +resultado);
    }
    
}
