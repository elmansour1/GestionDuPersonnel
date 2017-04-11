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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.CaretListener;

/**
 *
 * @author 
 */
public class EntrerAgence extends JPanel{
    private JLabel nomLabel,localisationLabel, nomAgence;
    private JTextField nom,localisation;
    
    private JButton valider,annuler;
    
    public EntrerAgence(){
        init();
    }
    
    public void init(){
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        nomAgence = new JLabel("Agence");
        nomLabel = new JLabel("Nom");
        localisationLabel = new JLabel("Localisation");
        
        nom = new JTextField(10);
        localisation = new JTextField(10);
        
        valider = new JButton("Valider");
        annuler = new JButton("Annuler");
        
        gbc.insets = new Insets(10, 10, 10, 10);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 2;
        this.add(nomAgence,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(nomLabel,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(nom,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(localisationLabel,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(localisation,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(valider,gbc);
        
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(annuler,gbc);
        
    }
    
    public void addValiderListener(ActionListener listener){
        valider.addActionListener(listener);
    }
    
    public void addAnnulerListener(ActionListener listener){
        annuler.addActionListener(listener);
    }
    
    public void addEnabledTextField(CaretListener caretListener){
        nom.addCaretListener(caretListener);
        localisation.addCaretListener(caretListener);
        
    }

    public JButton getValider() {
        return valider;
    }
    
    public JLabel getNomLabel() {
        return nomLabel;
    }

    public void setNomLabel(JLabel nomLabel) {
        this.nomLabel = nomLabel;
    }

    public JLabel getLocalisationLabel() {
        return localisationLabel;
    }

    public void setLocalisationLabel(JLabel localisationLabel) {
        this.localisationLabel = localisationLabel;
    }

    public JLabel getNomAgence() {
        return nomAgence;
    }

    public void setNomAgence(JLabel nomAgence) {
        this.nomAgence = nomAgence;
    }

    public JTextField getNom() {
        return nom;
    }

    public void setNom(JTextField nom) {
        this.nom = nom;
    }

    public JTextField getLocalisation() {
        return localisation;
    }

    public void setLocalisation(JTextField localisation) {
        this.localisation = localisation;
    }
    
    
    
}
