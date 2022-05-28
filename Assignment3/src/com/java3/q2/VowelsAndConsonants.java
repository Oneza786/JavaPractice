package com.java3.q2;

public class VowelsAndConsonants {
	public void displayVandC(char ch)
	{
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
					ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				System.out.println(ch+" is a Vowel");
			}
			else
			{
				System.out.println(ch+" is a Consonant");
			}
		}
		else
		{
			System.out.println("Character is not valid");
		}
		
			
	}
	
	public static void main(String[] args) {
		VowelsAndConsonants c1=new VowelsAndConsonants();
//		VowelsAndConsonants c2=new VowelsAndConsonants();
//		VowelsAndConsonants c3=new VowelsAndConsonants();
		
		c1.displayVandC('a');
		c1.displayVandC('F');
		c1.displayVandC('*');
	}
}
