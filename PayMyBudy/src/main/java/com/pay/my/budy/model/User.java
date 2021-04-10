package com.pay.my.budy.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="user")
public class User {
	
	
	public User() {}
	
	public User(String firstname, String name, LocalDate birthdate, String address, String email,
			String password, String connection, double moneyAvailable) {
		this.firstName = firstname;
		this.name = name;
		this.birthDate = birthdate;
		this.address = address;
		this.email = email;
		this.password = password;
		this.connection = connection;
		this.moneyAvailable = moneyAvailable;
	}
	
	@Id
	@Column(name="idUser")
	private int id;

	@Column(name="firstname")
	private String firstName;
	
	@Column(name="name")
	private String name;
	
	@Column(name="birthdate")
	private LocalDate birthDate;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="connections")
	private String connection;
	
	@Column(name="moneyavailable")
	private double moneyAvailable;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFisrtName(String firstName) {
		this.firstName = firstName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	public double getMoneyAvailable() {
		return moneyAvailable;
	}

	public void setMoneyAvailable(double moneyAvailable) {
		this.moneyAvailable = moneyAvailable;
	}


}
