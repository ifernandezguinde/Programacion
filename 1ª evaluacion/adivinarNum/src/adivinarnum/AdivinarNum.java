/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinarnum;
import java.util.Scanner;

/**
 * xogo no que se crea un número random, o xogador indica un número máximo para
 * xogar e un máximo de intentos para adiviñalo
 * @author ivan
 */
public class AdivinarNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //mandamoslle introducir un número máximo e un máximo de intentos
        System.out.println("introduce un número máximo ata o que adiviñar: ");
        int MAX = scan.nextInt();
        System.out.println("introduce un número máximo de intentos: ");
        int intentos = scan.nextInt();
        
        // creamos un número random
        int numero = new java.util.Random().nextInt(MAX);
        
        boolean adivinado = false;
         
        // creamos un bucle que nos mande adiviñar o número as veces que nos 
        // lle indicásemos
        for (int i=0; i<intentos && !adivinado; i++) {
            System.out.println("adiviña o número: ");
            int intento = scan.nextInt();
            
            // indicanos en cada intento se o número é maior ou menor ao 
            // introducido ou se o acertamos
            if (intento == numero) {
                adivinado = true;
            } else if (intento < numero) {
                System.out.println("o número é maior que " + intento);
            } else {
                System.out.println("o número é menor que " + intento);
            }
        }
        
        // pon unha mensaxe dependendo de se adiviña ou non o número
        if (adivinado) {
            System.out.println(" FELICIDADES!! adiviñáchelo");
        } else {
            System.out.println("non o conseguiches, o número era: " + numero);
        }
    }
    
}
