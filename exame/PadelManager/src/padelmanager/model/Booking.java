package padelmanager.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase abstracta que implementa unha reserva dunha pista
 * @author Profe de programación
 */
public abstract class Booking { 
    // Atributos protexidos, para poder usalos dende as subclases
    protected Date date;
    protected String hour;
    protected PadelCourt court;
    
    // Métodos de acceso aos atributos. Omitese o Javadoc
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public PadelCourt getCourt() {
        return court;
    }

    public void setCourt(PadelCourt court) {
        this.court = court;
    }
    
    /**
     * Crea unha nova reserva
     * @param date Data da reserva
     * @param hour Hora de comezo da reserva, en formato "hh:mm"
     * @param court Pista reservada
     */
    public Booking(Date date, String hour, PadelCourt court) {
        this.date = date;
        this.hour = hour;
        this.court = court;
    }
    
    /**
     * Obtén o prezo da reserva por cada xogador que participa no partido
     * @return Prezo por xogador
     */
    public abstract double getPrice();
    
    /**
     * Indica se a reserva xa está completa
     * @return true se todos os xogadores posibles están inscritos na reserva
     */
    public abstract boolean isCompleted();
    
    /**
     * Indica se o xogador co Id indicado está apuntado na reserva
     * @param playerId Id do xogador
     * @return true se o xogador está inscrito nesta reserva
     */
    public abstract boolean containsPlayer(String playerId);
    
    /**
     * Obtén unha descrición de texto dos datos da reserva
     * @return Descrición da reserva
     */
    public String getDescription() {
        String description;
        if (isCompleted()) {
            description = "Reserva completa:\n";
        } else {
            description = "Reserva pendente:\n";
        }
        description += "  Data: " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " Hora: " + hour;
        description +=" Pista: " + court.getNumber() + "\n";
        return description;
    }
    
}
