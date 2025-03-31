package padelmanager.model;

/**
 * Clase que implementa unha pista de pádel
 * @author Profe de programación
 */
public class PadelCourt {
    /**
     * Constante para establecer o tipo dunha pista como individual
     */
    public static final int SINGLE = 1;
    /**
     * Constante para establecer o tipo dunha pista como dobre
     */
    public static final int DOUBLE = 2;
    
    // Atributos privados
    private int number;
    private int type;
    private String[] bookingHours;

    // Métodos de acceso aos atributos. Omítese o Javadoc
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String[] getBookingHours() {
        return bookingHours;
    }

    public void setBookingHours(String[] bookingHours) {
        this.bookingHours = bookingHours;
    }
    
    /**
     * Crea unha nova pista de pádel
     * @param number Número da pista
     * @param type Tipo de pista (SINGLE ou DOUBLE)
     * @param bookingHours Horas ás que se pode reservar a pista
     */
    public PadelCourt(int number, int type, String[] bookingHours) {
        this.number = number;
        this.type = type;
        this.bookingHours = bookingHours;
    }
}