/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pimo2.pkg8;
import java.util.Scanner;

/**
 * mostra os numeros primos anteriores ao numero introducido
 * @author ivan
 */
public class Pimo28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // pedímoslle o numero por pantalla
        System.out.println("introduce o número: ");
        int number = scan.nextInt();
        
        //facemos que mostre por pantalla os numero que sexan primos
        System.out.println("Números primos anteriores a " + number + " son:");
        for (int i = 2; i < number; i++) {
            if (esPrimo(i)) {
                System.out.print(+i+ " ");
            }
        }   
    }
    

    /**
     * calcula si un número é primo ou non
     * @param number
     * @return se é primo
     */
    public static boolean esPrimo(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}