package com.javaEval2.q3;

public class Ola {
	int kms;
	int f;
	public Car bookCar(int numberOfPassenger, int numberOfKMs)
	{
		
		if(numberOfPassenger<=3)
		{
			Car carSedan=new Sedan();
			carSedan.setNumberOfKms(numberOfKMs);
			kms=carSedan.getNumberOfKms();
			Sedan c1=(Sedan)carSedan;
			f=c1.farePerKm;
			return c1;
		}
		else
		{
			Car carHatch=new HatchBack();
			carHatch.setNumberOfKms(numberOfKMs);
			kms=carHatch.getNumberOfKms();
			HatchBack h1=(HatchBack)carHatch;
			f=h1.farePerKm;
			return h1;
		}
	}

	public int calculateBill(Car car)
	{
		
		if(car.equals("c1"))
		{
			Sedan s=new Sedan();
			int fare=s.farePerKm;
			int bill=fare*kms;
			return bill;
		}
		else 
		{
			HatchBack h=new HatchBack();
			int fare=h.farePerKm;
			int bill=fare*kms;
			return bill;
		}
		
	}

	
}
