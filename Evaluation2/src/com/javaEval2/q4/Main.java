package com.javaEval2.q4;

public class Main {
	public static Person generatePerson(Person person);
	{
		if(person.equals("newStudent"))
		{
			
		}
	}
	
	public static void main(String[] args) {
		Person newStudent = generatePerson(new Student());
		Person newInstructor = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println(newInstructor);
		 
	}

	
}
