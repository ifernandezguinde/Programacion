/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * calcula a media da nota de 10 alumnos mediante un ArrayList
 * @author ivan
 */
public class Marks {
    
    private ArrayList<Integer> marks = new ArrayList<>();

    /**
     * da un valor ao ArrayList marks
     */
    public Marks() {
    }

    /**
     * devolve o valor do Arraylist marks
     * @return 
     */
    public ArrayList<Integer> getMarks() {
        return marks;
    }

    /**
     * modifica o ArrayList marks
     * @param marks 
     */
    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }


    
    /**
     * pide por pantalla as notas dos 10 alumnos e gardaas no ArrayList
     */
    private void get_Marks() {
        Scanner scan = new Scanner(System.in);
        
        // pide por teclado as notas dos 10 alumnos
        for (int i=0; i<10; i++) {
            System.out.println("Nota do alumno " +(i+1)+ ": ");
            marks.add(scan.nextInt());
        }
    }
    
    /**
     * devolve a nota media dos 10 alumnos
     * @return 
     */
    private double getAverage() {
        // declaramos e inicializamos a variable
        double averageMark = 0;
        
        // suma as notas dos 10 alumnos mediante un iterador
        Iterator<Integer> it = marks.iterator();
        while(it.hasNext()) {
            averageMark += it.next();           
        }
  
        // devolve a media da suma das notas
        return averageMark/marks.size();  
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Marks marks = new Marks();
        
        // invocamos o método get_Marks para introducir as notas dos 10 alumnos
        marks.get_Marks();
        
        // facemos que nos mostre a media invocando o método getAverage
        System.out.println("a nota media dos alumnnos é: " +marks.getAverage());
    }
    
}
