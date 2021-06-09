package tokenize.response;

public class Status {
	private String status;
	private String reason;
	private String message;
	private String date;

	// Getter Methods

	public String getStatus() {
		return status;
	}

	public String getReason() {
		return reason;
	}

	public String getMessage() {
		return message;
	}

	public String getDate() {
		return date;
	}

	// Setter Methods

	public void setStatus(String status) {
		this.status = status;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
