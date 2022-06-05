package com.java10.q2;

public abstract class Student {
	String name;
	String address;
	
	public abstract void getPercentage();

	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
}
