/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public final class ConnectionFactory {
    
    private static final Connection connection = create();
    
    public static Connection create(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpersonnel","root","molavane");
        } catch (SQLException e) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE,null,e);
        }
        return null;
    }
    
    public static Connection getConnection(){
        return connection;
    }
    
    
}
