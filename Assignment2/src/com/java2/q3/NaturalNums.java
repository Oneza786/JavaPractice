package com.java2.q3;

public class NaturalNums {
	public static void sumNaturalNums(int i)
	{
		int sum=(i*(i+1))/2;
		System.out.println("Sum of First "+i+" Natural Numbers is "+sum);
	}
	
	public static void main(String[] args) {
		sumNaturalNums(10);
	}
}
