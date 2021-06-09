package transaction.request;

import com.request.autorizacion.Auth;

public class Input {
	private Auth auth;
	private Payment payment;
	private Instrument instrument;
	private String ipAddress;
    private String userAgent;
    private String additional;
    
	public Input() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Input(Auth auth, Payment payment, Instrument instrument, String ipAddress, String userAgent,
			String additional) {
		super();
		this.auth = auth;
		this.payment = payment;
		this.instrument = instrument;
		this.ipAddress = ipAddress;
		this.userAgent = userAgent;
		this.additional = additional;
	}

	public Auth getAuth() {
		return auth;
	}

	public void setAuth(Auth auth) {
		this.auth = auth;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getAdditional() {
		return additional;
	}

	public void setAdditional(String additional) {
		this.additional = additional;
	}
    
	
    
}
