/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.vue;

import com.sun.imageio.plugins.jpeg.JPEG;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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
public class ListeAgence extends JPanel{
    private JLabel applicationLabel;
    private JTable tableListeAgence;
    private JButton valider,annuler;
    
    public ListeAgence(){
        init();
    }
    
     public void init(){
        this.setLayout(new GridBagLayout());
        applicationLabel = new JLabel("Liste des Agences");
        valider = new JButton("Imprimer");
        annuler = new JButton("Retour");
        tableListeAgence = new JTable();
        
        tableListeAgence.setModel((new DefaultTableModel(
        new Object[][]{
            
        },  
                new String[]{
                    "nom de l'agence","localisation"
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
        this.add(new JScrollPane(tableListeAgence));
        gbc.gridx = 0;
	gbc.gridwidth = 1;
        
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
	gbc.gridheight = 1;
	this.add(valider,gbc);
		 
	gbc.gridx = 2;
	gbc.gridwidth = GridBagConstraints.REMAINDER;
	this.add(annuler, gbc);
    }
    
}
