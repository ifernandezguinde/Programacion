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
    // declaramos unha constante co tamaño do array
    private final int TAMANO = 4;

    // declaramos os arrays
    private int marks[] = new int[TAMANO];
    private String names[] = new String[TAMANO];

    /**
     * dalle un valor a Marks e a Names
     */
    public StudentMarks() {
        getNamesAndMarks();
    }

    /**
     * devolve o valor de Marks
     *
     * @return
     */
    public int[] getMarks() {
        return marks;
    }

    /**
     * modifica o valor de Marks
     *
     * @param marks
     */
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    /**
     * devolve o valor de Names
     *
     * @return
     */
    public String[] getNames() {
        return names;
    }

    /**
     * modifica o valor de Names
     *
     * @param names
     */
    public void setNames(String[] names) {
        this.names = names;
    }

    private void getNamesAndMarks() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < TAMANO ; i++) {
            System.out.println("nome do alumno: ");
            names[i] = scan.nextLine();
            System.out.println("nota do alumno: ");
            marks[i] = scan.nextInt();
            scan.nextLine();
        }
    }

    public String min() {
        int min = 10;
        int posicion = 0;
        for (int i = 0; i < marks.length; i++) {
            if (min > marks[i]) {
                min = marks[i];
                posicion = i;
            }
        }
        return names[posicion];
    }

    public String max() {
        int max = 1;
        int posicion = 0;
        for (int i = 0; i < marks.length; i++) {
            if (max < marks[i]) {
                max = marks[i];
                posicion = i;
            }
        }
        return names[posicion];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentMarks notas = new StudentMarks();
        
        System.out.println("nota mínima: " + notas.min());
        System.out.println("nota máxima: " + notas.max());

    }

}
