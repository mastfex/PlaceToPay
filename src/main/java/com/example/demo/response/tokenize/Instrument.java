package com.example.demo.response.tokenize;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Instrument {
	@JsonProperty("TokenObject")
	private Token TokenObject;

	// Getter Methods

	public Token getToken() {
		return TokenObject;
	}

	// Setter Methods

	public void setToken(Token tokenObject) {
		this.TokenObject = tokenObject;
	}
}
