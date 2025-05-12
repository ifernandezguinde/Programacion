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
public abstract class Booking {
    protected Date date;
    protected String hour;
    protected PadelCourt court;

    /**
     * constructor da clase que lle da o valor recibido as variables
     * @param date
     * @param hour
     * @param court 
     */
    public Booking(Date date, String hour, PadelCourt court) {
        this.date = date;
        this.hour = hour;
        this.court = court;
    }

    /**
     * devolve o valor de date
     * @return 
     */
    public Date getDate() {
        return date;
    }

    /**
     * modifica o valor de date
     * @param date 
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * devolve o valor de hour
     * @return 
     */
    public String getHour() {
        return hour;
    }

    /**
     * modifica o valor de hour
     * @param hour 
     */
    public void setHour(String hour) {
        this.hour = hour;
    }

    /**
     * devolve o valor de court
     * @return 
     */
    public PadelCourt getCourt() {
        return court;
    }

    /**
     * modifica o valor de court
     * @param court 
     */
    public void setCourt(PadelCourt court) {
        this.court = court;
    }
    
    
    /**
     * devolve o prezo que terá que pagar cada xogador  que se inscriba na reserva
     * @return 
     */
    public abstract int getPrice();
    
    /**
     * indica se a reserva xa está completa (porque están inscritos todos os 
     * xogadores posibles) ou non
     * @return 
     */
    public abstract boolean isCompleted();
    
    /**
     * indica se o xogador que recibe como parámetro está inscrito na reserva ou non
     * @param id
     * @return 
     */
    public abstract boolean containsPlayer(String id);
    
    public String getDescription() {
        return"";
    }
    
    
}
