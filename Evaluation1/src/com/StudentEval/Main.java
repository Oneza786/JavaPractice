package com.StudentEval;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		
		Student data=new Student();
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Number of Students you want to enter:");
		int num=s.nextInt();
		
		for(int i=0; i<num; i++)
		{
			
			System.out.println("Enter the Roll Number :");
			int roll=s.nextInt();
			
			
			System.out.println("Enter the Name :");
			String name=s.next();
			
			
			System.out.println("Enter the Marks :");
			int mark=s.nextInt();
			
			data.setrollNumber(roll);
			data.setstudentName(name);
			data.setmarks(mark);
			data.details();
			
			
		}
	}

}
