package com.javaEval3.q3;

import java.util.Scanner;

public class Demo {
	public void showDetails(Month m)
	{
		

		if(m==Month.JANUARY)
		
			System.out.println("This is the 1st Month of the Year January");
		if (m==Month.FEBRUARY)
		
			System.out.println("This is the 2nd Month of the Year February");


		if(m==Month.MARCH)
		
			System.out.println("This is the 3rd Month of the Year March");
		if (m==Month.APRIL)
		
			System.out.println("This is the 4th Month of the Year April");
		
		if(m==Month.MAY)
			System.out.println("This is the 5th Month of the Year May");
		
		if(m==Month.JUNE)
			System.out.println("This is the 6th Month of the Year June");
		
		if(m==Month.JULY)
			System.out.println("This is the 7th Month of the Year July");
		
		if(m==Month.AUGUST)
			System.out.println("This is the 8th Month of the Year August");
		
		if(m==Month.SEPTEMBER)
			System.out.println("This is the 9th Month of the Year September");
		
		if(m==Month.OCTOBER)
			System.out.println("This is the 10th Month of the Year October");
		
		if(m==Month.NOVEMBER)
			System.out.println("This is the 11th Month of the Year November");
		
		if(m==Month.DECEMBER)
			System.out.println("This is the 12th Month of the Year December");


	}
	
	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the Month");
			String m=sc.next();
			
			Demo d1=new Demo();
			
			Month m1=Month.valueOf(m);
			d1.showDetails(m1);
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("Invalid Month Name");
		}
		
		
	}
}
