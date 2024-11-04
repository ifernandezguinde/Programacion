/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplosdecinco;
import java.util.Scanner;

/**
 * calcula a suma dos múltiplos de 5 entre dous números
 * @author ivan.fernandezguinde
 */
public class MultiplosDeCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // declaramos as variables
        int a, b;
        
        // pedimos o primeiro número
        System.out.println("introduce o primeiro número: ");
        a = scan.nextInt();
        
        // pedimos o segundo número
        System.out.println("introduce o segundo número: ");
        b = scan.nextInt();
        
        
        //facemos que calcule os múltiplos de 5 entre os dous números
        // e os mostre por pantalla a menos que o primeiro sexa maior que o
        //segundo número, nese caso intercámbiaos e calcula os múltiplos de 5
        //pero se os números introducidos son negativos mostra por pantalla que
        //deben ser positivos
        if (a>=0 && b>=0){
            if (b>a) {
                System.out.println("os múltiplos de 5 son:");
                for (int i=a; i<=b; i++) {
                    if (i%5 == 0) {
                        System.out.println(+i+ " ");
                    }
                }
            } else {
                System.out.println("os múltiplos de 5 son:");
                for (int i=b; i<=a; i++) {
                    if (i%5 == 0) {
                        System.out.println(+i+ " ");
                    }
                }
            }
        } else {
            System.out.println("os números deben ser positivos");
        }
    }    
}
