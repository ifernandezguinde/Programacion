/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

import java.util.Scanner;


/**
 *
 * @author ivan.fernandezguinde
 */
public class Menu {

    public static void mostrarMenu() {
        Scanner scan = new Scanner(System.in);
        int option;

        do {
            // Mostrar el menú
            System.out.println("\n*** MENÚ PRINCIPAL ***");
            System.out.println("1. Opción 1: Saludar");
            System.out.println("2. Opción 2: Mostrar fecha");
            System.out.println("3. Opción 3: Mostrar número al azar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            // Leer la opción del usuario
            option = scan.nextInt();

            // Evaluar la opción usando switch
            switch (option) {
                case 1:
                    System.out.println("¡Hola! Espero que estés teniendo un buen día.");
                    break;
                case 2:
                    System.out.println("La fecha de hoy es: " + java.time.LocalDate.now());
                    break;
                case 3:
                    System.out.println("Número aleatorio: " + (int)(Math.random() * 100));
                    break;
                case 4:
                    System.out.println("Saliendo del programa... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (option != 4);

        scan.close();
    }

    public static void main(String[] args) {
        mostrarMenu(); // Llamar al método del menú
    }
    
}
