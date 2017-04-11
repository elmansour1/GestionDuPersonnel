/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.dao.impl;

import gestionpersonnel.connexion.ConnectionFactory;
import gestionpersonnel.dao.IPermissionDao;
import gestionpersonnel.data.Employe;
import gestionpersonnel.data.Permission;
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
public class PermissionDaoImpl implements IPermissionDao{
    private Connection connection;
    
    public PermissionDaoImpl(){
        this.connection = ConnectionFactory.getConnection();
    }
    @Override
    public Permission createPersmission(Permission permission) {
        try {
            PreparedStatement p = connection.prepareStatement("INSERT INTO permission(code,motif,objet,mat,"
                    + "nom,prenom,dateN,dateF,adresse,sexe,fonction,categorie) VAlUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            p.setString(1,permission.getCode());
            p.setString(2, permission.getMotifP());
            p.setString(3, permission.getObjetP());
            p.setString(4, permission.getMat());
            p.setString(5, permission.getNomP());
            p.setString(6, permission.getPrenomP());
            p.setString(7, permission.getDateN());
            p.setString(8, permission.getDateF());
            p.setString(9, permission.getAdresseP());
            p.setString(10, permission.getSexeP());
            p.setString(11, permission.getFonction());
            p.setString(12, permission.getCategorie());
            p.execute();
        } catch (SQLException e) {
            Logger.getLogger(PermissionDaoImpl.class.getName()).log(Level.SEVERE,null,e);
        }
        return null;
    }

    @Override
    public Permission updatePersmission(Permission permission) {
        
        try {
            PreparedStatement p = connection.prepareStatement("UPDATE permission set code=?,motif=?,objet=?,mat=?,"
                    + "nom=?,prenom=?,dateN=?,dateF=?,"
                    + "adresse=?,sexe=?,fonction=?,categorie=?");
            p.setString(1,permission.getCode());
            p.setString(2, permission.getMotifP());
            p.setString(3, permission.getObjetP());
            p.setString(4, permission.getMat());
            p.setString(5, permission.getNomP());
            p.setString(6, permission.getPrenomP());
            p.setString(7, permission.getDateN());
            p.setString(8, permission.getDateF());
            p.setString(9, permission.getAdresseP());
            p.setString(10, permission.getSexeP());
            p.setString(11, permission.getFonction());
            p.setString(12, permission.getCategorie());
           
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PermissionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Permission findPermissionByCode(String code) {
        Permission permission = new Permission();
        
        try {
            PreparedStatement p = connection.prepareStatement("SELECT * FROM permission WHERE code=?");
            p.setString(1,code);
            ResultSet r = p.executeQuery();
            
            while(r.next()){
                permission.setCode(r.getString("code"));
            }
            return permission;
        } catch (SQLException ex) {
            Logger.getLogger(PermissionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void deletePermission(Permission permission) {
        PreparedStatement p;
        
        try {
            p=connection.prepareStatement("DELETE FROM permission WHERE code=?;");
            p.setString(1,permission.getCode());
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PermissionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Collection<Permission> findPermissionByEmploye(Employe employe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
