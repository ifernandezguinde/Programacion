/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

/**
 *
 * @author ivan.fernandezguinde
 */
import java.util.Scanner;

public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //facemos que nos pida o primeiro e o segundo numero para que os sume
        int number1, number2, answer;
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("First number:");
        number1 = lectura.nextInt();
        
        System.out.println("second number:");
        number2 = lectura.nextInt();
        
        answer = number1 + number2;
        
        //agora facemos que mostre o resultado en  pantalla
        System.out.println("result: " + answer);
        
        //damoslle unha condicion
        if (answer <=5);
        else System.out.println("deu 5 ou mais");
    }

}