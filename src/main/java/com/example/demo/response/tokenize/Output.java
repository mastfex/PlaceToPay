package com.example.demo.response.tokenize;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Output {
	@JsonProperty("StatusObject")
	private Status StatusObject;
	private String provider;
	@JsonProperty("InstrumentObject")
	private Instrument InstrumentObject;

	// Getter Methods

	public Status getStatus() {
		return StatusObject;
	}

	public String getProvider() {
		return provider;
	}

	public Instrument getInstrument() {
		return InstrumentObject;
	}

	// Setter Methods

	public void setStatus(Status statusObject) {
		this.StatusObject = statusObject;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public void setInstrument(Instrument instrumentObject) {
		this.InstrumentObject = instrumentObject;
	}
}
