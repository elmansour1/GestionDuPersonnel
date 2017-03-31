/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel.data;

import java.util.Collection;

/**
 *
 * @author 
 */
public class Permission {
    private String code;
    private Collection<Employe> employe;

    public Permission(String code) {
        this.code = code;
    }

    public Permission() {
    }
    
    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Collection<Employe> getEmploye() {
        return employe;
    }

    public void setEmploye(Collection<Employe> employe) {
        this.employe = employe;
    }
    
    
    
}
