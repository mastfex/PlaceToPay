package transaction.response;

public class Conversion {
	private From from;
    private To to;
    private String factor;

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
