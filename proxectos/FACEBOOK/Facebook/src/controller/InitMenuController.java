/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import java.util.Scanner;
import view.InitMenuView;

/**
 * menú inicial no que podes iniciar sesión, crear un novo perfil ou sair
 * @author ivan.fernandezguinde
 */
public class InitMenuController {
    
    private InitMenuView view;

    public InitMenuController() {
        view = new InitMenuView(this);
    }
    
    
    
    /**
     * Inicia a aplicación, chamando repetidamente o método "showLoginMenu()" 
     * do obxecto vista ata que devolva true
     */
    private void init() {
        
    }
    
    /**
     *  Intenta iniciar sesión na aplicación cun usuario e contrasinal. Para iso
     * creará un obxecto da clase "ProfileController" e buscará se hai un perfil
     * co nome e contrasinal recibidos. Se non existe chamará o método 
     * "showLoginErrorMessage()" para que mostre o erro ao usuario, e se o atopa
     * abrirá unha sesión con ese perfil usando o método "openSession()" do 
     * controlador do perfilSe non existe chamará o método "showLoginErrorMessage()" 
     * para que mostre o erro ao usuario, e se o atopa abrirá unha sesión con 
     * ese perfil usando o método "openSession()" do controlador do perfil
     * @param name
     * @param password 
     */
    public void login (String name, String password) {
        
    }
    
    /**
     * Rexistra un novo usuario, simplemente chamando ao obxecto vista para que 
     * mostre o menú de rexistro.
     */
    public void register() {
        
    }
    
    /**
     * Crea un novo perfil (comprobando que o nome non estea xa en uso por outro
     * perfil, chamando á vista para pedir un novo nome nese caso) e abre unha 
     * sesión con el.  Creará o obxecto "Profile" cos datos recibidos, 
     * almacenarao usando a clase "ProfileDB" e creará un obxecto da clase 
     * "ProfileController" para abrir unha sesión con ese perfil usando o método
     * "openSession()".
     * @param name
     * @param password
     * @param status 
     */
    public void createProfile(String name, String password, String status) {
        
    }
    
    
    
    
    
    
    
    
    
    
    
    public void mostrarMenu() {
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
                    this.CrearPerfil();
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

            // Mostrar el menú
            System.out.println("escolle un nome de usuario:");
            String nome = scan.nextLine();
            System.out.println("pon un contrasinal:");
            String contrasinal = scan.nextLine();
            System.out.println("repite o contrasinal:");
            String contrasinal2 = scan.nextLine();

            if (!contrasinal.equals(contrasinal2)) {
                
            }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InitMenuController inte = new InitMenuController();
        inte.mostrarMenu();
    }
    
}
