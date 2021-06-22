package com.example.demo.response;

import com.example.demo.domain.Additional;
import com.example.demo.domain.Amount;
import com.example.demo.domain.Conversion;
import com.example.demo.domain.ProcessorFields;
import com.example.demo.domain.Status;

public class ProcessResponse {
	private String date;
	private String franchise;
	private Amount amount;
	private ProcessorFields processorFields;
	private String issuerName;
	private Additional additional;
	private String discount;
	private String internalReference;
	private String transactionDate;
	private String type;
	private String reference;
	private String authorization;
	private String provider;
	private String paymentMethod;
	private String lastDigits;
	private String receipt;
	private String refunded;
	private Status status;
	private String franchiseName;
	private Conversion conversion;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFranchise() {
		return franchise;
	}

	public void setFranchise(String franchise) {
		this.franchise = franchise;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public ProcessorFields getProcessorFields() {
		return processorFields;
	}

	public void setProcessorFields(ProcessorFields processorFields) {
		this.processorFields = processorFields;
	}

	public String getIssuerName() {
		return issuerName;
	}

	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}

	public Additional getAdditional() {
		return additional;
	}

	public void setAdditional(Additional additional) {
		this.additional = additional;
	}

	public String getDiscount ()
    {
        return discount;
    }

	public void setDiscount (String discount)
    {
        this.discount = discount;
    }

	public String getInternalReference() {
		return internalReference;
	}

	public void setInternalReference(String internalReference) {
		this.internalReference = internalReference;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getAuthorization() {
		return authorization;
	}

	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getLastDigits() {
		return lastDigits;
	}

	public void setLastDigits(String lastDigits) {
		this.lastDigits = lastDigits;
	}

	public String getReceipt() {
		return receipt;
	}

	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}

	public String getRefunded() {
		return refunded;
	}

	public void setRefunded(String refunded) {
		this.refunded = refunded;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getFranchiseName() {
		return franchiseName;
	}

	public void setFranchiseName(String franchiseName) {
		this.franchiseName = franchiseName;
	}

	public Conversion getConversion() {
		return conversion;
	}

	public void setConversion(Conversion conversion) {
		this.conversion = conversion;
	}
}
