/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudaras;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author bogasXX
 */
public class Conect {
    Connection conex = null;
    
    
    public Connection conexion(){
     try {
            Class.forName("com.mysql.jdbc.Driver");
            conex = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/aras","root","");
         JOptionPane.showMessageDialog(null, "conecicion exitosa");
       
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error0" + ex.getMessage());
        }
    return conex;
        
    
    }
    
    
}
