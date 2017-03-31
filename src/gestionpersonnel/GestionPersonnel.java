/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel;

import gestionpersonnel.controlleur.MainController;
import gestionpersonnel.serviceDao.IAffectationServiceDao;
import gestionpersonnel.serviceDao.IAgenceServiceDao;
import gestionpersonnel.serviceDao.IEmployeServiceDao;
import gestionpersonnel.serviceDao.IPermissionServiceDao;
import gestionpersonnel.serviceDao.impl.AffectationServiceDaoImpl;
import gestionpersonnel.serviceDao.impl.AgenceServiceDaoImpl;
import gestionpersonnel.serviceDao.impl.EmployeServiceDaoImpl;
import gestionpersonnel.serviceDao.impl.PermissionServiceDaoImpl;
import gestionpersonnel.vue.MainPrincipal;

/**
 *
 * @author 
 */
public class GestionPersonnel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainPrincipal mp = new MainPrincipal();
        IEmployeServiceDao iemploye = new EmployeServiceDaoImpl();
        IAffectationServiceDao iAffectationServiceDao = new AffectationServiceDaoImpl();
        IAgenceServiceDao iAgenceServiceDao = new AgenceServiceDaoImpl();
        IPermissionServiceDao iPermissionServiceDao = new PermissionServiceDaoImpl();
        MainController main = new MainController(mp, iemploye, iAgenceServiceDao, iAffectationServiceDao, iPermissionServiceDao);
    }
    
}
