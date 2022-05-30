package com.javaEval2.q3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Passengers: ");
		int numPassengers=sc.nextInt();
		
		
		System.out.println("Enter Number of Kms: ");
		int numKms=sc.nextInt();
		
		Ola carOla=new Ola();
		Car bookedCar=carOla.bookCar(numPassengers, numKms);
		
		int res=carOla.calculateBill(bookedCar);
		
		System.out.println("The Total fare is: "+res);
	}
}
