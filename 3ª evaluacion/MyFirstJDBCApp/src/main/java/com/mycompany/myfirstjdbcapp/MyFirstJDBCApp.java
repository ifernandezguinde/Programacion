/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.myfirstjdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ivan.fernandezguinde
 */
public class MyFirstJDBCApp {

    public static void main(String[] args) {

        try (Connection c = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bd_curso", "", "")) {
            System.out.println("Conexion realizada con exito");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 

    }
}
