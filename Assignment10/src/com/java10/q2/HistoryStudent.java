package com.java10.q2;

public class HistoryStudent extends Student{
	

	int historyMarks;
	int civicsMarks;

	@Override
	public void getPercentage() {
		
		int p=(historyMarks+civicsMarks)/2;
		
	}

}
