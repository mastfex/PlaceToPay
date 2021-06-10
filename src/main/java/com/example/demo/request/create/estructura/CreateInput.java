package com.example.demo.request.create.estructura;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor
public class CreateInput {
	private Auth auth;
	private String ipAddress;
	private Payment payment;
	private String expiration;
	private String userAgent;
	private String locale;
	private String returnUrl;
	private Buyer buyer;

}
