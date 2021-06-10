package com.example.demo.response.id.estructura;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import request.Id.estructura.Auth;

@Data
@NoArgsConstructor 
@AllArgsConstructor
public class RequestOutput {
	private Request request;
    private String requestId;
    private Status status;
}
