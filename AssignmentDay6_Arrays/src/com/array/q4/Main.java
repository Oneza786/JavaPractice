package com.array.q4;

public class Main {
	public static void main(String[] args)
	{
		int size=args.length;
		if(size==1) 
		{
			int n=Integer.parseInt(args[0]);
			int fact=1;
			while(n>0)
			{
				fact=fact*n;
				n--;
			}
			System.out.println(fact);
		}
		else if(size==2)
		{
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[2]);
			int diff=Math.abs(n1-n2);
			int fact=1;
			while(diff>0)
			{
				fact=fact*diff;
				diff--;
			}
			System.out.println(fact);
		}
		else
		{
			System.out.println("Error");
		}
	}
}
