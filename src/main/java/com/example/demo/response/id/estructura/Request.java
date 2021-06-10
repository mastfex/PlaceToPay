package com.example.demo.response.id.estructura;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor
public class Request {
	private String ipAddress;
    private Payment payment;
    private String userAgent;
    private String expiration;
    private String captureAddress;
    private String noBuyerFill;
    private String locale;
    private String returnUrl;
    private String skipResult;
    private Buyer buyer;
}
