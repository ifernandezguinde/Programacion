/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statistics;

import java.util.Scanner;

/**
 *pide a lonxitude dun array que debe ser impar, despois pide que indiques a
 * cantidade que queres introducir en cada posición do aray, compara todos os 
 * números e devolve por pantalla a mediana
 * @author ivan.fernandezguinde
 */
public class Statistics {

    // creamos o array
    private int numbers[];

    /**
     * da un valor a N
     */
    public Statistics() {

    }

    /**
     * devolve o valor de numbers
     *
     * @return
     */
    public int[] getNumbers() {
        return numbers;
    }

    /**
     * modifica o valor de numbers
     *
     * @param numbers
     */
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    private void getCuantity() {
        Scanner scan = new Scanner(System.in);

        // declaramos unha variable na que meteremos a lonxitude do array
        int N;

        //pide a lonxitude do array
        do {
            System.out.println("o número ten que ser impar");
            System.out.println("indica cantos números vas a introducir: ");
            N = scan.nextInt();
        } while (N % 2 == 0);

        numbers = new int[N];
    }

    private void fill() {
        Scanner scan = new Scanner(System.in);
        // pide por teclado os números que van en cada posición do array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("introduce o " + (i + 1) + "º número: ");
            numbers[i] = scan.nextInt();
        }
    }

    private int median() {
        //declaramos e inicializamos a variable na que gardaremos o número meidan
        int numberMedian = 0;

        for (int i = 0; i < numbers.length; i++) {
            int numbersUp = 0;
            int numbersDown = 0;
            
            // creamos un array dentro doutro array para que nos compare os
            // números e os guarde en diferentes variables segundo sexan maiores
            // ou menores ao número co que o comparamos
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] >= numbers[i]) {
                    numbersUp += numbers[i];
                }
                if (numbers[j] <= numbers[i]){
                    numbersDown += numbers[i];
                }
            }
            // se hay o mesmo número de maiores que de menores gardamos ese
            // número na variable numberMedian
            if (numbersUp == numbersDown) {
                numberMedian = numbers[i];
            }
        }

        return numberMedian;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Statistics case1 = new Statistics();

        // invocamos o método getCuantity para darlle un tamaño o array
        case1.getCuantity();
        // invocamos o método fill para rellenar o array        
        case1.fill();
        //mandámoslle que nos mostre por teclado o resultado do método median
        // que nos devolve a media do array
        System.out.println("a mediana é: " + case1.median());
    }
}