package com.example.demo.response.tokenize;

public class Token {
	private String token;
	private String subtoken;
	private String franchise;
	private String franchiseName;
	private String issuerName;
	private String lastDigits;
	private String validUntil;

	// Getter Methods

	public String getToken() {
		return token;
	}

	public String getSubtoken() {
		return subtoken;
	}

	public String getFranchise() {
		return franchise;
	}

	public String getFranchiseName() {
		return franchiseName;
	}

	public String getIssuerName() {
		return issuerName;
	}

	public String getLastDigits() {
		return lastDigits;
	}

	public String getValidUntil() {
		return validUntil;
	}

	// Setter Methods

	public void setToken(String token) {
		this.token = token;
	}

	public void setSubtoken(String subtoken) {
		this.subtoken = subtoken;
	}

	public void setFranchise(String franchise) {
		this.franchise = franchise;
	}

	public void setFranchiseName(String franchiseName) {
		this.franchiseName = franchiseName;
	}

	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}

	public void setLastDigits(String lastDigits) {
		this.lastDigits = lastDigits;
	}

	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
	}
}
