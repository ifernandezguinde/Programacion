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
    private int n;

    System.out.println("indica cantos números vas a introducir: ");
    n = scan.nextInt();
    // creamos o array
    private int numbers[] = new int[n];

    /**
     * da un valor a numeros
     */
    public Statistics() {
        getCuantity();
    }

    /**
     * devolde o valor de n
     * @return 
     */
    public int getN() {
        return n;
    }

    /**
     * modifica o valor de n
     * @param n 
     */
    public void setN(int n) {
        this.n = n;
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
        
        
    }
    
    
    private int median() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("indica cantos números vas a introducir: ");
        n = scan.nextInt();
        
        do {
            System.out.println("");
        }
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("introduce o " + (i + 1) + "º número: ");
            numbers[i] = scan.nextInt();
        }
        //declaramos e inicializamos a variable na que gardaremos o número meidan
        int numberMedian = 0;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Statistics case1 = new Statistics();
        
        do{
            System.out.println("indica cantos números vas a introducir: ");
            n = scan.nextInt();
        }
    }
    
}
