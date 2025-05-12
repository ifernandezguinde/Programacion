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
public class SingleBooking extends Booking {

    /**
     * constructor da clase que asigna os valores recibidos as variables
     * @param date
     * @param hour
     * @param court 
     */
    public SingleBooking(Date date, String hour, PadelCourt court) {
        super(date, hour, court);
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public boolean isCompleted() {
        // false se algún xogador do array de players é null
        
        return true;
    }

    @Override
    public boolean containsPlayer(String id) {
        // true se o id está no array de players
        return false;
    }

    @Override
    public String getDescription() {
        //texto cos datos
        return "";
    }
    
    
    public players[] addPlayer(Player player) {
        
    }
    
    
}
