package com.example.demo.request;

import com.example.demo.domain.Auth;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class QueryRequest {
	@JsonProperty("auth")
	private Auth AuthObject;
	private String internalReference;

	// Getter Methods

	public Auth getAuth() {
		return AuthObject;
	}

	public String getInternalReference() {
		return internalReference;
	}

	// Setter Methods

	public void setAuth(Auth authObject) {
		this.AuthObject = authObject;
	}

	public void setInternalReference(String internalReference) {
		this.internalReference = internalReference;
	}
}
