package transaction.request;

public class Payment {
	private String reference;
	private	String description;
	private Amount amount;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(String reference, String description, Amount amount) {
		super();
		this.reference = reference;
		this.description = description;
		this.amount = amount;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	
	
}
