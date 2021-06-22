package com.example.demo.domain;

public class Instrument {
	private Card CardObject;
	private String otp;
	private Token token;
	

	// Getter Methods
	
	

	public Token getToken() {
		return token;
	}
	
	public Instrument() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Instrument(Card cardObject, String otp, Token token) {
		super();
		CardObject = cardObject;
		this.otp = otp;
		this.token = token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public Card getCard() {
		return CardObject;
	}

	public String getOtp() {
		return otp;
	}

	// Setter Methods

	public void setCard(Card cardObject) {
		this.CardObject = cardObject;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}
}
