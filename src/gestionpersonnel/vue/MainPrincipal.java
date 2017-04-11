/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/**
 *
 * @author 
 */
public class MainPrincipal {
    private JFrame frame;
    private Accueil accueil;
    private AfficherLeMenu afficherMenu;
    private ListeEmploye liste_Employe;
    private ListeAgence liste_Agence;
    private EntrerEmploye entre_employe;
    private EntrerAffectation entre_affectAffectation;
    private EntrerPermission entre_Permission;
    private EntrerAgence entre_Agence;
    
    
    
    public MainPrincipal(){
        frame = new JFrame("Gestion de Permission et d'Affectation CONGELCAM");
        accueil = new Accueil();
        afficherMenu = new AfficherLeMenu();
        liste_Employe = new ListeEmploye();
        liste_Agence = new ListeAgence();
        entre_Agence = new EntrerAgence();
        entre_employe = new EntrerEmploye();
        entre_affectAffectation = new EntrerAffectation();
        entre_Permission = new EntrerPermission();
        
        accueil.addContinuerListener(new Continuer());
        accueil.addQuitterListener(new ExitListener());
        
        
        //entre_employe.addValiderInsertListener((ActionListener) new EnableEmploye());
        entre_employe.addEnabledTextFieldManager(new EnableEmploye());
        entre_employe.addAnnulerAccueilListener(new RetourAccueil());
        entre_employe.addQutteListener(new ExitListener());
        
        
        liste_Employe.addCancelListener(new CancelToWelcole());
       // entre_employe.addEnabledTextFieldManager((CaretListener) new AjouterEmploye());
       
       entre_Agence.addValiderListener(new AjouterAgence());
       entre_Agence.addEnabledTextField(new EnableAgence());
       entre_Agence.addAnnulerListener(new RetourAccueil());
       
       
        entre_affectAffectation.addValiderInsertListener(new AjouterAffectation());
        entre_affectAffectation.addEnabledAffectation(new EnableAffectation());
        entre_affectAffectation.addAnnulerAccueilListener(new RetourAccueil());
        
        entre_Permission.addAnnulerAccueilListener(new RetourAccueil());
        
        afficherMenu.addEmployeListener(new ListeEmployeListener());
        afficherMenu.addAgenceListener(new AjouterAgence());
        afficherMenu.addAnnulerListener(new RetourAccueil());
        afficherMenu.addAffectationListener(new AjouterAffectation());
        afficherMenu.addPermissionListener(new AjouterPermission());
        
        
        
        frame.setVisible(true);
	frame.setSize(600, 700);
	frame.setLocationRelativeTo(null);
        frame.add(accueil);
        //frame.add(entre_employe);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    class Continuer implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
            frame.setContentPane(afficherMenu);
            frame.setVisible(true);
        }
    }
    
    class RetourAccueil implements ActionListener{
        public void actionPerformed(ActionEvent e){
            frame.setContentPane(accueil);
            frame.setVisible(true);
        }
    }
    
    class ListeEmployeListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            frame.setContentPane(entre_employe);
            frame.setVisible(true);
        }
    }
    
    class AnnulerInsertIonEmploye implements ActionListener{
        public void actionPerformed(ActionEvent e){
            frame.setContentPane(entre_employe);
            frame.setVisible(true);
        }
    }
    
    class AjouterEmploye implements ActionListener{
        public void actionPerformed(ActionEvent e){
            frame.setContentPane(entre_employe);
            frame.setVisible(true);
        }
    }
    
    class AjouterAgence implements ActionListener{
        public void actionPerformed(ActionEvent e){
            frame.setContentPane(entre_Agence);
            frame.setVisible(true);
        }
    }
    
    class AjouterPermission implements ActionListener{
        public void actionPerformed(ActionEvent e){
            frame.setContentPane(entre_Permission);
            frame.setVisible(true);
        }
    }
    
    class ExitListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            frame.dispose();
            System.exit(0);
        }
    }
    
    
    class AjouterAffectation implements ActionListener{

       
        public void actionPerformed(ActionEvent e) {
            frame.setContentPane(entre_affectAffectation);
            frame.setVisible(true);
        }
        
    }
    
    class CancelToWelcole implements ActionListener{
        public void actionPerformed(ActionEvent e){
            frame.setContentPane(afficherMenu);
            frame.setVisible(true);
        }
    }
    
    class EnableEmploye implements CaretListener{

        @Override
        public void caretUpdate(CaretEvent e) {
            if(entre_employe.getMatricule().getText().length() == 0 || 
                    entre_employe.getNom().getText().length() ==0){
                
                entre_employe.getPrenom().setEnabled(false);
                entre_employe.getDateNaissance().setEnabled(false);
                entre_employe.getDateDePrise().setEnabled(false);
                entre_employe.getAdresse().setEnabled(false);
                entre_employe.getCategorie().setEnabled(false);
                entre_employe.getFonction().setEnabled(false);
            }else{
                entre_employe.getPrenom().setEnabled(true);
                entre_employe.getDateNaissance().setEnabled(true);
                entre_employe.getDateDePrise().setEnabled(true);
                entre_employe.getAdresse().setEnabled(true);
                entre_employe.getCategorie().setEnabled(true);
                entre_employe.getFonction().setEnabled(true);
            }
        }
        
    }
    
    class EnableAgence implements CaretListener{

        @Override
        public void caretUpdate(CaretEvent e) {
            
              entre_Agence.getNom().setEnabled(true);
              entre_Agence.getLocalisation().setEnabled(true);
                
        }
        
    }
    
    class EnableAffectation implements CaretListener{

        @Override
        public void caretUpdate(CaretEvent e) {
            entre_affectAffectation.getNumero().setEnabled(true);
            entre_affectAffectation.getMotif().setEnabled(true);
            entre_affectAffectation.getObjet().setEnabled(true);
            entre_affectAffectation.getMatricule().setEnabled(true);
            entre_affectAffectation.getNom().setEnabled(true);
            entre_affectAffectation.getPrenom().setEnabled(true);
            entre_affectAffectation.getDateNaissance().setEnabled(true);
            entre_affectAffectation.getDateDePrise().setEnabled(true);
            entre_affectAffectation.getAdresse().setEnabled(true);
            entre_affectAffectation.getNomAgence().setEnabled(true);
            entre_affectAffectation.getLocalisation().setEnabled(true);
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
    
    
    
   
}
