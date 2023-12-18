package org.example;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class Compte implements Serializable {

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
}
