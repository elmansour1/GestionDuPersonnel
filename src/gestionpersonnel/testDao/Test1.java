/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.testDao;

import gestionpersonnel.dao.IAgenceDao;
import gestionpersonnel.dao.impl.AgenceDaoImpl;
import gestionpersonnel.data.Agence;

/**
 *
 * @author 
 */
public class Test1 {
    public static void main(String[] args) {
        IAgenceDao iagence = new AgenceDaoImpl();
        Agence agence = new Agence();
        agence.setNom_agenece("congelcam");
        agence.setLocalisation("Maroua");
        iagence.createAgence(agence);
    }
    
}
