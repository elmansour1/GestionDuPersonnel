/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.data;

/**
 *
 * @author
 */
public class Agence {
    private Long id;
    private String nom_agenece;
    private String localisation;
    private Affectation affectation;

    public Agence() {
    }

    public Agence(String nom_agenece, String localisation) {
        this.nom_agenece = nom_agenece;
        this.localisation = localisation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom_agenece() {
        return nom_agenece;
    }

    public void setNom_agenece(String nom_agenece) {
        this.nom_agenece = nom_agenece;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public Affectation getAffectation() {
        return affectation;
    }

    public void setAffectation(Affectation affectation) {
        this.affectation = affectation;
    }
    
    
    
    
}
