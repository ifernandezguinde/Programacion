/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ascensor;
import java.util.Scanner;


/**
 * Clase ascensor onde indique a acción que fai dependendo de si se mete por 
 * teclado: a, p, s, b para abrir a porta, cerrala, subir ou baixar e que dea
 * erro se se mete calquera outra variable
 * @author ivan.fernandezguinde
 */
public class Ascensor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //invocamos a clase Scanner para meter a variable polo teclado
        Scanner scan = new Scanner(System.in);
        System.out.println("escribe o imput: ");
        // facemos que recolla do teclado un char que usaremos no switch
        char imput = scan.nextLine().charAt(0);
        
        
        
        
        switch (imput) {
            case 'a':
                System.out.println("porta abrindose");
                break;
            case 'p':
                System.out.println("porta pechandose");
                break;
            case 's':
                System.out.println("subindo");
                break;
            case 'b':
                System.out.println("baixando");
                break;
            default:
                System.out.println("erro");
        }
    }
}