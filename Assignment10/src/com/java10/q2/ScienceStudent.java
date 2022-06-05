package com.java10.q2;

public class ScienceStudent extends Student {
	
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	@Override
	public double getPercentage() {
		int p=(physicsMarks+chemistryMarks+mathsMarks)/3;
		return p;
		
	}
	
	
	
	
}
