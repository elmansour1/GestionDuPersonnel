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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class ListeEmploye extends JPanel{
    private JLabel applicationLabel;
    private JTable tableListeEmploye;
    private JButton valider,annuler;
    
    public ListeEmploye(){
        init();
    }
    
    public void init(){
        this.setLayout(new GridBagLayout());
        applicationLabel = new JLabel("Liste d'employé");
        valider = new JButton("Valider");
        annuler = new JButton("Annuler");
        tableListeEmploye = new JTable();
        
        tableListeEmploye.setModel((new DefaultTableModel(
        new Object[][]{
            
        },  
                new String[]{
                    "matricule","nom","prenom","date naissance","date de prise de fonction","adresse",
                    "fonction","categorie"
                }
        )));
        
        GridBagConstraints gbc = new GridBagConstraints();
         gbc.insets = new Insets(10, 10, 10, 10);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 2;
        this.add(applicationLabel,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = GridBagConstraints.REMAINDER;
        this.add(new JScrollPane(tableListeEmploye));
        gbc.gridx = 0;
	gbc.gridwidth = 1;
        
        gbc.gridx = 0;
        gbc.gridy = 18;
        gbc.gridwidth = 1;
	gbc.gridheight = 1;
	this.add(valider,gbc);
		 
	gbc.gridx = 2;
	gbc.gridwidth = GridBagConstraints.REMAINDER;
	this.add(annuler, gbc);
    }
    
    public void addListeEmployeListener(ActionListener listener){
        valider.addActionListener(listener);
    }
    
    public void addCancelListener(ActionListener listener){
        annuler.addActionListener(listener);
    }
}
