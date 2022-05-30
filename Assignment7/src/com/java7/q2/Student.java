package com.java7.q2;

public class Student {
	int studId;
	String studName;
	double examFee;
	
	
	public double payFee(int fee,double vFee)
	{
		double feeToPay=fee-vFee;
		return feeToPay;
	}
	public void displayDetails()
	{
		System.out.println(studId);
		System.out.println(studName);
		
	}
}
