package padelmanager.view;

import java.util.Scanner;
import padelmanager.controller.InitMenuController;

/**
 * Clase que implementa a vista do menú de inicio
 * @author Profe de programación
 */
public class InitMenuView {
    // Referenza ao obxecto controlador do menu de inicio de sesion
    private InitMenuController controller;

    /**
     * Crea un obxecto de vista para o menu de inicio
     * @param controller Obxecto controlador do menu
     */
    public InitMenuView(InitMenuController controller) {
        this.controller = controller;
    }

    /**
     * Mostra unha mensaxe indicando que as credenciais introducidas non son
     * correctas
     */
    public void showInvalidUser() {
        System.out.println("Nome de usuario ou contrasinal non validos!");
    }

    /**
     * Mostra o menu de login do usuario
     * @return true se o usuario deixou o login en branco, para saír da app
     */
    public boolean showLoginMenu() {
        String user, pass;
        Scanner scan = new Scanner(System.in);

        // Pedimos o nome do usuario e o contrasinal
        System.out.println("Benvid@ ao xestor de reservas. Identificate para usar a aplicacion.");
        System.out.println("Nome de usuario (en branco para saír):");
        user = scan.nextLine();
        if (!user.isBlank()) {
            System.out.println("Contrasinal:");
            if (System.console() != null) {
                pass = new String(System.console().readPassword());
            } else {
                pass = scan.nextLine();
            }
            // Chamamos ao controlador para iniciar a sesion do usuario
            controller.login(user, pass);
            return false;
        } else {
            return true;
        }
    }
}
