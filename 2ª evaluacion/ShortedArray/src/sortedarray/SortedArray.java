/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortedarray;
import java.util.Scanner;

/**
 * crea un array cos números introducidos por teclado e despois ordénaos co 
 * algoritmo bubble sort
 * @author ivan.fernandezguinde
 */
public class SortedArray {
    private static int ENTEIROS[] = new int[6];

    /**
     * dalle un valor as posicións do array
     */
    public SortedArray() {
        fillENTEIROS();
    }
    

    /**
     * devolve o valor do array ENTEIROS
     * @return 
     */
    public static int[] getENTEIROS() {
        return ENTEIROS;
    }

    /**
     * modifica os valores do array ENTEIROS
     * @param ENTEIROS 
     */
    public static void setENTEIROS(int[] ENTEIROS) {
        SortedArray.ENTEIROS = ENTEIROS;
    }


    /**
     * pide por teclado os números do array
     */
    public void fillENTEIROS() {
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < ENTEIROS.length; i++) {
            System.out.println("introduce un número: ");
            ENTEIROS[i] = scan.nextInt();
        }
    }

    /**
     * ordena o array mediante o algoritmo bubble sort
     * @param ENTEIROS 
     */
    public void sort(int ENTEIROS[]) {
        // Bucle desde 0 hasta la longitud del array -1
        for (int i = 0; i < ENTEIROS.length - 1; i++) {
            // Bucle anidado dende 0 ata a lonxitude do array -1 
            for (int j = 0; j < ENTEIROS.length - 1; j++) {
                if (ENTEIROS[j] > ENTEIROS[j + 1]) {
                    // gardamos o número da posición j+1 nunha variable
                    int temp = ENTEIROS[j + 1];
                    // intercambiámolo de posición
                    ENTEIROS[j + 1] = ENTEIROS[j];
                    ENTEIROS[j] = temp;
                    // e volvemos ao inicio para comparar os seguintes ata que 
                    // todos sexan comparados
                    // de esta forma vamos deixando os números maiores ao final 
                    // do array en orden
                }
            }
        }
    }
    
    /**
     * mostra o array por pantalla
     * @param ENTEIROS 
     */
    public void show(int ENTEIROS[]) throws ArrayIndexOutOfBoundsException {
        int i = 0;
         System.out.println("ordenando...");
        // Bucle para mostrar el array desde la posicion 0 hasta la longitud del array 
        for (int a = 0; a < 7; a++) {
            System.out.print(" Elemento " + (i + 1) + " -----> " + ENTEIROS[i] + "\n");
            i = i+1;
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        SortedArray array1 = new SortedArray();
        
        array1.sort(ENTEIROS);
        array1.show(ENTEIROS);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro!!" + e.getMessage());
        }
    }
    
}
