/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.dao;

import gestionpersonnel.data.Employe;
import java.util.Collection;

/**
 *
 * @author 
 */
public interface IEmployeDao {
    public Employe createEmploye(Employe employe);
    public Employe updateEmploye(Employe employe);
    public Employe findEmployeByMatricule(String matricule);
    public Collection<Employe> findAll();
    public void deleteEmploye(Employe employe);
    
}
