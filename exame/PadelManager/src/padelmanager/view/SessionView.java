package padelmanager.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import padelmanager.controller.SessionController;
import padelmanager.model.Booking;
import padelmanager.model.PadelCourt;

/**
 * Clase que implementa a vista do menú de sesión
 * @author Profe de programacion
 */
public class SessionView {
    // Referenza ao obxecto controlador do menu de inicio de sesion
    private SessionController controller;

    /**
     * Crea unha nova vista para o menú da sesión
     * @param controller Obxecto controlador da sesión 
     */
    public SessionView(SessionController controller) {
        this.controller = controller;
    }

    /**
     * Mostra o menú da sesión do usuario
     * @param bookings Reservas nas que está inscrito o xogador da sesión a
     * partir da data actual
     */
    public void showSessionMenu(ArrayList<Booking> bookings) {
        int option;
        Date bookingDate = null;
        Scanner scan = new Scanner(System.in);
        // Mostramos o menú da sesión ata que o usuario introduza unha opción
        // correcta
        do {
            // Mostramos a información do usuario
            System.out.println("Benvid@, " + controller.getSessionPlayer().getName());
            System.out.println("Saldo actual: " + controller.getSessionPlayer().getBalance());
            System.out.println("As tuas reservas:");
            for (Booking booking : bookings) {
                System.out.println(booking.getDescription());
            }
            System.out.println();
            // Mostramos as opcións do menú e pedimos unha opción
            System.out.println("Que queres facer?");
            System.out.println("1. Crear unha reserva para un partido");
            System.out.println("2. Apuntarme a un partido");
            System.out.println("3. Pechar a sesión");
            System.out.println("4. Exportar as miñas reservas");
            option = scan.nextInt();
            scan.nextLine();
            // Se a opción seleccionada é a 1 ou 2, pedimos ao xogador que 
            // introduza unha data para o partido
            if ((option == 1) || (option == 2)) {
                boolean dateOk;
                do {
                    dateOk = true;
                    try {
                        System.out.println("Introduce a data para o partido (dd/mm/yyyy):");
                        bookingDate = new SimpleDateFormat("dd/MM/yyyy").parse(scan.nextLine());
                    } catch (ParseException e) {
                        System.out.println("A data introducida non e correcta");
                        dateOk = false;
                    }
                } while (!dateOk);
            }
            // Executamos o que corresponda segundo a opción seleccionada
            switch (option) {
                case 1:
                    controller.createBooking(bookingDate);
                    break;
                case 2:
                    controller.addPlayerToBooking(bookingDate);
                    break;
                case 3:
                    System.out.println("Ata a vista!");
                    break;
                case 4:
                    System.out.println("Introduce a ruta do ficheiro:");
                    String path = scan.nextLine();
                    controller.exportBookings(bookings, path);
                    break;
                default:
                    System.out.println("Opcion non permitida");
            }
        } while ((option < 1) && (option > 4));
    }

    /**
     * Pide ao xogador que selecciona unha pista e unha hora dispoñible para
     * facer unha reserva
     * @param bookingDate Data da reserva
     * @param courts Lista de todas as pists
     * @param bookings Lista de reservas xa feitas para a data
     */
    public void selectCourtAndHour(Date bookingDate, ArrayList<PadelCourt> courts,
            ArrayList<Booking> bookings) {
        Scanner scan = new Scanner(System.in);
        // Mostramos todas as pistas coas súas horas dispoñibles
        System.out.println("Estas son as horas dispoñibles para a data seleccionada:");
        for (PadelCourt court : courts) {
            System.out.print("Pista " + court.getNumber());
            if (court.getType() == PadelCourt.SINGLE) {
                System.out.println(" (Individual)");
            } else {
                System.out.println();
            }
            System.out.print("Horas dispoñibles: ");
            for (String hour : court.getBookingHours()) {
                boolean isReserved = false;
                for (Booking booking : bookings) {
                    if ((booking.getCourt().getNumber() == court.getNumber())
                            && (booking.getHour().equals(hour))) {
                        isReserved = true;
                    }
                }
                if (!isReserved) {
                    System.out.print(hour + " ");
                }
            }
            System.out.println();
        }
        // Pedimos ao usuario que indique o número de pista e a hora
        System.out.println("Indica o numero de pista:");
        int courtNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Indica a hora para o partido");
        String hour = scan.nextLine();
        // Obtemos a pista e chamamos ao controlador para completar a reserva
        PadelCourt selectedCourt = null;
        for (PadelCourt court : courts) {
            if (court.getNumber() == courtNumber) {
                selectedCourt = court;
            }
        }
        controller.completeBooking(bookingDate, selectedCourt, hour);
    }
}
