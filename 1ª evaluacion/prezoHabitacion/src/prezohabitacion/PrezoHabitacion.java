/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prezohabitacion;
import java.util.Scanner;

/**
 * Mostra por pantalla o prezo da habitacion segundo certas cualidades
 * @author ivan
 */
public class PrezoHabitacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        // Solicitar idade
        System.out.print("Introduce a túa idade: ");
        int idade = scan.nextInt();
        scan.nextLine();

        //mandamoslle por pantalla que nos indique se ten carné universitario
        System.out.println("tes carné universitario? (si/non) ");
        String carneuniversitario = scan.nextLine();
        
        //mandamoslle por pantalla que  nos indique se ten un carné de xubilado
        System.out.println("tes carné de xubilado?(si/non) ");
        String carnexubilado = scan.nextLine();
        
        //mandamoslle por pantalla que nnos indique se está en paro
        System.out.println("estás no paro? (si/non) ");
        String paro = scan.nextLine();
        
        //mandamoslle por pantalla que nos indique se ten carné de familia numerosa
        System.out.println("tes carné de familia numerosa? (si/non) ");
        String familianumerosa = scan.nextLine();

        int custo;

        // Calcular custo segundo as condicións
        if (idade < 30) {
            if(carneuniversitario.charAt(0) == 's' && paro.charAt(0) == 's') {
                custo = 35;
            } else if (carneuniversitario.charAt(0) == 's' || paro.charAt(0) == 's') {
                custo = 40;
            } else {
                custo = 50; 
            }
        } else if (idade > 55) {
            if (carnexubilado.charAt(0) == 's' || paro.charAt(0) == 's') {
                custo = 45;
            } else {
                custo = 60;
            }
        } else {
            if (familianumerosa.charAt(0) == 's') {
                custo = 65;
            } else {
                custo = 75;
            }
        }

        // Mostra por pantalla o prezo da habitación
        System.out.println("O custo do cuarto é: " + custo + "€");
    }

}