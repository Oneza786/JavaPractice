package com.masai;

public class Student {
	
	
	private int roll;
	private String name;
	private int marks;

	//Has-A relationship
	private Address address;
	
	
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {
		
	}
	
	
	
	
	
	
	public Student(int roll, String name, int marks, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}

	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}  
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
