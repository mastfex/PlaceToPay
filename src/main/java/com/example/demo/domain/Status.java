package com.example.demo.domain;

public class Status {
	private String date;
    private String reason;
    private String message;
    private String status;

    public Status(String date, String reason, String message, String status) {
		super();
		this.date = date;
		this.reason = reason;
		this.message = message;
		this.status = status;
	}

	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getReason ()
    {
        return reason;
    }

    public void setReason (String reason)
    {
        this.reason = reason;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

}
