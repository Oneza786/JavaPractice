package com.javaEval3.q4;

public class Customer {
	private String username;
	private String password;
	private String mobileNumber;
	private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void printCustomerDetails()
	{
		System.out.println("Username = "+username);
		System.out.println("Password = "+password);
		System.out.println("Mobile Number = "+mobileNumber);
		System.out.println("Email = "+email);
	}
	
}
