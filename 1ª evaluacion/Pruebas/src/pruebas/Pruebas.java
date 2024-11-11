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


    private int median() {
        // declaramos unha variable na que gardaremos o número que sea a mediana
        int numberMedian = 0;

        for (int i = 0; i < numbers.length; i++) {
            int numbersUp = 0;
            int numbersDown = 0;

            // comparamos si os números dentro do array son maiores ou menores
            // e gardámolos
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    numbersUp++;
                } else if (numbers[i] > numbers[j]) {
                    numbersDown++;
                }
            }

            // se hay tantos números maiores como menores entón é a mediana
            if (numbersUp == numbersDown) {
                numberMedian = numbers[i];
            }
        }
        return numberMedian;
     