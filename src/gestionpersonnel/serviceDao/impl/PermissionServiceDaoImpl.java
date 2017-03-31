/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.serviceDao.impl;

import gestionpersonnel.dao.IPermissionDao;
import gestionpersonnel.dao.impl.PermissionDaoImpl;
import gestionpersonnel.data.Employe;
import gestionpersonnel.data.Permission;
import gestionpersonnel.serviceDao.IPermissionServiceDao;
import java.util.Collection;

/**
 *
 * @author 
 */
public class PermissionServiceDaoImpl implements IPermissionServiceDao{
    IPermissionDao ipermission = new PermissionDaoImpl();
    @Override
    public Permission createPersmission(Permission permission) {
        return ipermission.createPersmission(permission);
    }

    @Override
    public Permission updatePersmission(Permission permission) {
        return ipermission.updatePersmission(permission);
    }

    @Override
    public Permission findPermissionByCode(String code) {
        return ipermission.findPermissionByCode(code);
    }

    @Override
    public void deletePermission(Permission permission) {
        ipermission.deletePermission(permission);
    }

    @Override
    public Collection<Permission> findPermissionByEmploye(Employe employe) {
        return ipermission.findPermissionByEmploye(employe);
    }
    
    
    
    
}
