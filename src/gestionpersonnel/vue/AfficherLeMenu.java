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

/**
 *
 * @author 
 */
public class AfficherLeMenu extends JPanel{
    private JLabel applicationLabel;
    private JButton btnEmploye,btnAgence,btnAffectation,btnPermission,btnAnnuler;
    
   public AfficherLeMenu(){
       init();
   }
   
   public void init(){
       this.setLayout(new GridBagLayout());
       GridBagConstraints gbc = new GridBagConstraints();
       gbc.insets = new Insets(10, 10, 10, 10);
       
       applicationLabel = new JLabel("Faite votre choix:");
       btnEmploye = new JButton("Ajouter un Employé");
       btnAgence = new JButton("Ajouter un Agence");
       btnAffectation = new JButton("Effectuer une Affectation");
       btnPermission = new JButton("Autoriser une Permission");
       btnAnnuler = new JButton("Quitter");
       
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        //gbc.gridheight = 2;
        this.add(applicationLabel,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(btnEmploye,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        this.add(btnAgence,gbc);
        
        
        gbc.gridx = 1;
        gbc.gridy = 5;
        this.add(btnAffectation,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 7;
        this.add(btnPermission,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 9;
        this.add(btnAnnuler , gbc);
   }
    
   public void addEmployeListener(ActionListener listener){
       btnEmploye.addActionListener(listener);
   }
   
   public void addAgenceListener(ActionListener listener){
       btnAgence.addActionListener(listener);
   }
   
   public void addAffectationListener(ActionListener listener){
       btnAffectation.addActionListener(listener);
   }
   
   public void addPermissionListener(ActionListener listener){
       btnPermission.addActionListener(listener);
   }
   
   public void addAnnulerListener(ActionListener listener){
       btnAnnuler.addActionListener(listener);
   }
}
