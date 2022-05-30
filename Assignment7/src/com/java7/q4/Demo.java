package com.java7.q4;

import java.util.Scanner;

public class Demo {
	
	public static Bank getBank(String bank)
	{
		if(bank.equals("axis"))
		{
			AxisBank axis=new AxisBank();
			axis.branchName="Peenya";
			axis.IfscCode="ASDRG5";
			return axis;
			
		}
		else if(bank.equals("icici"))
		{
			ICICIBank icici=new ICICIBank();
			icici.branchName="Yeshwanthpura";
			icici.IfscCode="FVGHBN45";
			return icici;
		}
		else
		{
			return null;
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bank: ");
		String name=sc.next();
		Bank details=getBank(name);
		System.out.println(details);
		
		if(details.branchName.equals("Peenya"))
		 {
			AxisBank a1=(AxisBank)details;
			a1.displayDetails();
			a1.getCreditCard();
		 }
		else if(details.branchName.equals("Yeshwanthpura"))
		{
			
			details.displayDetails();
		}
		else
		{
			System.out.println("Invalid Bank");
		}
	}
}
