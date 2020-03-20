/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m6uf2act8;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
/**
 *
 * @author jaade
 */
@Entity
public class vehicle implements Serializable {
    
    @Id @GeneratedValue
    private long id;
    
    
    private String model;
    private propietari propietari;
    private Date ultimaRevisio;
    private boolean electric;
    
    public vehicle () {
    }
    
    public vehicle(String model, propietari propietari, Date ultimaRevisio, boolean electric) {
        
        this.model = model;
        this.propietari = propietari;
        this.ultimaRevisio = ultimaRevisio;
        this.electric = electric;
    }
    
    public Long getId() {
        return id;
    }
    
    public String getModel() {
        return model;
    }
    
    public propietari getPropietari() {
        return propietari;
    }
    
    public Date getUltimaRevisio() {
        return ultimaRevisio;
    }
    
    public boolean getElectric() {
        return electric;
    }
    
    @Override
    public String toString() {
        
        if (electric) {
            
            return "Id: " + id + ", Model: " + model + ",Propietari: " + propietari.getNom() + ", Ultima revisio: " + ultimaRevisio + ", Electric: SI.";
            
        }
        
        return "Id: " + id + ", Model: " + model + ",Propietari: " + propietari.getNom() + ", Ultima revisio: " + ultimaRevisio + ", Electric: NO.";
    }
}
