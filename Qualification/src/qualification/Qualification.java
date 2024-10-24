/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qualification;

/**
 * Nesta clase qualificacion utilizando un switch móstranos diferentes 
 * resultados segundo a nota que teñamos
 * @author ivan.fernandezguinde
 */
public class Qualification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaramos a variable
        int qualification = 8;
                
        switch (qualification) {
            case 10:
                System.out.println("Matrícula de Honra");
                break;
            case 9:
                System.out.println("Sobresainte");
                break;
            case 8:
            case 7:
                System.out.println("Notable");
                break;
            case 6:
                System.out.println("Ben");
                break;
            case 5:
                System.out.println("Aprobado");
                break;
            default:
                System.out.println("Suspenso");
        }
    }
    
}