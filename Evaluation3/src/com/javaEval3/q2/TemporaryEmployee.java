package com.javaEval3.q2;

public class TemporaryEmployee extends Employee{

	private int hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee()
	{
		
	}
	public TemporaryEmployee(int employeeId,String employeeName,int hourlyWages,int hoursWorked)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.hourlyWages=hourlyWages;
		this.hoursWorked=hoursWorked;
	}
	@Override
	public void calculateSalary() {
		salary = hoursWorked * hourlyWages;
		
	}

}
