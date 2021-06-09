package transaction.response;

public class Additional {
	private String terminalNumber;

    private String totalAmount;

    private String merchantCode;

    private String installmentAmount;

    private String line;

    private String bin;

    private String batch;

    private String interestAmount;

    private String iceAmount;

    private String expiration;

    private String PAN;

    private Credit credit;

    public String getTerminalNumber ()
    {
        return terminalNumber;
    }

    public void setTerminalNumber (String terminalNumber)
    {
        this.terminalNumber = terminalNumber;
    }

    public String getTotalAmount ()
    {
        return totalAmount;
    }

    public void setTotalAmount (String totalAmount)
    {
        this.totalAmount = totalAmount;
    }

    public String getMerchantCode ()
    {
        return merchantCode;
    }

    public void setMerchantCode (String merchantCode)
    {
        this.merchantCode = merchantCode;
    }

    public String getInstallmentAmount ()
    {
        return installmentAmount;
    }

    public void setInstallmentAmount (String installmentAmount)
    {
        this.installmentAmount = installmentAmount;
    }

    public String getLine ()
    {
        return line;
    }

    public void setLine (String line)
    {
        this.line = line;
    }

    public String getBin ()
    {
        return bin;
    }

    public void setBin (String bin)
    {
        this.bin = bin;
    }

    public String getBatch ()
    {
        return batch;
    }

    public void setBatch (String batch)
    {
        this.batch = batch;
    }

    public String getInterestAmount ()
    {
        return interestAmount;
    }

    public void setInterestAmount (String interestAmount)
    {
        this.interestAmount = interestAmount;
    }

    public String getIceAmount ()
    {
        return iceAmount;
    }

    public void setIceAmount (String iceAmount)
    {
        this.iceAmount = iceAmount;
    }

    public String getExpiration ()
    {
        return expiration;
    }

    public void setExpiration (String expiration)
    {
        this.expiration = expiration;
    }

    public String getPAN ()
    {
        return PAN;
    }

    public void setPAN (String PAN)
    {
        this.PAN = PAN;
    }

    public Credit getCredit ()
    {
        return credit;
    }

    public void setCredit (Credit credit)
    {
        this.credit = credit;
    }

}
