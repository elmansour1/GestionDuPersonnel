/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.data;

import java.util.Collection;

/**
 *
 * @author 
 */
public class Affectation {
    private String numero;
    private String motif;
    private String objet;
    private Collection<Employe> employe;
    private Collection<Agence> agence;

    public Affectation() {
    }

    public Affectation(String numero, String motif, String objet) {
        this.numero = numero;
        this.motif = motif;
        this.objet = objet;
    }

    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }
    
    

    public Collection<Employe> getEmploye() {
        return employe;
    }

    public void setEmploye(Collection<Employe> employe) {
        this.employe = employe;
    }

    public Collection<Agence> getAgence() {
        return agence;
    }

    public void setAgence(Collection<Agence> agence) {
        this.agence = agence;
    }
     
    
    
}
