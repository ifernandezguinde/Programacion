package padelmanager.model;

import java.util.Date;

/**
 * Clase que implementa unha reserva individual
 *
 * @author Profe de programación
 */
public class SingleBooking extends Booking {

    // Atributos privados
    private Player[] players;

    // Métodos de acceso aos atributos. Omitese o Javadoc
    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    /**
     * Crea unha nova reserva individual
     *
     * @param date Data da reserva
     * @param hour Hora de comezo da reserva, en formato "hh:mm"
     * @param court Pista reservada
     */
    public SingleBooking(Date date, String hour, PadelCourt court) {
        super(date, hour, court);
        players = new Player[2];
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean isCompleted() {
        for (Player p : players) {
            if (p == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsPlayer(String playerId) {
        for (Player p : players) {
            if ((p != null) && (p.getId().equals(playerId))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        String description = super.getDescription() + "  Xogadores: ";
        for (Player p : players) {
            if (p == null) {
                description += "PENDENTE ";
            } else {
                description += p.getId() + " (" + p.getScore() + ") ";
            }
        }
        return description;
    }

    /**
     * Engade a un xogador á reserva
     * @param p Xogador a engadir na reserva
     */
    public void addPlayer(Player p) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                players[i] = p;
                return;
            }
        }
    }
}
