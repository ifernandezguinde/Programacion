/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package getbigger;
import java.util.Scanner;

/**
 * tras introducir 10 números enteiros mostra o maior de todos
 * @author ivan.fernandezguinde
 */
public class GetBigger {
    
    /**
     * calcula o nunmero enteiro mior de todos os introducidos
     * @param number
     * @return 
     */
    public int getBigger(int number) {
        Scanner scan = new Scanner(System.in);
        // damoslle un valor máximo inicial
        int max = Integer.MIN_VALUE;
        // creamos un bucle que pida 10 numeros enteiros e os compare para que
        // devolva o maior
        for (int i = 0; i < 10; i++) {
            System.out.println("escribe un número: ");
            number = scan.nextInt();
            max = (max>number)?max:number;
        }
        return max;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GetBigger number = new GetBigger();
        System.out.println("o número mais grande é " +number.getBigger(0));
        
    }
    
}
