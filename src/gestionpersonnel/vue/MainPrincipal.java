/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.event.CaretListener;

/**
 *
 * @author 
 */
public class MainPrincipal {
    private JFrame frame;
    private AfficherLeMenu afficherMenu;
    private ListeEmploye liste_Employe;
    private ListeAgence liste_Agence;
    private EntrerEmploye entre_employe;
    private EntrerAffectation entre_affectAffectation;
    private EntrerPermission entre_Permission;
    private EntrerAgence entre_Agence;
    
    
    
    public MainPrincipal(){
        frame = new JFrame("Gestion de Permission et d'Affectation CONGELCAM");
        afficherMenu = new AfficherLeMenu();
        liste_Employe = new ListeEmploye();
        liste_Agence = new ListeAgence();
        entre_Agence = new EntrerAgence();
        entre_employe = new EntrerEmploye();
        entre_affectAffectation = new EntrerAffectation();
        entre_Permission = new EntrerPermission();
        
        entre_employe.addValiderInsertListener(new AjouterEmploye());
       // entre_employe.addEnabledTextFieldManager((CaretListener) new AjouterEmploye());
        entre_affectAffectation.addValiderInsertListener(new AjouterAffectation());
        
        afficherMenu.addEmployeListener(new ListeEmployeListener());
        
        
        
        frame.setVisible(true);
	frame.setSize(600, 600);
	frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    class ListeEmployeListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            frame.setContentPane(afficherMenu);
            frame.setVisible(true);
        }
    }
    
    class AjouterEmploye implements ActionListener{
        public void actionPerformed(ActionEvent e){
            frame.setContentPane(entre_employe);
            frame.setVisible(true);
        }
    }
    
    class AjouterAffectation implements ActionListener{

       
        public void actionPerformed(ActionEvent e) {
            frame.setContentPane(entre_affectAffectation);
            frame.setVisible(true);
        }
        
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public AfficherLeMenu getAfficherMenu() {
        return afficherMenu;
    }

    public void setAfficherMenu(AfficherLeMenu afficherMenu) {
        this.afficherMenu = afficherMenu;
    }

    public ListeEmploye getListe_Employe() {
        return liste_Employe;
    }

    public void setListe_Employe(ListeEmploye liste_Employe) {
        this.liste_Employe = liste_Employe;
    }

    public ListeAgence getListe_Agence() {
        return liste_Agence;
    }

    public void setListe_Agence(ListeAgence liste_Agence) {
        this.liste_Agence = liste_Agence;
    }

    public EntrerEmploye getEntre_employe() {
        return entre_employe;
    }

    public void setEntre_employe(EntrerEmploye entre_employe) {
        this.entre_employe = entre_employe;
    }

    public EntrerAffectation getEntre_affectAffectation() {
        return entre_affectAffectation;
    }

    public void setEntre_affectAffectation(EntrerAffectation entre_affectAffectation) {
        this.entre_affectAffectation = entre_affectAffectation;
    }

    public EntrerPermission getEntre_Permission() {
        return entre_Permission;
    }

    public void setEntre_Permission(EntrerPermission entre_Permission) {
        this.entre_Permission = entre_Permission;
    }

    public EntrerAgence getEntre_Agence() {
        return entre_Agence;
    }

    public void setEntre_Agence(EntrerAgence entre_Agence) {
        this.entre_Agence = entre_Agence;
    }
    
    
    
    public static void main(String[] args) {
        MainPrincipal m = new MainPrincipal();
    }
    
}
