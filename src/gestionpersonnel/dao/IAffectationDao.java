/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.dao;

import gestionpersonnel.data.Affectation;
import gestionpersonnel.data.Agence;
import gestionpersonnel.data.Employe;
import java.util.Collection;

/**
 *
 * @author 
 */
public interface IAffectationDao {
    public Affectation createAffectation(Affectation affectation);
    public Affectation updateAffectation(Affectation affectation);
    public Affectation findAffectationByNumber(String numero);
    public Affectation findAllAffectation();
    public Collection<Affectation> listeAffectationParAgence(Agence agence);
    public Collection<Affectation> listeEmployeParAffectation(Employe employe);
    public void deleteAffectation(Affectation affectation);
    
}
