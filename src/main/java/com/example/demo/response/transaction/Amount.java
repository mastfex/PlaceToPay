package com.example.demo.response.transaction;

public class Amount {
	
	private String total;
    private String currency;
    
    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getCurrency ()
    {
        return currency;
    }

    public void setCurrency (String currency)
    {
        this.currency = currency;
    }
}
