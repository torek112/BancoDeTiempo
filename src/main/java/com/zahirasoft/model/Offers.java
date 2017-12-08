package com.zahirasoft.model;

import javax.persistence.*;

@Entity
@Table(name = "offers")
public class Offers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idOffers")
    private Long idOffers;

    @Column(name = "description")
    private String description;

    public Offers(String description) {
        this.description = description;
    }

    public Offers() {
    }

    public Long getIdOffers() {
        return idOffers;
    }

    public void setIdOffers(Long idOffers) {
        this.idOffers = idOffers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
