package com.training.web.model;

public class User {
	
	private String userName;
	private String password;
	private String dateOfJoining;
	
	public User() {
		
	}

	public User(String userName, String password, String dateOfJoining) {
		super();
		this.userName = userName;
		this.password = password;
		this.dateOfJoining = dateOfJoining;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

}
