package com.java10.q2;

public class HistoryStudent extends Student{
	

	int historyMarks;
	int civicsMarks;

	@Override
	public double getPercentage() {
		
		double p=(historyMarks+civicsMarks)/2;
		return p;
	}

}
