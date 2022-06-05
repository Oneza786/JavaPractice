package com.java10.q4;

public class Area extends Shape{

	int a;
	@Override
	public int rectangleArea(int length, int breadth) {
		a=length*breadth;
		return a;
	}

	@Override
	public int squareArea(int side) {
		a=side*side;
		return a;
	}

	@Override
	public int circleArea(int radius) {
		a=(4/3)*(22/7)*(radius*radius);
		return a;
	}

}
