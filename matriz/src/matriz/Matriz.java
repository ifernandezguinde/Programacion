/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

/**
 * mostra por pantala unha matriz de 5x5 que empeza en 10 e vai decrementando 1
 * en fila e columna
 * @author ivan
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos un bucle for dentro de outro, un define as filas "f" e 
        //o outro as columnas "c"
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print((10 - (f + c)) + " ");
            }
            // facemos un salto de liña despois de cada fila
            System.out.println();
        }
    }   
}
