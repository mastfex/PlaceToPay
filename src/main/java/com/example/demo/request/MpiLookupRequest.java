package com.example.demo.request;

import com.example.demo.domain.Amount;
import com.example.demo.domain.Auth;
import com.example.demo.domain.Card;
import com.example.demo.domain.Instrument;
import com.example.demo.domain.Payment;

public class MpiLookupRequest {
	
	private Auth auth;
	private Amount amount;
	private Payment payment;
	private Card card;
	private Instrument instrument;
	private String returnUrl;

	public MpiLookupRequest(Auth auth, Amount amount, Payment payment, Card card, Instrument instrument,
			String returnUrl) {
		super();
		this.auth = auth;
		this.amount = amount;
		this.payment = payment;
		this.card = card;
		this.instrument = instrument;
		this.returnUrl = returnUrl;
	}

	public MpiLookupRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auth getAuth() {
		return auth;
	}

	public void setAuth(Auth auth) {
		this.auth = auth;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}
	
	
}
