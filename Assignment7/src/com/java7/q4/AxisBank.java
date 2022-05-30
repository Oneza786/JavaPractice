package com.java7.q4;

public class AxisBank extends Bank
{
	double rateOfInterest=7;
	@Override
	public void displayDetails()
	{
		System.out.println("Branch name is: "+branchName);
		System.out.println("IFSC Code is: "+IfscCode);
		System.out.println("ROI is: "+rateOfInterest);
	}
	
	public void getCreditCard()
	{
		System.out.println("Get the Credit Card from the Axis bank");
	}
}
