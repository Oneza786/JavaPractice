package com.java2.q4;

public class CricketScore {
	public static void scores(int ones, int twos, int threes, int fours, int sixes)
	
	{
		int score=(ones*1)+(twos*2)+(threes*3)+(fours*4)+(sixes*6);
		System.out.println("Total Score: "+score);
	}
	
	public static void main(String[] args) {
		scores(3,6,7,1,2);
	}
}
