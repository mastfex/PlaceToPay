package tokenize.request;

public class Card {
	 private String number;
	 private String expirationMonth;
	 private String expirationYear;
	 private String cvv;


	 // Getter Methods 

	 public String getNumber() {
	  return number;
	 }

	 public String getExpirationMonth() {
	  return expirationMonth;
	 }

	 public String getExpirationYear() {
	  return expirationYear;
	 }

	 public String getCvv() {
	  return cvv;
	 }

	 // Setter Methods 

	 public void setNumber(String number) {
	  this.number = number;
	 }

	 public void setExpirationMonth(String expirationMonth) {
	  this.expirationMonth = expirationMonth;
	 }

	 public void setExpirationYear(String expirationYear) {
	  this.expirationYear = expirationYear;
	 }

	 public void setCvv(String cvv) {
	  this.cvv = cvv;
	 }
}
