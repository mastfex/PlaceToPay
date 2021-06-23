package com.example.demo.response;

import com.example.demo.domain.Data;
import com.example.demo.domain.Status;

public class MpiLookupResponse {
	private Status status;
	private Data data;
	
	public MpiLookupResponse(Status status, Data data) {
		super();
		this.status = status;
		this.data = data;
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

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
}
