package com.example.demo.response.create.estructura;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor
public class CreateOutput {
	private Status status;
	private String requestId;
	private String processUrl;
}
