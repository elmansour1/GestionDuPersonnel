/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.serviceDao.impl;

import gestionpersonnel.dao.IAgenceDao;
import gestionpersonnel.dao.impl.AgenceDaoImpl;
import gestionpersonnel.data.Agence;
import gestionpersonnel.serviceDao.IAgenceServiceDao;

/**
 *
 * @author 
 */
public class AgenceServiceDaoImpl implements IAgenceServiceDao{
    IAgenceDao iagence = new AgenceDaoImpl();
    
    @Override
    public Agence createAgence(Agence agence) {
        return iagence.createAgence(agence);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return iagence.updateAgence(agence);
    }

    @Override
    public Agence findAgenceById(Long id) {
        return iagence.findAgenceById(id);
    }

    @Override
    public void deleteAgence(Agence agence) {
        iagence.deleteAgence(agence);
    }
    
    
    
}
