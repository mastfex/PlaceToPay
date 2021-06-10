package com.example.demo.request.query;

import com.request.autorizacion.Auth;

public class InputQuery {
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
