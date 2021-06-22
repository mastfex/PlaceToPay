package com.example.demo.response.query;

import com.example.demo.domain.Amount;
import com.example.demo.domain.Status;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OutputQuery {
	private Status StatusObject;
	private String date;
	private String transactionDate;
	private String internalReference;
	private String reference;
	private String paymentMethod;
	private String franchise;
	private String franchiseName;
	private String issuerName;
	
	@JsonProperty("amount")
	private Amount amount;
	


	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getInternalReference() {
		return internalReference;
	}

	public void setInternalReference(String internalReference) {
		this.internalReference = internalReference;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getFranchise() {
		return franchise;
	}

	public void setFranchise(String franchise) {
		this.franchise = franchise;
	}

	public String getFranchiseName() {
		return franchiseName;
	}

	public void setFranchiseName(String franchiseName) {
		this.franchiseName = franchiseName;
	}

	public String getIssuerName() {
		return issuerName;
	}

	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}
	
	
	
	public Status getStatusObject() {
		return StatusObject;
	}

	public void setStatusObject(Status statusObject) {
		StatusObject = statusObject;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Status getStatus() {
		return StatusObject;
	}
	


	public void setStatus(Status statusObject) {
		this.StatusObject = statusObject;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}



}
