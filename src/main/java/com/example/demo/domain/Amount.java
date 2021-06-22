package com.example.demo.domain;

public class Amount {
	private String currency;
    private int total;
	public Amount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Amount(String currency, int total) {
		super();
		this.currency = currency;
		this.total = total;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
    
    
    
}
