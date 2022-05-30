package com.java7.q1;

public class Employee extends Member{
	String specialization;
	String department;
	
	@Override
	public void printSalary()
	{
		System.out.println("Employee Information");
		System.out.println(name+age+address+
				phoneNum+salary);
	}

}
