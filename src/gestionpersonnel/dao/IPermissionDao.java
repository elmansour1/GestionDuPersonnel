/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.dao;

import gestionpersonnel.data.Employe;
import gestionpersonnel.data.Permission;
import java.util.Collection;

/**
 *
 * @author 
 */
public interface IPermissionDao {
    public Permission createPersmission(Permission permission);
    public Permission updatePersmission(Permission permission);
    public Permission findPermissionByCode(String code);
    public void deletePermission(Permission permission);
    public Collection<Permission> findPermissionByEmploye(Employe employe);
    
}
