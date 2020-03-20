/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m6uf2act8;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author jaade
 */
@Entity
public class propietari {
    
    @Id @GeneratedValue
    private long idPropietari;
    
    private String nom;
    
    public propietari() {
    }
    
    public propietari(String nom) {
        this.nom = nom;
    }
    
    public Long getIdPropietari() {
        return idPropietari;
    }
    
    public String getNom() {
        return nom;
    }
    
    @Override
    public String toString() {
        
        return "Id del Propietari: " + idPropietari + ", Nom: " + nom + ".";
    }
}
