package com.array.q1;

import java.util.Scanner;
public class Main {
	
	public static String reverseString(String input)
	{
		
		char[] inptArr= new char[input.length()];
		int n=input.length();
		int j=0;
		for(int i=n-1; i>=0; i--)
		{
			inptArr[i]=input.charAt(j);
			j++;
		}
//		System.out.println(inptArr);
		String result= String.valueOf(inptArr);
		return result;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String:");
		String ogString=sc.next();
		String res = reverseString(ogString);
		
		System.out.println("Original String: "+ogString);
		System.out.println("Reversed String: "+res);
		
	}

}
