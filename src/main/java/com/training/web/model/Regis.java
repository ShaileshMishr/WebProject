package com.training.web.model;

public class Regis {
	
	private String userId;
	private String mobileNo;
	
	public Regis() {
		
	}

	public Regis(String userId, String mobileNo) {
		super();
		this.userId = userId;
		this.mobileNo = mobileNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}
