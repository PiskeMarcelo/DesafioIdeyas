/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Haunter
 */
public class NewClass {
 
  
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://locahost:3306/serviço", "root", "");

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
            
        }
    }
}

