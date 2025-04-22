/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peliculas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try (Connection c = DriverManager.getConnection(
            "jdbc:mariadb://localhost:33006/peliculas", "admin", "daw2pass")) {
            System.out.println("Conexion realizada con exito");
        } catch (SQLException e) {
            System.out.println("A conexión co servidor de bases de datos non se puido establecer");
//          System.out.println(e.getMessage());
        }
    }

}
