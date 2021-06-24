package com.example.demo.request;

import com.example.demo.domain.Auth;
import com.example.demo.domain.Instrument;
import com.example.demo.domain.Payment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class MpiLookupRequest {
	@JsonProperty("auth")
	private Auth auth;
	@JsonProperty("payment")
	private Payment payment;
	@JsonProperty("instrument")
	private Instrument instrument;
	@JsonProperty("returnUrl")
	private String returnUrl;

	public MpiLookupRequest(Auth auth, Payment payment, Instrument instrument,
			String returnUrl) {
		super();
		this.auth = auth;
		this.payment = payment;
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

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
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
