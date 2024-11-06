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

        // pide por panalla o nome do alumo coa sua nota e gardaos no
        // array correspondente
        for (int i = 0; i < TAMANO ; i++) {
            System.out.println("nome do alumno: ");
            names[i] = scan.nextLine();
            System.out.println("nota do alumno: ");
            marks[i] = scan.nextInt();
            scan.nextLine();
        }
    }

    /**
     * calcula a nota mais baixa de todo o array
     * @return o nome do almno coa nota máis baixa
     */
    public String min() {
        // declaramos e inicializamos as variables para a nota máis baixa
        // e para a posición que ocupa no array
        int min = 10;
        int posicion = 0;
        
        // compara as notas, garda a mais baixa en min e a posición que ocupa no
        // array gardaa en posicion
        for (int i = 0; i < marks.length; i++) {
            if (min > marks[i]) {
                min = marks[i];
                posicion = i;
            }
        }
        return names[posicion];
    }

    /**
     * calcula a nota mais alta de todo o array
     * @return o nome do alumno coa nota máis alta
     */
    public String max() {
        // declaramos e inicializamos as variables para a nota máis alta
        // e para a posición que ocupa no array
        int max = 1;
        int posicion = 0;
        
        // compara as notas, garda a mais alta en max e a posición que ocupa no
        // array gardaa en posicion
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
        
        // mandamos que nos mostre por pantalla o nome do alumno ca nota máis
        // baixa e máis alta invocando os métodos creados
        System.out.println("nota máis baixa é a de: " + notas.min());
        System.out.println("nota máis alta é a de: " + notas.max());

    }

}
