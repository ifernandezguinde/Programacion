/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ivan
 */
public class LlamadaConnection {
    // poñer dentro do método que faga a consulta
    
    public void insertarPelicula(String tutilo, int anio) {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "INSERT INTO peliculas(titulo, anio) VALUES (?, ?)";
        
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "titulo");
            ps.setInt(2, anio);
            ps.executeUpdate();
            System.out.println("insertada correctamente");
        } catch (SQLException e) {
            System.out.println("error ao insertar" + e.getMessage());
        }
    }
    
}
