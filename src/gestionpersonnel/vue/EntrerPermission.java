/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.vue;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.CaretListener;

/**
 *
 * @author 
 */
public class EntrerPermission extends JPanel{
    private JLabel applicationLabel,matriculeLabel,nomLabel,prenomLabel,dateNaissanceLabel,dateDePriseLabel,
            adresseLabel,sexeLabel,fonctionLabel,categorieLabel,motifLabel,objetLabel,codeLabel;
    
    private JTextField matricule,nom,prenom,adresse,dateNaissance,dateDePrise,
            code,motif,objet;
    private JTextField sexe,fonction,categorie;
    private JButton valider, annuler;
    
    
    public EntrerPermission(){
        init();
    }
    
    public void init(){
         this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        applicationLabel = new JLabel("Demande de Permission");
        codeLabel = new JLabel("code");
        motifLabel = new JLabel("Motif");
        objetLabel = new JLabel("Objet");
        matriculeLabel = new JLabel("Matricule");
        nomLabel = new JLabel("Nom");
        prenomLabel = new JLabel("Prenom");
        dateNaissanceLabel = new JLabel("Date de Naissance");
        dateDePriseLabel = new JLabel("Date de prise de fonction");
        adresseLabel = new JLabel("Adresse");
        sexeLabel = new JLabel("Sexe");
        fonctionLabel = new JLabel("Fonction");
        categorieLabel = new JLabel("Categorie");
       
        code = new JTextField(10);
        motif = new JTextField(10);
        objet = new JTextField(10);
        matricule = new JTextField(10);
        nom = new JTextField(10);
        prenom = new JTextField(10);
        adresse = new JTextField(10);
        dateNaissance = new JTextField(10);
        dateDePrise = new JTextField(10);
       
        sexe = new JTextField(10);
        fonction = new JTextField(10);
        categorie = new JTextField(10);
        
        valider = new JButton("Valider");
        annuler = new JButton("Annuler");
        
        gbc.insets = new Insets(10, 10, 10, 10);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        //gbc.gridheight = 2;
        this.add(applicationLabel,gbc);
        
         gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(codeLabel,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(code,gbc);
        
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(motifLabel,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(motif,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(objetLabel,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(objet,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(matriculeLabel,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(matricule,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(nomLabel,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(nom,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(prenomLabel,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(prenom,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(dateNaissanceLabel,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(dateNaissance,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(dateDePriseLabel,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(dateDePrise,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(adresseLabel,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(adresse,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(sexeLabel,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(sexe,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(fonctionLabel,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(fonction,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(categorieLabel,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(categorie,gbc);
       /* 
        gbc.gridx = 0;
        gbc.gridy = 13;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(nomLabel,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(nom,gbc);*/
         
        gbc.gridx = 0;
        gbc.gridy = 15;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(valider,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(annuler,gbc);
       
    }
    
     public void addValiderInsertListener(ActionListener listener){
        valider.addActionListener(listener);
    }
    
    public void addAnnulerAccueilListener(ActionListener listener){
        annuler.addActionListener(listener);
    }
    
        
    public void addPermission(CaretListener caretListener){
        code.addCaretListener(caretListener);
        motif.addCaretListener(caretListener);
        objet.addCaretListener(caretListener);
        matricule.addCaretListener(caretListener);
        nom.addCaretListener(caretListener);
        prenom.addCaretListener(caretListener);
        dateNaissance.addCaretListener(caretListener);
        dateDePrise.addCaretListener(caretListener);
        adresse.addCaretListener(caretListener);
        sexe.addCaretListener(caretListener);
        fonction.addCaretListener(caretListener);
        categorie.addCaretListener(caretListener);
        
        
        
    }

    public JLabel getApplicationLabel() {
        return applicationLabel;
    }

    public void setApplicationLabel(JLabel applicationLabel) {
        this.applicationLabel = applicationLabel;
    }

    public JLabel getMatriculeLabel() {
        return matriculeLabel;
    }

    public void setMatriculeLabel(JLabel matriculeLabel) {
        this.matriculeLabel = matriculeLabel;
    }

    public JLabel getNomLabel() {
        return nomLabel;
    }

    public void setNomLabel(JLabel nomLabel) {
        this.nomLabel = nomLabel;
    }

    public JLabel getPrenomLabel() {
        return prenomLabel;
    }

    public void setPrenomLabel(JLabel prenomLabel) {
        this.prenomLabel = prenomLabel;
    }

    public JLabel getDateNaissanceLabel() {
        return dateNaissanceLabel;
    }

    public void setDateNaissanceLabel(JLabel dateNaissanceLabel) {
        this.dateNaissanceLabel = dateNaissanceLabel;
    }

    public JLabel getDateDePriseLabel() {
        return dateDePriseLabel;
    }

    public void setDateDePriseLabel(JLabel dateDePriseLabel) {
        this.dateDePriseLabel = dateDePriseLabel;
    }

    public JLabel getAdresseLabel() {
        return adresseLabel;
    }

    public void setAdresseLabel(JLabel adresseLabel) {
        this.adresseLabel = adresseLabel;
    }

    public JLabel getSexeLabel() {
        return sexeLabel;
    }

    public void setSexeLabel(JLabel sexeLabel) {
        this.sexeLabel = sexeLabel;
    }

    public JLabel getFonctionLabel() {
        return fonctionLabel;
    }

    public void setFonctionLabel(JLabel fonctionLabel) {
        this.fonctionLabel = fonctionLabel;
    }

    public JLabel getCategorieLabel() {
        return categorieLabel;
    }

    public void setCategorieLabel(JLabel categorieLabel) {
        this.categorieLabel = categorieLabel;
    }

    public JLabel getMotifLabel() {
        return motifLabel;
    }

    public void setMotifLabel(JLabel motifLabel) {
        this.motifLabel = motifLabel;
    }

    public JLabel getObjetLabel() {
        return objetLabel;
    }

    public void setObjetLabel(JLabel objetLabel) {
        this.objetLabel = objetLabel;
    }

    public JLabel getCodeLabel() {
        return codeLabel;
    }

    public void setCodeLabel(JLabel codeLabel) {
        this.codeLabel = codeLabel;
    }

    public JTextField getMatricule() {
        return matricule;
    }

    public void setMatricule(JTextField matricule) {
        this.matricule = matricule;
    }

    public JTextField getNom() {
        return nom;
    }

    public void setNom(JTextField nom) {
        this.nom = nom;
    }

    public JTextField getPrenom() {
        return prenom;
    }

    public void setPrenom(JTextField prenom) {
        this.prenom = prenom;
    }

    public JTextField getAdresse() {
        return adresse;
    }

    public void setAdresse(JTextField adresse) {
        this.adresse = adresse;
    }

    public JTextField getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(JTextField dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public JTextField getDateDePrise() {
        return dateDePrise;
    }

    public void setDateDePrise(JTextField dateDePrise) {
        this.dateDePrise = dateDePrise;
    }

    public JTextField getCode() {
        return code;
    }

    public void setCode(JTextField code) {
        this.code = code;
    }

    public JTextField getMotif() {
        return motif;
    }

    public void setMotif(JTextField motif) {
        this.motif = motif;
    }

    public JTextField getObjet() {
        return objet;
    }

    public void setObjet(JTextField objet) {
        this.objet = objet;
    }

    public JTextField getSexe() {
        return sexe;
    }

    public void setSexe(JTextField sexe) {
        this.sexe = sexe;
    }

    public JTextField getFonction() {
        return fonction;
    }

    public void setFonction(JTextField fonction) {
        this.fonction = fonction;
    }

    public JTextField getCategorie() {
        return categorie;
    }

    public void setCategorie(JTextField categorie) {
        this.categorie = categorie;
    }

    public JButton getValider() {
        return valider;
    }

    public void setValider(JButton valider) {
        this.valider = valider;
    }

    public JButton getAnnuler() {
        return annuler;
    }

    public void setAnnuler(JButton annuler) {
        this.annuler = annuler;
    }

   
        
    
   
}
