/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calc;

/**
 *
 * @author ivan.fernandezguinde
 */
import java.util.Scanner;

public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //facemos que nos pida o primeiro e o segundo numero para que os sume
        Scanner lectura = new Scanner(System.in);
        System.out.println("First number:");
        int number1 = lectura.nextInt();
        System.out.println("second number:");
        int number2 = lectura.nextInt();
        int answer = number1 + number2;
        //agora facemos que mostre o resultado en  pantalla
        System.out.println("result:" + answer);
        //damoslle unha condicion
        if (answer <=5){
            System.out.println("deu 5 ou menos");
        }else{
            System.out.println("é maior que 5");
            }
        }
    }