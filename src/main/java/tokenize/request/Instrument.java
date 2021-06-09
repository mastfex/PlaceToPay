package tokenize.request;

public class Instrument {
	private Card CardObject;
	private String otp;

	// Getter Methods

	public Card getCard() {
		return CardObject;
	}

	public String getOtp() {
		return otp;
	}

	// Setter Methods

	public void setCard(Card cardObject) {
		this.CardObject = cardObject;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}
}
