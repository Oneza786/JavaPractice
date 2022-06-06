package com.javaEval3.q2;

public class Loan {
	
	private Loan()
	{
		
	}
	
	public double calculateLoanAmount(Employee employeeObj)
	{
		if(employeeObj instanceof PermanentEmployee)
		{
			PermanentEmployee p1=new PermanentEmployee();
			double s=p1.salary;
			double l=0.15*s;
			return l;
		}
		else if(employeeObj instanceof TemporaryEmployee)
		{
			TemporaryEmployee t1=new TemporaryEmployee();
			double s=t1.salary;
			double l=0.10*s;
			return l;
		}
		else
		{
			return 0;
		}
	}
}
