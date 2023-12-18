package org.example;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public  class Compte{

    @Id
    @Column(name = "numero")
    private String numero;

    @Column(name = "solde")
    private double solde;

    // Standard getters and setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @ManyToMany
    @JoinTable(
            name = "client_compte",
            joinColumns = @JoinColumn(name = "compte_id"),
            inverseJoinColumns = @JoinColumn(name = "client_id")
    )
    private Set<Client> clients = new HashSet<>();

    // Standard getters and setters for clients
    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }
}
