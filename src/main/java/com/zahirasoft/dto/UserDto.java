package com.zahirasoft.dto;

import java.sql.Timestamp;

public class UserDto {

    private Long idUser;
    private String userName;
    private String userPassword;
    private Float hours;
    private String offers;
    private Timestamp loginDate;
    private String email;
    private boolean firstTime;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
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

    public Float getHours() {
        return hours;
    }

    public void setHours(Float hours) {
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

    public boolean isFirstTime() {
        return firstTime;
    }

    public void setFirstTime(boolean firstTime) {
        this.firstTime = firstTime;
    }

    public UserDto() {
    }

    public UserDto(String userName, String userPassword, Float hours, String offers, Timestamp loginDate, String email, boolean firstTime) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.hours = hours;
        this.offers = offers;
        this.loginDate = loginDate;
        this.email = email;
        this.firstTime = firstTime;
    }
}

