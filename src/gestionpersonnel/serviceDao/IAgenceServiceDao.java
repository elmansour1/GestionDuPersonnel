/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.serviceDao;

import gestionpersonnel.data.Agence;

/**
 *
 * @author faouzi
 */
public interface IAgenceServiceDao {
    public Agence createAgence(Agence agence);
    public Agence updateAgence(Agence agence);
    public Agence findAgenceById(Long id);
    public void deleteAgence(Agence agence);
}
