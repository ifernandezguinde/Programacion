package padelmanager.db;

import java.util.ArrayList;
import java.util.Date;
import padelmanager.model.Booking;

/**
 * Clase que implementa a persistencia das reservas
 * @author Profe de programación
 */
public class BookingDB {
    
    /**
     * Busca todas as reservas dunha data determinada
     * @param date Data da que se queren obter as reservas
     * @return Lista coas reservas desa data
     */
    public static ArrayList<Booking> findByDate(Date date) {
        ArrayList<Booking> bookings = new ArrayList<>();
        for (Booking booking:PadelManagerDB.getBookings()) {
            if (booking.getDate().compareTo(date) == 0) {
                bookings.add(booking);
            }
        }
        
        return bookings;
    }
    
    /**
     * Busca todas as reservas para un xogador a partir dunha data
     * @param playerId Id do xogador
     * @param date Data a partir da que queremos ver as reservas
     * @return Lista coas reservas atopadas
     */
    public static ArrayList<Booking> findByUserAndDate(String playerId, Date date) {
        ArrayList<Booking> bookings = new ArrayList<>();
        for (Booking booking:PadelManagerDB.getBookings()) {
            if (booking.containsPlayer(playerId) && 
                    (booking.getDate().compareTo(date) >= 0)) {
                bookings.add(booking);
            }
        }
        
        return bookings;
    }
    
    /**
     * Almacena unha nova reserva
     * @param booking Reserva a gardar
     */
    public static void save(Booking booking) {
        PadelManagerDB.getBookings().add(booking);
    }
    
    /**
     * Actualiza unha reserva
     * @param booking Reserva a gardar
     */
    public static void update(Booking booking) {
        // Non hai que facer nada
    }
    
}
