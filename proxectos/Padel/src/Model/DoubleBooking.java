/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author ivan.fernandezguinde
 */
public class DoubleBooking extends Booking {

    /**
     * constructor da clase que asigna os valores recibidos as variables
     * @param date
     * @param hour
     * @param court 
     */
    public DoubleBooking(Date date, String hour, PadelCourt court) {
        super(date, hour, court);
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public boolean isCompleted() {
        // devolve false se algún dos xogadores é null
        return true;
    }

    @Override
    public boolean containsPlayer(String id) {
        // devolve "true" se o Id de algún dos xogadores do array "teams" 
        // coincide co recibido como parámetro
        return false;
    }

    @Override
    public String getDescription() {
        // devolve un texto cos datos da reserva
        return "";
    }
    
    
    public players[] addPlayer(Player player, int equipo) {
        
    }
    
    
    
}
