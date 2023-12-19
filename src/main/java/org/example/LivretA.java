package org.example;
import jakarta.persistence.*;

@Entity
public class LivretA extends Compte {

    @Column(name = "taux")
    private double taux;
    @Id
    private Long id;

    // Standard getters and setters
    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
