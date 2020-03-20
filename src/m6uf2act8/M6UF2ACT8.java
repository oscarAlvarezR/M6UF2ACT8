/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m6uf2act8;

import javax.persistence.*;
import java.util.*;
/**
 *
 * @author jaade
 */
public class M6UF2ACT8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Open a database connection
        // (create a new database if it doesn't exist yet):
        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("$objectdb/db/p2.odb");
        EntityManager em = emf.createEntityManager();

        propietari p1 = new propietari("Alberto Garcia");
        propietari p2 = new propietari("Pepe Sanchez");
        String[] arrayModels = {"Mercedes","Audi","Seat","Fiat","Renault","Ford","BMW"};
        
        // Store 1000 Point objects in the database:
        em.getTransaction().begin();
        for (int i = 0; i < arrayModels.length; i++) {
            vehicle v1 = new vehicle(arrayModels[i], p2, new Date(), true);
            em.persist(v1);
        }
        em.getTransaction().commit();

        // Retrieve all the Point objects from the database:
        TypedQuery<vehicle> query =
            em.createQuery("SELECT v FROM vehicle v", vehicle.class);
        List<vehicle> results = query.getResultList();
        for (vehicle p : results) {
            System.out.println(p);
        }

        // Close the database connection:
        em.close();
        emf.close();
    }
    
}
