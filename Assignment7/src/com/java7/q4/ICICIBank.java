package com.java7.q4;

public class ICICIBank extends Bank 
{
	double rateOfInterest=7.5;
	@Override
	public void displayDetails()
	{
		System.out.println("Branch name is: "+branchName);
		System.out.println("IFSC Code is: "+IfscCode);
		System.out.println("ROI is: "+rateOfInterest);
	}

}
