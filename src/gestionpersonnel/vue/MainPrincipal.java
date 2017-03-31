/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author 
 */
public class MainPrincipal {
    private JFrame frame;
    private AfficherLeMenu afficherMenu;
    
    public MainPrincipal(){
        frame = new JFrame("Gestion de Permission et d'Affectation CONGELCAM");
        afficherMenu = new AfficherLeMenu();
        
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
    
    public static void main(String[] args) {
        MainPrincipal m = new MainPrincipal();
    }
    
}
