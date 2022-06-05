package com.java10.q2;

public class ScienceStudent extends Student {
	
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	@Override
	public void getPercentage() {
		int p=(physicsMarks+chemistryMarks+mathsMarks)/3;
		
		
	}
	
	
	
	
}
