package com.java9.q4;

public class Parent {
	final int number;

	void method1(int number) {
		System.out.println("Inside method1 in Parent Class");
	}
	final void method2() {
		System.out.println("Inside method2 in Parent Class");
	}
	void method3() {
		System.out.println("Inside method3 in Parent Class");
	}
	
	public Parent() {
		this.number = 0;
		
		
	}
	public Parent(int number) {
		this.number = number;
	}
}
