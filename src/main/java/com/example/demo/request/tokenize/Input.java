package com.example.demo.request.tokenize;

import com.example.demo.domain.Auth;

public class Input {
	private Auth AuthObject;
	private Payer PayerObject;
	private Instrument InstrumentObject;
	private String ipAddress;
	private String userAgent;

	// Getter Methods

	public Auth getAuth() {
		return AuthObject;
	}

	public Payer getPayer() {
		return PayerObject;
	}

	public Instrument getInstrument() {
		return InstrumentObject;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public String getUserAgent() {
		return userAgent;
	}

	// Setter Methods

	public void setAuth(Auth authObject) {
		this.AuthObject = authObject;
	}

	public void setPayer(Payer payerObject) {
		this.PayerObject = payerObject;
	}

	public void setInstrument(Instrument instrumentObject) {
		this.InstrumentObject = instrumentObject;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
}
