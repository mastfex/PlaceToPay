package com.example.demo.response.tokenize;

public class Output {
	private Status StatusObject;
	private String provider;
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
