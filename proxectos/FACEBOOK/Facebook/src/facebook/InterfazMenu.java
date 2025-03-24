/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facebook;

import java.util.Scanner;

/**
 * menú inicial no que podes iniciar sesión, crear un novo perfil ou sair
 * @author ivan.fernandezguinde
 */
public class InterfazMenu {
    
    public static void mostrarMenu() {
        Scanner scan = new Scanner(System.in);
        int option;

        do {
            // Mostrar el menú
            System.out.println("escolle unha opción:");
            System.out.println("0: Iniciar sesión");
            System.out.println("1: Crear un novo perfil");
            System.out.println("2: Sair da aplicación");

            // Leer la opción del usuario
            option = scan.nextInt();

            // Evaluar la opción usando switch
            switch (option) {
                case 0:
                    this.IniciarSesion();
                    break;
                case 1:
                    
                    break;
                    
            }
        } while (option != 2);

        scan.close();
    }
    
    
    /**
     * Inicia sesión nunha conta existente
     */
    public void IniciarSesion() {
        
    }
    
    /**
     * crea un novo perfil e almacénao 
     */
    public void CrearPerfil() {
        Scanner scan = new Scanner(System.in);
        int option;


            // Mostrar el menú
            System.out.println("escolle un nome de usuario:");
            String nome = scan.nextLine();
            System.out.println("pon un contrasinal:");
            String contrasinal = scan.nextLine();
            System.out.println("repite o contrasinal:");
            String contrasinal2 = scan.nextLine();

            if (contrasinal.equals(contrasinal2)) {
                
            }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfazMenu inte = new InterfazMenu();
        inte.mostrarMenu();
    }
    
}
