package com.eval;

public class QuestionFirst {
	// Strings are Immutable in java to save space.
	
	
	// String Class vs String Builder -
	// String are immutable whereas String Builder is a mutable sequence of Characters.
	// Strings are be created in 3 ways - 1. String Literals, 2. Using new keyword
	// and 3. Using String class.
	// To create String Builder the syntax is -
	// StringBuilder str=new StringBuilder("Hello");
	String s="Hello";
	String s1="World";
	
	int l=s.length();
	boolean c=s.equals(s1);
	
	String s3=s.concat(s1);
	
	char f=s.charAt(l);
	int g=s.indexOf(f);
	
	
}
