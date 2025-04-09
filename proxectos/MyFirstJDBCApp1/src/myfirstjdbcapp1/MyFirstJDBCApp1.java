/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstjdbcapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ivan.fernandezguinde
 */
public class MyFirstJDBCApp1 {

    public static void main(String args[]) {

        try (Connection c = DriverManager.getConnection(
                "jdbc:sqlite:/home/ivan.fernandezguinde/a_IVAN/a_Programacion/Programacion/sql-java/Myfirstdb.db", "", "")) {
            System.out.println("Conexion realizada con exito");

            String sql = "INSERT INTO clients VALUES('Omar espabila')";
            Statement st = c.createStatement();
            st.executeUpdate(sql);
            st.close(); //poñer sempre o close

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
