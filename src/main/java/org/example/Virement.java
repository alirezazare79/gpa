package org.example;

import org.example.Operation;

import javax.persistence.*;

@Entity
public class Virement extends Operation {

    @Column(name = "beneficiaire")
    private String beneficiaire;
    @Id
    private Long id;

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
