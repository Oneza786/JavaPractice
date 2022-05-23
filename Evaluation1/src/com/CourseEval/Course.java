package com.CourseEval;

import java.util.Scanner;
public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails()
	{
		System.out.println(courseId);
		System.out.println(courseName);
		System.out.println(courseFee);
		
	}
	
	static void authenticate(String username, String password)
	{
		if(username=="Admin" & password=="1234")
		{
			Course data=new Course();
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter Course ID:");
			data.courseId=s.nextInt();
			
			System.out.println("Enter Course Name:");
			data.courseName=s.next();
			
			System.out.println("Enter Course Fee:");
			data.courseFee=s.nextInt();
			
			data.displayCourseDetails();
		}
		else
		{
			System.out.println("Invalid Username or password");
		}
	}
	
	
	public static void main(String[] args)
	{
		authenticate("Admin","1234");
		authenticate("Heloo","4567");
	}
	
}
