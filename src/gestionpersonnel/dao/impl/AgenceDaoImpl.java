/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.dao.impl;

import gestionpersonnel.connexion.ConnectionFactory;
import gestionpersonnel.dao.IAgenceDao;
import gestionpersonnel.data.Agence;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class AgenceDaoImpl implements IAgenceDao{
    
    private Connection connection;
    
    public AgenceDaoImpl(){
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public Agence createAgence(Agence agence) {
        
        try {
            PreparedStatement p = connection.prepareStatement("INSERT INTO agence(nom_agence,localisation) VALUES(?,?)");
            p.setString(1, agence.getNom_agenece());
            p.setString(2, agence.getLocalisation());
            p.execute();
        } catch (SQLException e) {
            Logger.getLogger(AgenceDaoImpl.class.getName()).log(Level.SEVERE,null,e);
        }
        
        return null;
    }

    @Override
    public Agence updateAgence(Agence agence) {
        
        try {
            PreparedStatement p = connection.prepareStatement("UPDATE agence set nom=?,localisation=?");
            p.setString(1, agence.getNom_agenece());
            p.setString(2, agence.getLocalisation());
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AgenceDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public Agence findAgenceById(Long id) {
        
        Agence agence = new Agence();
        try {
            PreparedStatement p = connection.prepareStatement("SELECT * FROM agence WHERE id=?");
            p.setLong(1, id);
            ResultSet r = p.executeQuery();
            while(r.next()){
                agence.setNom_agenece(r.getString("nom"));
                agence.setLocalisation(r.getString("localisation"));
            }
            return agence;
        } catch (SQLException ex) {
            Logger.getLogger(AgenceDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void deleteAgence(Agence agence) {
        PreparedStatement p;
        
        try {
            p=connection.prepareStatement("DELETE FROM agence WHERE id=?;");
            p.setLong(1,agence.getId());
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AgenceDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
