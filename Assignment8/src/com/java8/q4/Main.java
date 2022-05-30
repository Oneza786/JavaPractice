package com.java8.q4;

public class Main {
	public static void main(String[] args) {
		Animal[] a=new Animal[3];
		a[0]=new Dog();
		a[1]=new Cat();
		a[2]=new Tiger();
		
		a[0].eat();
		a[0].makeNoise();
		a[0].walk();
		
		a[1].eat();
		a[1].makeNoise();
		a[1].walk();
		
		a[2].eat();
		a[2].makeNoise();
		a[2].walk();
	}
}
