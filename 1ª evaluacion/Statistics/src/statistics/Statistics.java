/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statistics;
import java.util.Scanner;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Statistics {
    Scanner scan = new Scanner(System.in);
    
    // declaramos a variable que nos indicará as posicións do array
    private int N;
    // creamos o array
    private int numbers[] = new int[N];

    /**
     * da un valor a N
     */
    public Statistics() {
        getCuantity();
    }

    /**
     * devolde o valor de N
     * @return 
     */
    public int getN() {
        return N;
    }

    /**
     * modifica o valor de N
     * @param N 
     */
    public void setN(int N) {
        this.N = N;
    }

    /**
     * devolve o valor de numbers
     * @return 
     */
    public int[] getNumbers() {
        return numbers;
    }

    /**
     * modifica o valor de numbers
     * @param numbers 
     */
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
    
    
    private void getCuantity() {
        System.out.println("indica cantos números vas a introducir: ");
        N = scan.nextInt();
        while (N % 2 == 0) {
            System.out.println("o número ten que ser impar");
            System.out.println("introduce outro número: ");
            N = scan.nextInt();
        }
    }
    
    
    private int median() {
        //declaramos e inicializamos a variable na que gardaremos o número meidan
        int numberMedian = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("introduce o " + (i + 1) + "º número: ");
            numbers[i] = scan.nextInt();
        }
        
        for (int i = 0; i < numbers.length; i++) {
            if (i == (numbers.length / 2)) {
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
        
        case1.getCuantity();
        case1.median();
        System.out.println("a mediana é: " +case1.median());
    }
}
