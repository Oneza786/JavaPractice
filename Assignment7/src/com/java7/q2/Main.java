package com.java7.q2;

public class Main {

	public static void main(String[] args) {
		DayScholar d1=new DayScholar();
		d1.studName="Ramesh";
		d1.studId=1;
		d1.transportFee=200;
		d1.examFee=300;
		
		double f1=d1.payFee(2000,d1.transportFee);
		double f=f1-d1.transportFee;
		d1.displayDetails();
		System.out.println(f);
		
		Hosteler h1=new Hosteler();
		h1.studName="Kashif";
		h1.studId=26;
		h1.hostelFee=400;
		h1.examFee=300;
		double hFee=h1.payFee(2000,h1.hostelFee);
		double hFeeFinal=hFee-h1.examFee;
		h1.displayDetails();
		System.out.println(hFeeFinal);
		
}
}
