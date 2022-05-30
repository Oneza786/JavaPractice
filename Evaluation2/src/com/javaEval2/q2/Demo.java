package com.javaEval2.q2;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Students: ");
		int noOfStu=sc.nextInt();
		Student[] students=new Student[noOfStu];
		
		
		int[] marksArr=new int[students.length];
		for(int i=0; i<students.length; i++)
		{
			Student s=new Student();
			System.out.println("Enter Student Roll: ");
			int roll=sc.nextInt();
			s.setRoll(roll);
			int sRoll=s.getRoll();
			
			
			System.out.println("Enter Student Name: ");
			String name=sc.next();
			s.setName(name);
			String sName=s.getName();
			
			
			System.out.println("Enter Student Address");
			String address=sc.next();
			s.setAddress(address);
			String sAdd=s.getAddress();
			
			
			System.out.println("Enter Studend Marks");
			int marks=sc.nextInt();
			s.setMarks(marks);
			int sMarks=s.getMarks();
			marksArr[i]=sMarks;
			
			
			System.out.println("Student Roll Number: "+sRoll);
			System.out.println("Student Name: "+sName);
			System.out.println("Student Address: "+sAdd);
			System.out.println("Student Marks: "+sMarks);
		}
		
		int sum=0;
		for(int x:marksArr)
		{
			sum=sum+x;
		}
		
		int avr=sum/students.length;
		System.out.println("Average of Students Marks: "+avr);
	}
	
}
