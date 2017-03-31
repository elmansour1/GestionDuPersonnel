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
            PreparedStatement p = connection.prepareStatement("INSERT INTO permission(code) VAlUES(?)");
            p.setString(1,permission.getCode());
            p.execute();
        } catch (SQLException e) {
            Logger.getLogger(PermissionDaoImpl.class.getName()).log(Level.SEVERE,null,e);
        }
        return null;
    }

    @Override
    public Permission updatePersmission(Permission permission) {
        
        try {
            PreparedStatement p = connection.prepareStatement("UPDATE permission set code=?");
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
