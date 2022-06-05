package com.java10.q4;

public class Main {
	
	public static void main(String[] args) {
		
		
		Area a1=new Area();
		int ans=a1.circleArea(10);
		int ans1=a1.rectangleArea(5, 170);
		int ans2=a1.squareArea(40);
		System.out.println("Area of Circle = "+ans);
		System.out.println("Area of Rectangle = "+ans1);
		System.out.println("Area of Square = "+ans2);
	}

}
