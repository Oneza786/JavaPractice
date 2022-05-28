package com.java3.q1;

public class CheckWhether {
	public static void main(String[] args) {

		
		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 60.0;
		if(isSnowing==true || isRaining==true || temperature>50.0)
		{
			System.out.println("Lets go home!");
		}
		else
		{
			System.out.println("Lets Go out!");
		}
		

	}
}
