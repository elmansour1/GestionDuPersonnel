/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.data;

import java.util.Date;

/**
 *
 * @author 
 */
public class Employe {
    private String matricule;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private Date dateDePriseDeFonction;
    private String adresse;
    private String sexe;
    private Permission permission;
    private Affectation affectation;
    private String fonction;
    private String categorie;

    public Employe() {
        
    }

    public Employe(String matricule, String nom, String prenom, Date dateNaissance, String adresse, String sexe,String fonction,String categorie) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.sexe = sexe;
        this.fonction = fonction;
        this.categorie = categorie;
    }

    public Employe(String matricule, String nom, String prenom, Date dateNaissance, Date dateDePriseDeFonction, String adresse, String sexe, String fonction, String categorie) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.dateDePriseDeFonction = dateDePriseDeFonction;
        this.adresse = adresse;
        this.sexe = sexe;
        this.fonction = fonction;
        this.categorie = categorie;
    }
    
    


    
    

    public Employe(String matricule, String nom, String prenom, Date dateNaissance, String adresse,String fonction,String sexe) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.fonction = fonction;
        this.sexe = sexe;
    }
    
    

    public Employe(String matricule, String nom, String prenom, Date dateNaissance, String adresse,String sexe) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.sexe = sexe;
    }

    public Employe(String matricule, String nom, String prenom,String sexe) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
    }

    public Employe(String matricule, String nom) {
        this.matricule = matricule;
        this.nom = nom;
    }

    public Employe(String matricule) {
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Date getDateDePriseDeFonction() {
        return dateDePriseDeFonction;
    }

    public void setDateDePriseDeFonction(Date dateDePriseDeFonction) {
        this.dateDePriseDeFonction = dateDePriseDeFonction;
    }
    
    
    
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    
    
    
    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public Affectation getAffectation() {
        return affectation;
    }

    public void setAffectation(Affectation affectation) {
        this.affectation = affectation;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    
    
    
    
}
