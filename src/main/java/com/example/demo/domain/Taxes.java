package com.example.demo.domain;

public class Taxes {

	private String kind;
	private String amount;
	private String base;

	public Taxes(String kind, String amount, String base) {
		super();
		this.kind = kind;
		this.amount = amount;
		this.base = base;
	}

	public Taxes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

}
