package com.zahirasoft.model;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class User{
	
	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idUser")
	private Long idUser;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="userPassword")
	private String userPassword;

	@Column(name="hours")
	private Float hours;

	@Column(name = "email")
	private String email;

	@Column(name = "loginDate")
	private Timestamp loginDate;

	@Column(name = "firstTime")
	private boolean firstTime;

	public boolean isFirstTime() {
		return firstTime;
	}

	public void setFirstTime(boolean firstTime) {
		this.firstTime = firstTime;
	}

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

	public Timestamp getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Timestamp loginDate) {
		this.loginDate = loginDate;
	}

	public User() {
	}

	public User(String userName, String userPassword, Float hours, String email, boolean firstTime) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.hours = hours;
		this.loginDate = new Timestamp(System.currentTimeMillis());
		this.email = email;
		this.firstTime = firstTime;
	}
}
