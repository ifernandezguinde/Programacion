/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marks;
import java.util.Scanner;

/**
 * calcula a media da nota de 10 alumnos mediante un Array
 * @author ivan
 */
public class Marks {
    
    private int values[] = new int[10];
    
    /**
     * Enche o array de values con 10 valores obtidos por teclado
     */
    private void fillValues() {
        Scanner scan = new Scanner(System.in);
        
        for (int i=0; i<values.length; i++) {
            System.out.println("Introduza unha nota:");
            values[i] = scan.nextInt();
        }
    }
    
    /**
     * Calcula a media das notas almacenadas no array de values
     * @return Media das notas
     */
    private double getAverage() {
        int total = 0;
        
        for (int i=0; i<values.length; i++) {
            total += values[i];
        }
        return total/(double)values.length;
    }
    
    /**
     * O método principal crea un obxecto "Marks" e invoca os métodos para pedir
     * os valores e calcular a media
     * @param args
     */
    public static void main(String[] args) {
        Marks marks = new Marks();
        marks.fillValues();
        System.out.println("A nota media é : "+marks.getAverage());
    }
}









        // marks pero con array list

private ArrayList values = new ArrayList();
    
    /**
     * Enche o ArrayList de values con 10 valores obtidos por teclado
     */
    private void fillValues() {
        Scanner scan = new Scanner(System.in);
        
        for (int i=0; i<10; i++) {
            System.out.println("Introduza unha nota:");
            values.add(scan.nextInt());
        }
    }
    
    /**
     * Calcula a media das notas almacenadas no ArrayList de values
     * @return Media das notas
     */
    private double getAverage() {
        int total = 0;
        
        for (int i=0; i<values.size(); i++) {
            total += (int)values.get(i);
        }
        return total/10.0;
    }
    
    /**
     * O método principal crea un obxecto "Marks" e invoca os métodos para pedir
     * os valores e calcular a media
     * @param args
     */
     public static void main(String[] args) {
        Marks marks = new Marks();
        marks.fillValues();
        System.out.println("A nota media é : "+marks.getAverage());
    }