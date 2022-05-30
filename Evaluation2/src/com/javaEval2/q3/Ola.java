package com.javaEval2.q3;

public class Ola {

	String s;
	int km;
	public Car bookCar(int numberOfPassenger, int numberOfKMs)
	{
		
		Sedan sedan=new Sedan();
		HatchBack hatch=new HatchBack();
		
		if(numberOfPassenger<=3)
		{
			s="hatch";
			hatch.setNumberOfKms(numberOfKMs);
			km=hatch.getNumberOfKms();
			return hatch;
		}
		else
		{
			s="sedan";
			sedan.setNumberOfKms(numberOfKMs);
			km=sedan.getNumberOfKms();
			return sedan;
		}
	}
	int f;
	public int calculateBill(Car car)
	{
		
		if(s.equals("sedan"))
		{
			
			Sedan d1=(Sedan)car;
			f=d1.farePerKm;
			int bill=km*f;
			return bill;
		}
		else
		{
			HatchBack d1=(HatchBack)car;
			f=d1.farePerKm;
			int bill=km*f;
			return bill;
		}
		
		 
		
	}

	
}
