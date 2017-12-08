package com.zahirasoft.dto;

import javax.persistence.*;

public class OffersDto {

    private Long idOffers;
    private String description;

    public OffersDto(String description) {
        this.description = description;
    }

    public OffersDto() {
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
