package com.example.demo.request;

import com.example.demo.domain.Auth;
import com.example.demo.domain.Instrument;
import com.example.demo.domain.Payer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class TokenizeRequest {
	@JsonProperty("auth")
	private Auth auth;
	@JsonProperty("payer")
	private Payer payer;
	@JsonProperty("instrument")
	private Instrument instrument;
	private String ipAddress;
	private String userAgent;


	
	public TokenizeRequest(Auth auth, Payer payer, Instrument instrument, String ipAddress, String userAgent) {
		super();
		this.auth = auth;
		this.payer = payer;
		this.instrument = instrument;
		this.ipAddress = ipAddress;
		this.userAgent = userAgent;
	}

	
	public TokenizeRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getter Methods
	public Auth getAuth() {
		return auth;
	}

	public Payer getPayer() {
		return payer;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public String getUserAgent() {
		return userAgent;
	}

	// Setter Methods

	public void setAuth(Auth auth) {
		this.auth = auth;
	}

	public void setPayer(Payer payer) {
		this.payer = payer;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
}
