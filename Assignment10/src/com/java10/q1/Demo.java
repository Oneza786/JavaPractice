package com.java10.q1;

import java.util.Scanner;

public class Demo {
	public Hotel provideFood(int amount)
	{
		if(amount>1000)
		{
			TajHotel hotel1=new TajHotel();
			return hotel1;
		}
		else if(amount>200 && amount<=1000)
		{
			RoadSideHotel hotel2=new RoadSideHotel();
			return hotel2;
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int amt=sc.nextInt();
		Demo d1=new Demo();
		Hotel myObj=d1.provideFood(amt);
		
		if(myObj instanceof TajHotel)
		{
			myObj.chickenBiryani();
			myObj.masalaDosa();
			((TajHotel) myObj).welcomeDrink();
		}
		else if(myObj instanceof RoadSideHotel)
		{
			myObj.chickenBiryani();
			myObj.masalaDosa();
		}
		else
		{
			System.out.println("Enter Valid Amount");
		}
	}
}
