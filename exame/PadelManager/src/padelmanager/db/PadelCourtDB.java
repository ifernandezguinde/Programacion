package padelmanager.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import padelmanager.model.PadelCourt;

/**
 * Clase que implementa a persistencia das pistas
 *
 * @author Profe de programación
 */
public class PadelCourtDB {
    // Referencia á conexión coa base de datos
    private static Connection c = null;
    
    /**
     * Obtén a conexión coa base de datos
     */
    private static void getConnection() {
        try {
            // Obtemos unha conexión coa base de datos se non está establecida
            if (c==null) {
                c = DriverManager.getConnection("jdbc:sqlite:padel.db");
            }
        } catch (SQLException e) {
            System.out.println("Erro na conexión coa base de datos: " + e.getMessage());
        }
    }

    /**
     * Obtén todas as pistas
     *
     * @return Lista con todas as pistas
     */
    public static ArrayList<PadelCourt> getAllCourts() {
        // Creamos o ArrayList do resultado
        ArrayList<PadelCourt> courts = new ArrayList<>();
        try {
            // Obtemos a conexión coa base de datos e executamos a consulta
            getConnection();
            String query = "SELECT courts.number, courts.type, courtsHours.hour "
                    + "FROM courts left join courtsHours "
                    + "on courts.number=courtsHours.courtNumber "
                    + "order by courts.number";
            Statement st = c.createStatement();
            ResultSet rst = st.executeQuery(query);
            // Recorremos o resultado da consulta para crear as pistas do resultado
            boolean moreData = rst.next();
            while (moreData) {
                int courtNumber = rst.getInt("number");
                int courtType = rst.getInt("type");
                // Obtemos as horas da pista na que estamos
                ArrayList<String>courtHours = new ArrayList<>();
                do {
                    courtHours.add(rst.getString("hour"));
                    moreData = rst.next();
                } while ((moreData) && (rst.getInt("number") == courtNumber));
                // Transformamos o ArrayList de horas a un array
                String[] hours = new String[courtHours.size()];
                hours = courtHours.toArray(hours);
                // Engadimos a pista ao resultado
                courts.add(new PadelCourt(courtNumber, courtType, hours));
            }
            // Pechamos os recursos da base de datos
            rst.close();
            st.close();
        } catch (SQLException e) {
            System.out.println("Erro na conexión coa base de datos: " + e.getMessage());
        }
        return courts;
    }
}
