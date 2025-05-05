/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package incidencias;

import java.util.Scanner;
import model.User;
import persistence.IncidenceDB;
import persistence.UserDB;

/**
 *
 * @author ivan.fernandezguinde
 */
public class IncidenceManager {
    
    /**
     * mostra o menú da aplicación
     */
    public void showInitMenu() {
        Scanner scan = new Scanner(System.in);
        int option;
        String username, password;
        User exist = null;

        do {
            // Mostrar o menú
            System.out.println("Benvid@ a aplicacion de notificacion de incidencias");
            System.out.println("Nome de usuario: ");
            username = scan.nextLine();
            System.out.println("Contrasinal: ");
            password = scan.nextLine();

           exist = UserDB.findByName(username);
           if (exist == null || !exist.getPassword().equals(password)) {
            System.out.println("Nome de usuario ou contrasinal incorrecto. "
                    + "Inténteo de novo");
            exist = null;
           }
           
        } while (exist == null);
        
        
        do {
            // Mostrar o menú
            System.out.println("Benvido, " + username);
            System.out.println("As túas incidencias");
            System.out.println("Escolle unha opción: ");
            System.out.println("1. Crear unha incidencia");
            System.out.println("2. Pechar a sesión");
            System.out.print("Seleccione una opción: ");

            // Leer a opción do usuario
            option = scan.nextInt();
            scan.nextLine();

            // Evaluar a opción usando switch
            switch (option) {
                case 1:
                    System.out.println("Introduce a descripcion da incidencia: ");
                    String description = scan.nextLine();
                    System.out.println("Indica o equipo sobre o que trata a incidencia: ");
                    String computer = scan.nextLine();
                    System.out.println();
                    System.out.println("Benvido, " + username);
                    System.out.println("AS túas incidencias: ");
                    System.out.println(IncidenceDB.findByUser(username));
                    break;
                    
                case 2:
                    System.out.println("Queres sair da aplicación?(s/n)");
                    
                default:
                    System.out.println("Opción non válida. Inténteo de novo.");
            }
        } while (option != 2);

        scan.close();
    }
       

    private void showIncidencesMenu(User user) {
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
