/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.testDao;

import gestionpersonnel.dao.IPermissionDao;
import gestionpersonnel.dao.impl.PermissionDaoImpl;
import gestionpersonnel.data.Permission;

/**
 *
 * @author 
 */
public class Test3 {
    public static void main(String[] args) {
        IPermissionDao ipermission = new PermissionDaoImpl();
        Permission permission = new Permission();
        permission.setCode("12CA08");
        ipermission.createPersmission(permission);
    }
    
}
