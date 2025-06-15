/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ivan
 */
public class DatabaseConnection {
    private static Connection connection = null;
    
    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:sqlite:/home/ivan.fernandezguinde/a_IVAN/a_Programacion/Programacion/sql-java/Myfirstdb.db");
                System.out.println("Conexion realizada");
            } catch (SQLException e) {
                System.out.println("error ao conectarse a base de datos" + e.getMessage());
            }
        }
        return connection;
    }
    
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
                System.out.println("conexion cerrada");
            } catch (SQLException e) {
                System.out.println("erro ao cerrar a base de datos" + e.getMessage());
            }
        }
    }
    
}
