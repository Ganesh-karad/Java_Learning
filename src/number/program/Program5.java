package com.number.program;
//Write a program to print the factorial of 
//a given number. The method should return the value and print it
public class Program5 {

	static int factorialInteger(int n) {
		int fact=1;
		for (int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		int num=5;
		System.out.println("factorial of "+num+" is "+factorialInteger(num));

		
	
		
		
	
	
	
	
	
	}

}
