package com.java10.q2;

public class HistoryStudent extends Student{
	
	

	public HistoryStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	int historyMarks;
	int civicsMarks;

	
	public void getPercentage() {
		
		int p=(historyMarks+civicsMarks)/2;
		
	}

}
