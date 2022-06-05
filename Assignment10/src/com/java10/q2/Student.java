package com.java10.q2;

public abstract class Student {
	String name;
	String address;
	
	public abstract double getPercentage();
	
	public Student()
	{
		
	}

	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
}
