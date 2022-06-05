package com.java10.q2;

import java.util.Scanner;

public class AllStudent {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter s for Science Student "
				+ "and h for History Student");
		String sub=sc.next();
		
		if(sub=="s")
		{
			ScienceStudent science=new ScienceStudent();
			System.out.println("Enter the Name of Student ");
			String name=sc.next();
			science.name=name;
			System.out.println("Enter Student Address ");
			String add=sc.next();
			science.address=add;
			System.out.println("Enter Student Maths Marks ");
			int maths=sc.nextInt();
			science.mathsMarks=maths;
			System.out.println("Enter Student Chemistry Marks ");
			int chem=sc.nextInt();
			science.chemistryMarks=chem;
			System.out.println("Enter Student Physics Markjs");
			int phy=sc.nextInt();
			science.physicsMarks=phy;
			science.getPercentage();
			System.out.println("Student Details- ");
			System.out.println("Name- "+name);
			System.out.println("Address- "+add);
			System.out.println("Percentage- "+per);
		}
		else if(sub=="h")
		{
			HistoryStudent history=new HistoryStudent();
			System.out.println("Enter the Name of Student ");
			String name=sc.next();
			history.name=name;
			System.out.println("Enter Student Address ");
			String add=sc.next();
			history.address=add;
			System.out.println("Enter Student Maths Marks ");
			int civics=sc.nextInt();
			history.civicsMarks=civics;
			System.out.println("Enter Student Chemistry Marks ");
			int his=sc.nextInt();
			history.historyMarks=his;
			int per=history.getPercentage();
			System.out.println("Student Details- ");
			System.out.println("Name- "+name);
			System.out.println("Address- "+add);
			System.out.println("Percentage- "+per);
			
		}
		
		
		
		
		
		
	}
}
