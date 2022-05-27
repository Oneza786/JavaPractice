package com.array.q3;

public class Main {
	public int[] findAndReturnPrimeNum(int[] inpArr)
	{
		int[] primeArr=new int[inpArr.length];
		
		for(int i=0; i<inpArr.length; i++)
		{
			int fact=0;
			for(int j=1; j<=inpArr[i];j++)
			{
				if(inpArr[i]%j==0)
				{
					fact++;
				}
			}
			if(fact==2)
			{
				primeArr[i]=inpArr[i];
			}
		}
		return primeArr;
	}
	
	public static void main (String[] args)
	{
		Main obj=new Main();
		int[] arr = {10,12,5,50,11,14,15};
		int[] resArr=obj.findAndReturnPrimeNum(arr);
		String finalArr="";
		if(resArr==null)
		{
			System.out.println("Prime number not found in the supplied Array");
		}
		else
		{
			
			for(int k=0; k<resArr.length; k++)
			{
				if(resArr[k]!=0)
				{
					finalArr=finalArr+resArr[k]+" ";
				}
			}
		}
		System.out.println(finalArr);
		
	}
}
