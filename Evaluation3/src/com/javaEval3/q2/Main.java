package com.javaEval3.q2;

public class Main {
	public static void main(String[] args) {
		Object o1=new Object();
		Loan l1=(Loan)o1;
		
		PermanentEmployee p1=new PermanentEmployee();
		TemporaryEmployee t1=new TemporaryEmployee();
		
		double d1=l1.calculateLoanAmount(t1);
		System.out.println("Loan Amount = "+d1);
		double d2=l1.calculateLoanAmount(p1);
		System.out.println("Loan Amount = "+d2);
		double d3=l1.calculateLoanAmount(null);
		System.out.println("Loan cannot be passed");
		
	}
}
