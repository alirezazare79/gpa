package org.example;

import javax.persistence.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Banque banque = new Banque();
        banque.setNom("Banque Exemple");
        em.persist(banque);

        Adresse adresse = new Adresse();
        adresse.setNumero(123);
        adresse.setRue("Rue Exemple");
        adresse.setCodePostal(75000);
        adresse.setVille("Ville Exemple");

        Compte compte1 = new Compte(); // Replace with a specific type if needed
        compte1.setSolde(1000); // example balance
        em.persist(compte1);

        Client client1 = new Client();
        client1.setNom("NomClient1");
        client1.setPrenom("PrenomClient1");
        em.persist(client1);

        Client client2 = new Client();
        client2.setNom("NomClient2");
        client2.setPrenom("PrenomClient2");
        em.persist(client2);

        // Insert Operations of Type 'Virements' on an Account
        Virement virement1 = new Virement();
        virement1.setMontant(100);
        virement1.setDate(LocalDateTime.now());
        virement1.setCompte(compte1); // associating to compte1
        em.persist(virement1);

        // Insert Operations of Type 'Operations' on an Account
        Operation operation1 = new Operation();
        operation1.setMontant(50);
        operation1.setDate(LocalDateTime.now());
        operation1.setCompte(compte1);
        em.persist(operation1);


        tx.commit();
        em.close();
        emf.close();
    }
}
