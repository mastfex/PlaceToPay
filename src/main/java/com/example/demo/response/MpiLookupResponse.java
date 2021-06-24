package com.example.demo.response;

import com.example.demo.domain.Data;
import com.example.demo.domain.Status;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MpiLookupResponse {
	@JsonProperty("status")
	private Status status;
	
	public MpiLookupResponse(Status status) {
		super();
		this.status = status;
	}

	public MpiLookupResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
