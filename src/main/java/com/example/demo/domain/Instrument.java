package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Instrument {
	@JsonProperty("card")
	private Card card;
	@JsonProperty("otp")
	private String otp;
	@JsonProperty("token")
	private Token token;

	public Instrument() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Instrument(Card card, String otp, Token token) {
		super();
		this.card = card;
		this.otp = otp;
		this.token = token;
	}
	
	// Getter Methods
	public Token getToken() {
		return token;
	}
	

	public void setToken(Token token) {
		this.token = token;
	}

	public Card getCard() {
		return card;
	}

	public String getOtp() {
		return otp;
	}

	// Setter Methods

	public void setCard(Card card) {
		this.card = card;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}
}
