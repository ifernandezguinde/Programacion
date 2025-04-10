/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstjdbcapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author ivan.fernandezguinde
 */
public class MyFirstJDBCApp {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

                       // STATEMENT
                       
//        try (Connection c = DriverManager.getConnection(
//                "jdbc:sqlite:/home/ivan.fernandezguinde/a_IVAN/a_Programacion/Programacion/sql-java/Myfirstdb.db")) {
//            System.out.println("Conexion realizada con exito");
//            System.out.println("introduza o nome do usuario: ");
//            
//            String name = scan.nextLine();
//
//            String sql = "INSERT INTO clients VALUES('" + name + "')";
//            try (Statement st = c.createStatement()) {
//                st.executeUpdate(sql);
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Erro: "+ e.getMessage());
//        }




                      //PREPAREDSTATEMENT
                      
        try (Connection c = DriverManager.getConnection(
                "jdbc:sqlite:/home/ivan.fernandezguinde/a_IVAN/a_Programacion/Programacion/sql-java/Myfirstdb.db")) {
            System.out.println("Conexion realizada con exito");
            System.out.println("introduza o nome do usuario: ");

            String name = scan.nextLine();

            String sql = "INSERT INTO clients VALUES(?)";
            try (PreparedStatement st = c.prepareStatement(sql)) {
                st.setString(1, name);
                st.executeUpdate();
            }
            
            System.out.println("Dime unha letra: ");
            String letter = scan.nextLine();
            
            System.out.println("Lista de clientes que empezan por" + letter + ": ");
            String selectSQL = "SELECT name FROM clients WHERE name LIKE ?%";
            try (PreparedStatement st = c.prepareStatement(selectSQL)){
                st.setString(1, letter);
                    try (ResultSet rst = st.executeQuery()){
                
                
                    while (rst.next()) {
                        System.out.println("Nome: " + rst.getString("name"));
                    }
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
