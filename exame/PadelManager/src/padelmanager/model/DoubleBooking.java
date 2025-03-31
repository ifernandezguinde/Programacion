package padelmanager.model;

import java.util.Date;

/**
 * Clase que implementa unha reserva dobre
 * @author Profe de programación
 */
public class DoubleBooking extends Booking {

    // Atributos privados
    private Player[][] teams;

    // Métodos de acceso aos atributos. Omitese o Javadoc
    public Player[][] getTeams() {
        return teams;
    }

    public void setTeams(Player[][] teams) {
        this.teams = teams;
    }

    /**
     * Crea unha nova reserva dobre
     * @param date Data da reserva
     * @param hour Hora de comezo da reserva, en formato "hh:mm"
     * @param court Pista reservada
     */
    public DoubleBooking(Date date, String hour, PadelCourt court) {
        super(date, hour, court);
        teams = new Player[2][2];
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean isCompleted() {
        for (Player[] team : teams) {
            for (Player p : team) {
                if (p == null) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean containsPlayer(String playerId) {
        for (Player[] team : teams) {
            for (Player p : team) {
                if ((p != null) && (p.getId().equals(playerId))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        String description = super.getDescription() + "  Xogadores: ";
        for (int i = 0; i < teams.length; i++) {
            description += "Equipo " + (i + 1) + ": ";
            for (Player p : teams[i]) {
                if (p==null) {
                    description += "PENDENTE ";
                } else {
                    description += p.getId() + " (" + p.getScore() + ") ";
                }
            }
        }
        return description;
    }

    /**
     * Engade a un xogador á reserva
     * @param p Xogador a engadir na reserva
     * @param teamNumber Número do equipo no que se quere engadir o xogador
     */
    public void addPlayer(Player p, int teamNumber) {
        for (int i=0; i<teams[teamNumber].length; i++) {
            if (teams[teamNumber][i] == null) {
                teams[teamNumber][i] = p;
                return;
            }
        }
    }
}
