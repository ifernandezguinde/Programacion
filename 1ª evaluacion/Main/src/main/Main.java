/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.Scanner;

/**
 *pide o nome e o ano de nacemento e calcula a idade que terá en 2030 co método "future"
 * @author ivan.fernandezguinde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            System.out.println("escribe o teu nome: ");
            String name = scan.nextLine();
            
            System.out.println("pon o teu ano de nacemento: ");
            int year = scan.nextInt();
           
           
        Person P1 = new Person(name, year);
        P1.future();
        
            System.out.println("escribe o teu nome: ");
            name = scan.nextLine();
            name = scan.nextLine();
            
            System.out.println("pon o teu ano de nacemento: ");
            year = scan.nextInt();
           
        Person P2 = new Person(name, year);
        P2.future();
        
    }
    
}
