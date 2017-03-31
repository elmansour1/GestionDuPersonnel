/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.testDao;

import gestionpersonnel.dao.IEmployeDao;
import gestionpersonnel.dao.impl.EmployeDaoImpl;
import gestionpersonnel.data.Employe;

/**
 *
 * @author 
 */
public class Test {
    public static void main(String[] args) {
        IEmployeDao iemploye = new EmployeDaoImpl();
        Employe employe = new Employe();
        employe.setMatricule("14A341s");
        employe.setNom("mansour");
        employe.setPrenom("faouzi");
        employe.setAdresse("garoua");
        employe.setSexe("masculin");
        employe.setFonction("livreur");
        employe.setCategorie("B");
        iemploye.createEmploye(employe);
        
    }
    
}
