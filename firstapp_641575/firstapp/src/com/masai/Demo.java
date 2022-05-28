package com.masai;

import java.util.Scanner;

public class Demo extends A{



	public static void main(String[] args) {

		
		Address adr1 = new Address();
		adr1.setState("Tamilnadu");
		adr1.setPincode("5234234");
		adr1.setCity("chennai");
		
		Student s1 = new Student(10, "Ram", 500, adr1);
		
		Student s2 = new Student(12, "Ramesh", 550, new Address("delhi","delhi", "784542"));
		
		Student s3 = new Student();
		
		s3.setRoll(14);
		s3.setName("rahul");
		s3.setMarks(780);
		s3.setAddress(new Address("sdf", "easd", "asdasd"));
		
		System.out.println("Roll is "+s1.getRoll());
		System.out.println("Name is "+s1.getName());
		System.out.println("Address is ");
		System.out.println("===================");

		System.out.println("City :"+s1.getAddress().getCity());
		System.out.println("State :"+s1.getAddress().getState());
		
		
		
		
		
		
		
		
		
	}
}


