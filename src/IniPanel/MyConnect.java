/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IniPanel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Haunter
 */

public class MyConnect {  
    public static Connection conector(){
            java.sql.Connection conexao = null;
            
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/serviço";
            String user = "root";
            String pass = "";
            
          try{  
            Class.forName(driver);
             conexao = DriverManager.getConnection(url, user, pass);
             return conexao;
            
        } catch (ClassNotFoundException | SQLException e) {
              System.out.println(e);
            return null;
        
        }
    }
  

   
              
    }



  