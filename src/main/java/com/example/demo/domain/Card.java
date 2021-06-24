package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Card {
	private String number;
	private String expirationMonth;
	private String expirationYear;
	private String cvv;

	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Card(String number, String expirationMonth, String expirationYear, String cvv) {
		super();
		this.number = number;
		this.expirationMonth = expirationMonth;
		this.expirationYear = expirationYear;
		this.cvv = cvv;
	}

	// Getter Methods
	public String getNumber() {
		return number;
	}

	public String getExpirationMonth() {
		return expirationMonth;
	}

	public String getExpirationYear() {
		return expirationYear;
	}

	public String getCvv() {
		return cvv;
	}

	// Setter Methods

	public void setNumber(String number) {
		this.number = number;
	}

	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	public void setExpirationYear(String expirationYear) {
		this.expirationYear = expirationYear;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
}
