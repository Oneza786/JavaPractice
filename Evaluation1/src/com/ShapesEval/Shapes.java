package com.ShapesEval;

public class Shapes {
	public void area(double radius)
	{
		double area=2*3.14*radius;
		System.out.println("Area of Circle"+" "+area);
	}
	
	public void area(int length, int breath)
	{
		double area=length*breath;
		System.out.println("Area of Rectangle"+" "+area);
	}
	
	public void area(int side)
	{
		double area=side*side;
		System.out.println("Area of Square"+" "+area);
	}
}
