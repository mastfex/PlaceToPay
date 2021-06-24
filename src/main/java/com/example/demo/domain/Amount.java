package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Amount {
	private String currency;
	private String total;

	public Amount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Amount(String currency, String total) {
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

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

}
