/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.dao.impl;

import gestionpersonnel.connexion.ConnectionFactory;
import gestionpersonnel.dao.IEmployeDao;
import gestionpersonnel.data.Employe;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class EmployeDaoImpl implements IEmployeDao{
    
    private Connection connection;
    
    public EmployeDaoImpl(){
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public Employe createEmploye(Employe employe) {
 
        try {
            PreparedStatement p= connection.prepareStatement("INSERT INTO employe(matricule,"
                    + "nom,prenom,dateNaissance,dateDePriseFonction,adresse,sexe,fonction,categorie) VALUES(?,?,?,?,?,?,?,?,?)");
            p.setString(1, employe.getMatricule());
            p.setString(2, employe.getNom());
            p.setString(3, employe.getPrenom());
            p.setString(4,employe.getDateNaissance());
            p.setString(5,employe.getDateDePriseDeFonction());
            p.setString(6, employe.getAdresse());
            p.setString(7, employe.getSexe());
            p.setString(8, employe.getFonction());
            p.setString(9, employe.getCategorie());
            p.execute();
        } catch (SQLException e) {
            Logger.getLogger(EmployeDaoImpl.class.getName()).log(Level.SEVERE, null,e);
        }
        
        return null; 
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        try {
            PreparedStatement p = connection.prepareStatement("UPDATE employe set matricule=?,nom=?,prenom=?,dateNaissance=?," 
                    + "dateDePriseDeFonction=?,adresse=?,sexe=?");
            p.setString(1, employe.getMatricule());
            p.setString(2, employe.getNom());
            p.setString(3, employe.getPrenom());
            p.setString(4, employe.getDateNaissance());
            p.setString(5,employe.getDateDePriseDeFonction());
            p.setString(6, employe.getAdresse());
            p.setString(7, employe.getSexe());
            p.setString(8, employe.getFonction());
            p.setString(9, employe.getCategorie());
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
  

    @Override
    public Employe findEmployeByMatricule(String matricule) {
        try {
            Employe employe = new Employe();
            PreparedStatement p = connection.prepareStatement("SELECT * FROM employe WHERE matricule=?");
            p.setString(1, matricule);
            ResultSet r= p.executeQuery();
            while(r.next()){
                employe.setMatricule(r.getString("matricule"));
                employe.setNom(r.getString("nom"));
                employe.setPrenom(r.getString("prenom"));
                employe.setDateNaissance(r.getString("dateDeNaissance"));
                employe.setDateDePriseDeFonction(r.getString("dateDePriseFonction"));
                employe.setAdresse(r.getString("adresse"));
                employe.setSexe(r.getString("sexe"));
                employe.setFonction(r.getString("fonction"));
                employe.setCategorie(r.getString("categorie"));
            }
            return employe;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Collection<Employe> findAll() {
        Collection<Employe> listEmploye = new ArrayList<>();
        try {
            PreparedStatement p = connection.prepareStatement("SELECT * FROM employe");
             ResultSet r= p.executeQuery();
            while(r.next()){
                Employe employe = new Employe(); 
                employe.setMatricule(r.getString("matricule"));
                employe.setNom(r.getString("nom"));
                employe.setPrenom(r.getString("prenom"));
                employe.setDateNaissance(r.getString("dateDeNaissance"));
                employe.setDateDePriseDeFonction(r.getString("dateDePriseFonction"));
                employe.setAdresse(r.getString("adresse"));
                employe.setSexe(r.getString("sexe"));
                employe.setFonction(r.getString("fonction"));
                employe.setCategorie(r.getString("categorie"));
                listEmploye.add(employe);
            }
            return listEmploye;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void deleteEmploye(Employe employe) {
        PreparedStatement p;
        
        try {
            p = connection.prepareStatement("DELETE FROM employe WHERE matricule= ?;");
            p.setString(1, employe.getMatricule());
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}