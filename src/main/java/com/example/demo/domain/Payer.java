package com.example.demo.domain;

public class Payer {
	private String name;
	private String surname;
	private String email;

	// Getter Methods

	public Payer(String name, String surname, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
	}

	public Payer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	 public String getSurname() {
	  return surname;
	 }

	 public String getEmail() {
	  return email;
	 }

	 // Setter Methods 

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setSurname(String surname) {
	  this.surname = surname;
	 }

	 public void setEmail(String email) {
	  this.email = email;
	 }
}
