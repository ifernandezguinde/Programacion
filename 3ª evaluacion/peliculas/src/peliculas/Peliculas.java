/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peliculas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option, year;
        String title;

        try (Connection c = DriverManager.getConnection(
                "jdbc:SQLite://localhost:33006/peliculas.db", "admin", "daw2pass")) {
            System.out.println("Conexion realizada con exito");

            // exercicio 6.1.3, conectar con base de datos SQLite
//            CREATE TABLE IF NOT EXISTS films (
//            id INTEGER PRIMARY KEY AUTOINCREMENT,
//            title TEXT NOT NULL,
//            year INTEGER NOT NULL
//            );
            
            

            do {
                // Mostrar o menú
                System.out.println("\n*** MENÚ PRINCIPAL ***");
                System.out.println("1. Insertar unha nova película");
                System.out.println("2. Mostrar todas as películas");
                System.out.println("3. Mostrar unha películas");
                System.out.println("4. Pechar a aplicación");

                // Ler a opción do usuario
                option = scan.nextInt();
                scan.nextLine();

                // Evaluar a opción usando switch
                switch (option) {
                    case 1:
                        System.out.println("indica nome da película: ");
                        title = scan.nextLine();
                        System.out.println("agora introduce o ano da película: ");
                        year = scan.nextInt();
                        scan.nextLine();

                        String sql = "INSERT INTO films (title, year) VALUES(?, ?)";
                        try (PreparedStatement st = c.prepareStatement(sql)) {
                            st.setString(1, title);
                            st.setInt(2, year);
                            st.executeUpdate();
                            System.out.println("");
                            System.out.println("película añadida con éxito");
                        } catch (SQLException e) {
                            System.out.println("a película non puido ser añadida");
                            System.out.println(e.getMessage());
                        }

                        break;
                    case 2:
                        System.out.println("Listado das películas: ");
                        System.out.println("");
                        String selectSQL = "SELECT * FROM films";
                        try (PreparedStatement st = c.prepareStatement(selectSQL)) {
                            try (ResultSet rst = st.executeQuery()) {

                                while (rst.next()) {
                                    System.out.println("id: " + rst.getInt("id") + "  " + "titulo: " + rst.getString("title") + "  " + "ano: " + rst.getInt("year"));
                                }
                            }
                        } catch (SQLException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }

                        break;
                    case 3:
                        System.out.println("Dime o id da película: ");
                        int filter = scan.nextInt();

                        String selectSQL2 = "SELECT * FROM films WHERE id = ?";
                        try (PreparedStatement st = c.prepareStatement(selectSQL2)) {
                            st.setInt(1, filter);
                            try (ResultSet rst = st.executeQuery()) {

                                if (rst.next()) {
                                    System.out.println("id: " + rst.getInt("id") + "  " + "titulo: " + rst.getString("title") + "  " + "ano: " + rst.getInt("year"));
                                } else {
                                    System.out.println("non se atopou ningunha película con id: " + filter);
                                }
                            }
                        } catch (SQLException e) {
                            System.out.println("Erro:" + e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Opción non válida. Inténteo de novo.");
                }

            } while (option != 4);

            scan.close();

        } catch (SQLException e) {
            System.out.println("A conexión co servidor de bases de datos non se puido establecer");
            System.out.println(e.getMessage());
        }
    }

}
