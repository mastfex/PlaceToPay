package com.example.demo.domain;

public class To {
	private String total;
    private String currency;

    public To(String total, String currency) {
		super();
		this.total = total;
		this.currency = currency;
	}

	public To() {
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
