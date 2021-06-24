package com.example.demo.domain;

public class Token {
	private String token;
	private String subtoken;
	private String franchise;
	private String franchiseName;
	private String issuerName;
	private String lastDigits;
	private String validUntil;

	public Token(String token, String subtoken, String franchise, String franchiseName, String issuerName,
			String lastDigits, String validUntil) {
		super();
		this.token = token;
		this.subtoken = subtoken;
		this.franchise = franchise;
		this.franchiseName = franchiseName;
		this.issuerName = issuerName;
		this.lastDigits = lastDigits;
		this.validUntil = validUntil;
	}

	// Getter Methods

	public Token() {
		super();
		// TODO Auto-generated constructor stub
	}

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
