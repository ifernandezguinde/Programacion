package padelmanager.controller;

import padelmanager.db.PadelManagerDB;
import padelmanager.db.PlayerDB;
import padelmanager.model.PadelCourt;
import padelmanager.model.Player;
import padelmanager.view.InitMenuView;

/**
 * Clase que inicia a aplicacion e controla o comportamento do menu de inicio de sesion
 * @author Profe de programacion
 */
public class InitMenuController {
    // Referenza ao obxecto vista do menu de inicio de sesion
    private InitMenuView view;
    
    /**
     * Construtor que crea o obxecto vista correspondente
     */
    public InitMenuController() {
        view = new InitMenuView(this);
    }
    
    /**
     * Inicia a aplicacion mostrando o menu de inicio de sesion ao usuario
     */
    public void initApp() {
        boolean exit;
        do {
            exit = view.showLoginMenu();
        } while (!exit);
    }
    
    /**
     * Inicia a sesion cun usuario
     * @param user login do usuario
     * @param pass contrasinal do usuario
     */
    public void login(String user, String pass) {
        Player sessionPlayer = PlayerDB.findByIdAndPassword(user, pass);
        if (sessionPlayer == null) {
            view.showInvalidUser();
        } else {
            SessionController sc = new SessionController(sessionPlayer);
            sc.loadSession();
        }
    }

    /**
     * Metodo que inicia a aplicacion
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos os datos de partida
        Player player1 = new Player("luisf", "abc", "Luis Fdez", 2.5, 25.90);
        Player player2 = new Player("maria", "abc", "Maria Insua", 2.83, 70);
        PadelCourt court1 = new PadelCourt(1, PadelCourt.DOUBLE, new String[] {"9:00", "11:00", "13:00", "16:00"});
        PadelCourt court2 = new PadelCourt(2, PadelCourt.SINGLE, new String[] {"9:00", "11:00", "13:00", "16:00"});
        PadelCourt court3 = new PadelCourt(3, PadelCourt.DOUBLE, new String[] {"9:00", "11:00"});
        // Engadimos os datos á base de datos
        PadelManagerDB.getPlayers().put(player1.getId(), player1);
        PadelManagerDB.getPlayers().put(player2.getId(), player2);
        PadelManagerDB.getCourts().add(court1);
        PadelManagerDB.getCourts().add(court2);
        PadelManagerDB.getCourts().add(court3);
        // Creamos un obxecto InitMenuController para iniciar a aplicacion
        InitMenuController imc = new InitMenuController();
        imc.initApp();
    }
    
}
