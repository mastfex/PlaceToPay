package com.example.demo.domain;

public class Instrument {
	private Card card;
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

	public Instrument(Card card, String otp, Token token) {
		super();
		this.card = card;
		this.otp = otp;
		this.token = token;
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
