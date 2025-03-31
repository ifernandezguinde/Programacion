package padelmanager.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import padelmanager.db.BookingDB;
import padelmanager.db.PadelCourtDB;
import padelmanager.model.Booking;
import padelmanager.model.DoubleBooking;
import padelmanager.model.PadelCourt;
import padelmanager.model.Player;
import padelmanager.model.SingleBooking;
import padelmanager.view.SelectBookingJDialog;
import padelmanager.view.SessionView;

/**
 * Clase que controla o comportamento da sesión do usuario
 * @author Profe de programación
 */
public class SessionController {
    // Atributos privados
    private SessionView view;
    private Player sessionPlayer;

    // Métodos de acceso aos atributos. Omitese o Javadoc
    public Player getSessionPlayer() {
        return sessionPlayer;
    }

    public void setSessionPlayer(Player sessionPlayer) {
        this.sessionPlayer = sessionPlayer;
    }
    
    /**
     * Crea un novo controlador
     * @param sessionPlayer Xogador que iniciou a sesión
     */
    public SessionController(Player sessionPlayer) {
        this.sessionPlayer = sessionPlayer;
        view = new SessionView(this);
    }
    
    /**
     * Carga as reservas que ten o xogador da sesión e mostra o menu da sesión 
     */
    public void loadSession() {
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        ArrayList<Booking> bookings = BookingDB.findByUserAndDate(
                sessionPlayer.getId(), today.getTime());
        view.showSessionMenu(bookings);
    }
    
    /**
     * Crea unha nova reserva
     * @param bookingDate Data na que se quere facer a reserva
     */
    public void createBooking(Date bookingDate) {
        ArrayList<PadelCourt> courts = PadelCourtDB.getAllCourts();
        ArrayList<Booking> bookings = BookingDB.findByDate(bookingDate);
        view.selectCourtAndHour(bookingDate, courts, bookings);
    }
    
    /**
     * Crea a reserva cos datos indicados e a garda, recargando despois o menú
     * da sesión do xogador
     * @param bookingDate Data da reserva
     * @param court Pista da reserva
     * @param hour Hora da reserva
     */
    public void completeBooking(Date bookingDate, PadelCourt court, String hour) {
        Booking booking;
        // Creamos o tipo de reserva que corresponda e engadimos o xogador
        if (court.getType() == PadelCourt.SINGLE) {
            booking = new SingleBooking(bookingDate, hour, court);
            ((SingleBooking)booking).addPlayer(sessionPlayer);
        } else {
            booking = new DoubleBooking(bookingDate, hour, court);
            ((DoubleBooking)booking).addPlayer(sessionPlayer, 0);
        }        
        // Gardamos a reserva
        BookingDB.save(booking);
        // Recargamos a sesión
        loadSession();
    }
    
    /**
     * Engade ao xogador da sesión a unha reserva da data indicada
     * @param bookingDate Data na que o xogador quere xogar
     */
    public void addPlayerToBooking(Date bookingDate) {
        // Obtemos as reservas para unha data e collemos as que non están completas
        ArrayList<Booking> bookings = BookingDB.findByDate(bookingDate);
        ArrayList<Booking> incompletedBookings = new ArrayList<>();
        for (Booking booking:bookings) {
            if (!booking.isCompleted()) {
                incompletedBookings.add(booking);
            }
        }
        // Mostramos o cadro de diálogo coas reservas que queremos dar a escoller
        SelectBookingJDialog dialog = new SelectBookingJDialog(null, true);
        dialog.setBookings(incompletedBookings);
        dialog.setVisible(true);
        // Se o usuario acepta a acción, obtemos a reserva seleccionada e se non
        // contén ao xogador da sesión, engadimos o xogador á reserva (no caso
        // de ser dobre obtemos tamén o equipo no que se quere engadir) e actualizámola
        if (dialog.isActionAccepted()) {
            Booking selectedBooking = dialog.getSelectedBooking();
            if (!selectedBooking.containsPlayer(sessionPlayer.getId())) {
                if (selectedBooking.getCourt().getType() == PadelCourt.SINGLE) {
                    ((SingleBooking) selectedBooking).addPlayer(sessionPlayer);
                } else {
                    ((DoubleBooking) selectedBooking).addPlayer(sessionPlayer,
                            dialog.getSelectedTeam());
                }
                BookingDB.update(selectedBooking);
            }
        }
        // Cargamos de novo a sesión
        loadSession();
    }
    
    /**
     * Exporta as reservas a un ficheiro de texto
     * @param bookings Lista de reservas
     * @param path Ruta do ficheiro que imos xerar
     */
    public void exportBookings(ArrayList<Booking> bookings, String path) {
        // Declaramos o writer con buffer
        BufferedWriter out = null;
        try {
            // Abrimos o writer e escribimos a descrición de todas as reservas
            out = new BufferedWriter(new FileWriter(path));
            for (Booking booking : bookings) {
                out.write(booking.getDescription());
                out.newLine();
            }
            // Non sería necesario, pero forzamos o volcado do buffer ao rematar
            // e pechámolo
            out.flush();
            out.close();
        } catch (IOException e) {
            System.out.println("Erro ao escribir no ficheiro: " + e.getMessage());
        }
    }
}
