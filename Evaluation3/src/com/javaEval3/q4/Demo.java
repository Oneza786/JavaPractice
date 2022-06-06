package com.javaEval3.q4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	public boolean validateDetails(String username, String password, String mobileNumber, String email)
	{
		boolean un = Pattern.matches("^[a-zA-Z]{3,8}+$", username);
		boolean pw = Pattern.matches("[a-zA-Z0-9]{3,8}+$", password);
		boolean mn = Pattern.matches("^[6789]{1}[0-9]{9}+$", mobileNumber);
		boolean e= Pattern.matches("^[a-zA-Z0=9+_.-]+@+[a-zA-Z0-9.]+[com]+$", email);
		System.out.println(un);
		System.out.println(pw);
		System.out.println(mn);
		System.out.println(e);
		if(un==true && pw==true && mn==true && e==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Demo d1= new Demo();
		
		System.out.println("Enter Username");
		String uName=sc.next();
		
		System.out.println("Enter Password");
		String pass=sc.next();
		
		System.out.println("Enter Mobile Number");
		String num=sc.next();
		
		System.out.println("Enter Email");
		String email=sc.next();
		
		boolean ans=d1.validateDetails(uName, pass, num, email);
		
		if(ans==true)
		{
			Customer c=new Customer();
			c.setUsername(uName);
			c.setPassword(pass);
			c.setMobileNumber(num);
			c.setEmail(email);
			c.printCustomerDetails();
		}
		else
		{
			System.out.println("Please Enter valid details");
		}
		
		
	}
}
