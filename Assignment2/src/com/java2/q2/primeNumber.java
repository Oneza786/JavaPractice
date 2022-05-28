package com.java2.q2;

public class primeNumber {
	public static void primeNum(int num)
	{
		if (num<2 || num>100)
		{
			System.out.println("Invalid Number");
		}
		else
		{
			int fact=0;
			for(int i=1; i<=num; i++)
			{
				if(num%2==0)
				{
					fact++;
				}
			}
			if(fact==2)
			{
				System.out.println(num+" is a Prime Number");
			}
			else
			{
				System.out.println(num+" is not a Prime Number");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		primeNum(40);
	}
}
