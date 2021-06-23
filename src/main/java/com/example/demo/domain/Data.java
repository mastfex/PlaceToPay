package com.example.demo.domain;

public class Data {
	 private String enrolled;
	 private String authenticated;
	 private String validSignature;
	 private String eci;
	 private String cavv;
	 private String xid;
	 
	public Data(String enrolled, String authenticated, String validSignature, String eci, String cavv, String xid) {
		super();
		this.enrolled = enrolled;
		this.authenticated = authenticated;
		this.validSignature = validSignature;
		this.eci = eci;
		this.cavv = cavv;
		this.xid = xid;
	}

	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEnrolled() {
		return enrolled;
	}

	public void setEnrolled(String enrolled) {
		this.enrolled = enrolled;
	}

	public String getAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(String authenticated) {
		this.authenticated = authenticated;
	}

	public String getValidSignature() {
		return validSignature;
	}

	public void setValidSignature(String validSignature) {
		this.validSignature = validSignature;
	}

	public String getEci() {
		return eci;
	}

	public void setEci(String eci) {
		this.eci = eci;
	}

	public String getCavv() {
		return cavv;
	}

	public void setCavv(String cavv) {
		this.cavv = cavv;
	}

	public String getXid() {
		return xid;
	}

	public void setXid(String xid) {
		this.xid = xid;
	}
	 
	 
}
