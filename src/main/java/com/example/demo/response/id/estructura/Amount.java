package com.example.demo.response.id.estructura;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor
public class Amount {
	private String total;
    private String currency;
}
