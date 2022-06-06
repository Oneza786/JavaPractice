package com.javaEval3.q2;

public class PermanentEmployee extends Employee{
	
	private double basicPay;
	
	public PermanentEmployee()
	{
		
	}
	
	public PermanentEmployee (int employeeId, String employeeName, double basicPay)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicPay=basicPay;
	}
	
	double pfAmt=basicPay*0.12;
	@Override
	public void calculateSalary() {
		salary = basicPay - pfAmt;
		
	}

}
