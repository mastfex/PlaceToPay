package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Conversion {
	@JsonProperty("from")
	private From from;
	@JsonProperty("to")
    private To to;
    private String factor;

    public Conversion(From from, To to, String factor) {
		super();
		this.from = from;
		this.to = to;
		this.factor = factor;
	}

	public Conversion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public From getFrom ()
    {
        return from;
    }

    public void setFrom (From from)
    {
        this.from = from;
    }

    public To getTo ()
    {
        return to;
    }

    public void setTo (To to)
    {
        this.to = to;
    }

    public String getFactor ()
    {
        return factor;
    }

    public void setFactor (String factor)
    {
        this.factor = factor;
    }
}
