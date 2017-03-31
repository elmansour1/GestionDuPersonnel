/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.testDao;

import gestionpersonnel.dao.IAffectationDao;
import gestionpersonnel.dao.impl.AffectationDaoImpl;
import gestionpersonnel.data.Affectation;

/**
 *
 * @author 
 */
public class Test2 {
    public static void main(String[] args) {
        IAffectationDao iaffetaion = new AffectationDaoImpl();
        Affectation affectation = new Affectation();
        affectation.setNumero("4120C");
        affectation.setMotif("dece");
        affectation.setObjet("demande d affectation");
        iaffetaion.createAffectation(affectation);
    }
    
}
