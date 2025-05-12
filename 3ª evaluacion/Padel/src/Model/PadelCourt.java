/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.InitMenuController;
import db.PadelManagerDB;

/**
 *
 * @author ivan.fernandezguinde
 */
public class PadelCourt {
    private int number, type;
    private String[] bookingHours;
    private static final int SINGLE = 1;
    private static final int DOUBLE = 2;

    /**
     * constructor da clase que mete os parámetros que recibe nas variables
     * @param number
     * @param type
     * @param bookingHours 
     */
    public PadelCourt(int number, int type, String[] bookingHours) {
        this.number = number;
        this.type = type;
        this.bookingHours = bookingHours;
    }

    

    /**
     * devolve o valor de number
     * @return 
     */
    public int getNumber() {
        return number;
    }

    /**
     * modifica o valor de number
     * @param number 
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * devolve o valor de type
     * @return 
     */
    public int getType() {
        return type;
    }

    /**
     * modifica o valor de type
     * @param type 
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * devolve o valor de bookingHours
     * @return 
     */
    public String[] getBookingHours() {
        return bookingHours;
    }

    /**
     * modifica o valor de bookingHours
     * @param bookingHours 
     */
    public void setBookingHours(String[] bookingHours) {
        this.bookingHours = bookingHours;
    }
    
    
    /**
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
