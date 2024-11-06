/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmarks;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class StudentMarks {
    // declaramos os arrays
    private int marks[] = new int[10];
    private String names[] = new String[10];

    /**
     * dalle un valor a Marks e a Names
     */
    public StudentMarks() {
        get_NamesAndMarks();
    }

    /**
     * devolve o valor de Marks
     * @return 
     */
    public int[] getMarks() {
        return marks;
    }

    /**
     * modifica o valor de Marks
     * @param marks 
     */
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    /**
     * devolve o valor de Names
     * @return 
     */
    public String[] getNames() {
        return names;
    }

    /**
     * modifica o valor de Names
     * @param names 
     */
    public void setNames(String[] names) {
        this.names = names;
    }

    
    private void get_NamesAndMarks() {
        Scanner scan = new Scanner(System.in);
        
        for (int i=0; i<10; i++) {
            System.out.println("nome do alumno: ");
            names[i] = scan.nextLine();
            System.out.println("nota do alumno: ");
            marks[i] = scan.nextInt();
        }
    }
    
   
    public String min() {
        
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
