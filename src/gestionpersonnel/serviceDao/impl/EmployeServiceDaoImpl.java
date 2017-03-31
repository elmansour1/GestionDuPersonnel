/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.serviceDao.impl;

import gestionpersonnel.dao.IEmployeDao;
import gestionpersonnel.dao.impl.EmployeDaoImpl;
import gestionpersonnel.data.Employe;
import gestionpersonnel.serviceDao.IEmployeServiceDao;
import java.util.Collection;

/**
 *
 * @author 
 */
public class EmployeServiceDaoImpl implements IEmployeServiceDao{
    IEmployeDao iemploye = new EmployeDaoImpl();
    @Override
    public Employe createEmploye(Employe employe) {
        return iemploye.createEmploye(employe);
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        return iemploye.updateEmploye(employe);
    }

    @Override
    public Employe findEmployeByMatricule(String matricule) {
        return iemploye.findEmployeByMatricule(matricule);
    }

    @Override
    public Collection<Employe> findAll() {
        return iemploye.findAll();
    }

    @Override
    public void deleteEmploye(Employe employe) {
        iemploye.deleteEmploye(employe);
    }
    
    
}
