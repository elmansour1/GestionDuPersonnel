/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.dao.impl;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import gestionpersonnel.connexion.ConnectionFactory;
import gestionpersonnel.dao.IAffectationDao;
import gestionpersonnel.data.Affectation;
import gestionpersonnel.data.Agence;
import gestionpersonnel.data.Employe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class AffectationDaoImpl implements IAffectationDao{
    
    private Connection connection;
    
    public AffectationDaoImpl(){
        this.connection = ConnectionFactory.getConnection();
    }
    
    @Override
    public Affectation createAffectation(Affectation affectation) {
        try {
            PreparedStatement p = connection.prepareStatement("INSERT INTO affectation(numero,motif,objet,nom,prenom,"
                    + "fonction,categorie,nomAgence,localisation) VALUES(?,?,?,?,?,?,?,?,?)");
            p.setString(1, affectation.getNumero());
            p.setString(2, affectation.getMotif());
            p.setString(3, affectation.getObjet());
            p.setString(4, affectation.getNomEmpl());
            p.setString(5, affectation.getPrenomEmpl());
            p.setString(6, affectation.getFonction());
            p.setString(7, affectation.getCategorie());
            p.setString(8, affectation.getNomAgence());
            p.setString(9, affectation.getLocalisation());
            p.execute();
        } catch (SQLException e) {
            Logger.getLogger(AffectationDaoImpl.class.getName()).log(Level.SEVERE,null,e);
        }
        return null;
    }

    @Override
    public Affectation updateAffectation(Affectation affectation) {
        
        try {
            PreparedStatement p = connection.prepareStatement("UPDATE affectation set numero=?,motif=?,objet=?,"
                    + "nom=?,prenom=?,dateNaissance=?,dateDePriseFonction=?,"
                    + "adresse=?,sexe=?,fonction=?,categorie=?,nomAgence=?,localisation=?");
            p.setString(1, affectation.getNumero());
            p.setString(2, affectation.getMotif());
            p.setString(3, affectation.getObjet());
            p.setString(4, affectation.getNomEmpl());
            p.setString(5, affectation.getPrenomEmpl());
           // p.setString(6, affectation.getDateNaissance());
            //p.setString(7, affectation.getDateDePrise());
            p.setString(8, affectation.getAdresse());
            p.setString(9, affectation.getSexe());
            p.setString(10, affectation.getFonction());
            p.setString(11, affectation.getCategorie());
            p.setString(12, affectation.getNomAgence());
            p.setString(13, affectation.getLocalisation());
          p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AffectationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Affectation findAffectationByNumber(String numero) {
       Affectation affectation = new Affectation();
        
        try {
            PreparedStatement p = connection.prepareStatement("SELECT * FROM affectation WHERE numero=?");
            p.setString(1, numero);
            ResultSet r = p.executeQuery();
            while(r.next()){
                affectation.setNumero(r.getString("numero"));
                affectation.setMotif(r.getString("motif"));
                affectation.setObjet(r.getString("objet"));
            }
            return affectation;
        } catch (SQLException ex) {
            Logger.getLogger(AffectationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Affectation findAllAffectation() {
        
        return null;
    }

    @Override
    public Collection<Affectation> listeAffectationParAgence(Agence agence) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Affectation> listeEmployeParAffectation(Employe employe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAffectation(Affectation affectation) {
        
        PreparedStatement p;
        
        try {
            p=connection.prepareStatement("DELETE FROM affectation WHERE numero=?;");
            p.setString(1, affectation.getNumero());
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AffectationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
