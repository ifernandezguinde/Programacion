package padelmanager.db;

import java.util.ArrayList;
import java.util.HashMap;
import padelmanager.model.Booking;
import padelmanager.model.PadelCourt;
import padelmanager.model.Player;

/**
 * Clase que mantén as estruturas de datos que almacenan todos os obxectos da
 * aplicación
 * @author Profe de programación
 */
public class PadelManagerDB {
    // Atributos privados
    private static HashMap<String, Player> players = new HashMap<>();
    private static ArrayList<PadelCourt> courts = new ArrayList<>();
    private static ArrayList<Booking> bookings = new ArrayList<>();

    /**
     * Obtén todos os xogadores da aplicación
     * @return HashMap con todos os xogadores, co Id como chave
     */
    public static HashMap<String, Player> getPlayers() {
        return players;
    }

    /**
     * Obtén todas as pistas da aplicación
     * @return Lista con todas as pistas
     */
    public static ArrayList<PadelCourt> getCourts() {
        return courts;
    }

    /**
     * Obtén todas as reservas da aplicación
     * @return Lista con todas as reservas
     */
    public static ArrayList<Booking> getBookings() {
        return bookings;
    }
}
