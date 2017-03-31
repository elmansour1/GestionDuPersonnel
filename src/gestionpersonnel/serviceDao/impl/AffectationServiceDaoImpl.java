/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.serviceDao.impl;

import gestionpersonnel.dao.IAffectationDao;
import gestionpersonnel.dao.impl.AffectationDaoImpl;
import gestionpersonnel.data.Affectation;
import gestionpersonnel.data.Agence;
import gestionpersonnel.data.Employe;
import gestionpersonnel.serviceDao.IAffectationServiceDao;
import java.util.Collection;

/**
 *
 * @author 
 */
public class AffectationServiceDaoImpl implements IAffectationServiceDao{
    IAffectationDao iaffectation = new AffectationDaoImpl();
    @Override
    public Affectation createAffectation(Affectation affectation) {
        return iaffectation.createAffectation(affectation);
    }

    @Override
    public Affectation updateAffectation(Affectation affectation) {
        return iaffectation.updateAffectation(affectation);
    }

    @Override
    public Affectation findAffectationByNumber(String numero) {
        return iaffectation.findAffectationByNumber(numero);
    }

    @Override
    public Affectation findAllAffectation() {
        return iaffectation.findAllAffectation();
    }

    @Override
    public Collection<Affectation> listeAffectationParAgence(Agence agence) {
        return iaffectation.listeAffectationParAgence(agence);
    }

    @Override
    public Collection<Affectation> listeEmployeParAffectation(Employe employe) {
        return iaffectation.listeEmployeParAffectation(employe);
    }

    @Override
    public void deleteAffectation(Affectation affectation) {
        iaffectation.deleteAffectation(affectation);
    }
    
    
    
    
}
