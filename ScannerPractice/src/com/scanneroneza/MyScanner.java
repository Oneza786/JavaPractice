package com.scanneroneza;

import java.util.Scanner;

public class MyScanner {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=s.next();
		System.out.println(name);
		
		
		System.out.println("Enter Age");
		int age=s.nextInt();
		System.out.println(age);
		
	}
}
