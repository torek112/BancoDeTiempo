package com.zahirasoft.dto;

import java.sql.Timestamp;

public class UserDto {

    private Long id;
    private String userName;
    private String userPassword;
    private Long hours;
    private String offers;
    private Timestamp loginDate;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Long getHours() {
        return hours;
    }

    public void setHours(Long hours) {
        this.hours = hours;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }

    public Timestamp getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Timestamp loginDate) {
        this.loginDate = loginDate;
    }

    public UserDto() {
    }

    public UserDto(String userName, String userPassword, Long hours, String offers, Timestamp loginDate, String email) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.hours = hours;
        this.offers = offers;
        this.loginDate = loginDate;
        this.email = email;
    }
}

