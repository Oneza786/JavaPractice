package com.java3.q3;

public class Student {
	int roll;
	String name;
	int marks;
	
	public void displayStudentDetails(int roll, String name, int marks)
	{
		System.out.println("Roll is: "+roll);
		System.out.println("Name is: "+name);
		System.out.println("Marks is: "+marks);
	}
	public static void main(String[] args) 
	{
		Student s1=new Student();
		Student s2=new Student();
		
		s1.displayStudentDetails(1, "Rohan", 40);
		s2.displayStudentDetails(2,  "Aakash", 50);
		
	}
}
