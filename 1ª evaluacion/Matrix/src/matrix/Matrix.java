/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrix;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Matrix {
    // declaramos o array
    private int [][] matrix = new int[3][3];

    /**
     * dalle un valor a matrix
     */
    public Matrix() {
    }

    /**
     * devolve o valor de matrix
     * @return 
     */
    public int[][] getMatrix() {
        return matrix;
    }

    /**
     * modifica o valor de matrix
     * @param matrix 
     */
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    /**
     * pide os valores da matriz
     */
    public void inputMatrix() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("introduce os números da matriz: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println(" número para fila " +i+ " columna " +j+ ": ");
                matrix[i][j] = scan.nextInt();                
            }
        }
    }
    
    /**
     * mostra a matriz por pantalla
     */
    public void showMatrix() {
        
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * suma as matrices e devolve unha nova co resultado
     * @param other
     * @return 
     */
    public Matrix sum(Matrix other) {
        Matrix result = new Matrix();
        
        System.out.println("matriz sumada: ");
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result.matrix[i][j] = this.matrix[i][j] + other.matrix[i][j];
            }
        }
        return result;
    }
        
    public Matrix substract(Matrix other) {
        Matrix result = new Matrix();
        
        System.out.println("matriz restada: ");
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result.matrix[i][j] = this.matrix[i][j] - other.matrix[i][j];
            }
        }
        return result;
    }

       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        
        // invocamos o método inputMatrix para que nos pida os valores en cada
        // posición do array
        matrix1.inputMatrix();
        matrix2.inputMatrix();
        
        // invocamos o método showMatrix que nos mostra por pantalla a matriz
        matrix1.showMatrix();
        matrix2.showMatrix();
        
        // facemos que sume as matrices co método sum
        Matrix result = matrix1.sum(matrix2);
        
        // invocamos o método show para que nos mostre o resultado da suma das
        // matrices anteriores
        result.showMatrix();
        
        Matrix resultsubstract = matrix1.substract(matrix2);
        
        resultsubstract.showMatrix();
    }
    
}
