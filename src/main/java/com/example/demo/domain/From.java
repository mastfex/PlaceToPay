package com.example.demo.domain;

public class From {
	private String total;
    private String currency;

    public From(String total, String currency) {
		super();
		this.total = total;
		this.currency = currency;
	}

	public From() {
		super();
		// TODO Auto-generated constructor stub
	}

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
