package com.java7.q1;

public class Main {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="Ramesh";
		e.age=27;
		e.address="Bangalore";
		e.phoneNum="123";
		e.salary=24000;
		e.printSalary();
		
		
		Manager m=new Manager();
		m.name="Kashif";
		m.age=32;
		m.address="Pune";
		m.phoneNum="678969";
		m.salary=50000;
		m.printSalary();
	}
}
