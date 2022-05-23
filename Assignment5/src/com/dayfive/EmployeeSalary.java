package com.dayfive;

public class EmployeeSalary {
	private int empId;
	private String empName;
	private double salary;
	private double netSalary;
	
	public static EmployeeSalary getEmployeeDetails(int empId, String empName, double salary)
	{
		
	}
	
	public void calculateNetSalary(int pfPer)
	{
		netSalary=salary-pfPer;
		
	}
	
}
