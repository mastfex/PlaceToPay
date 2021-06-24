package com.example.demo.domain;

public class Credit {
	private String code;
    private String installments;
    private String type;
    private String groupCode;

    public Credit(String code, String installments, String type, String groupCode) {
		super();
		this.code = code;
		this.installments = installments;
		this.type = type;
		this.groupCode = groupCode;
	}

	public Credit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public String getInstallments ()
    {
        return installments;
    }

    public void setInstallments (String installments)
    {
        this.installments = installments;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getGroupCode ()
    {
        return groupCode;
    }

    public void setGroupCode (String groupCode)
    {
        this.groupCode = groupCode;
    }

}
