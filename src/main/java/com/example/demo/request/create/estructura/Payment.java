package com.example.demo.request.create.estructura;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor
public class Payment {
	  private String reference;
	  private Amount amount;
	  private String description;
	  private String allowPartial;	
}
