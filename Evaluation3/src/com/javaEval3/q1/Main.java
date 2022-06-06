package com.javaEval3.q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		try
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the number of elements in the array");
			int n=sc.nextInt();
			
			
			int[] arr=new int[n];
			
			System.out.println("Enter the elements in the array");
			
			for(int i=0; i<n; i++)
			{
				int a1=sc.nextInt();
				arr[i]=a1;
			}
			
			System.out.println("Enter the index of the array element you want to access");
			int ind=sc.nextInt();
			
			System.out.println("The array element at index "+ind+" = "+arr[ind]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("java.lang.NumberFormatException");
		}
		catch(InputMismatchException inp)
		{
			System.out.println("java.lang.NumberFormatException");
		}
		
	}
}
