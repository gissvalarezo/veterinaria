/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gvalarezo
 */
public class Conexion {
    private Connection conexion;
    private Statement st;
    
    public Conexion() {
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "junior");
            st = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet CONSULTAR(String sql) throws SQLException {
        return st.executeQuery(sql);
    }
    
    public int GUARDAR(String sql) throws SQLException {
        return st.executeUpdate(sql);
    }
    
    public void CERRAR() {
        try {
            conexion.close();
        } catch (SQLException ex) {
          Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);  
        }
    } 
}
