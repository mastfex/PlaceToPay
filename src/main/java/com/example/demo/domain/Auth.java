package com.example.demo.domain;

public class Auth {
	private String login;
	private String tranKey;
	private String nonce;
	private String seed;

	// Getter Methods

	public String getLogin() {
		return login;
	}

	public String getTranKey() {
		return tranKey;
	}

	public String getNonce() {
		return nonce;
	}

	public String getSeed() {
		return seed;
	}

	// Setter Methods

	public void setLogin(String login) {
		this.login = login;
	}

	public void setTranKey(String tranKey) {
		this.tranKey = tranKey;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	public void setSeed(String seed) {
		this.seed = seed;
	}
}
