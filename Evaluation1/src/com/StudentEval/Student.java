package com.StudentEval;

public class Student {
	private int rollNumber;
	private String studentName;
	private int marks;
	
	public Student() //Zero Argument Constructor
	{
		
	}
	 
	
	
	public int getrollNumber()
	{
		return rollNumber;
	}
	public void setrollNumber(int rollNumber)
	{
		this.rollNumber=rollNumber;
	}
	
	public String getstudentName()
	{
		return studentName;
	}
	public void setstudentName(String studentName)
	{
		this.studentName=studentName;
	}
	
	public int getmarks()
	{
		return marks;
	}
	public void setmarks(int marks)
	{
		this.marks=marks;
	}
	
	public Student(int rollNumber, String studentName, int Marks) //Parameterized Constructor
	{
		this.rollNumber=rollNumber;
		this.studentName=studentName;
		this.marks=marks;
	}
	
	
	public void details()
	{
		System.out.println("Student Roll Number:" + rollNumber);
		System.out.println("Student Name:" + studentName);
		System.out.println("Student Marks:" + marks);
	}
	
}
