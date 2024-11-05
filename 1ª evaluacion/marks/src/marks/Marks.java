/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marks;
import java.util.Scanner;

/**
 * calcula a media da nota de 10 alumnos
 * @author ivan
 */
public class Marks {
    private int marks[] = new int[10];

    /**
     * dalle un valor ao array marks
     */
    public Marks() {
        get_Marks();
    }

    /**
     * devolve o valor do array marks
     * @return 
     */
    public int[] getMarks() {
        return marks;
    }

    /**
     * modifica o valor do array marks
     * @param marks 
     */
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    
    
    private void get_Marks() {
        Scanner scan = new Scanner(System.in);
        
        // pide por teclado as notas dos 10 alumnos
        for (int i=0; i<10; i++) {
            System.out.println("Nota do alumno " +(i+1)+ ": ");
            marks[i] = scan.nextInt();
        }
    }
    
    /**
     * devolve a nota media dos 10 alumnos
     * @return 
     */
    public double getAverage() {
        // declaramos e inicializamos a variable
        double averageMark = 0;
        
        //suma as notas dos 10 alumnos
        for (int i=0; i<10; i++) {
            averageMark += marks[i];
        }
        // calcula a media da suma das notas
        return averageMark/10;  
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Marks marks = new Marks();
        
        // facemos que nos mostre a media invocando o método getAverage
        System.out.println("a nota media dos alumnnos é: " +marks.getAverage());
    }
    
}
