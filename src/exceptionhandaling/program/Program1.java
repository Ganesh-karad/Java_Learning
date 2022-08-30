package com.exceptionhandaling.program;

import java.util.Scanner;

public class Program1 {
/*

Write a program which will catch an exception , 
print some message and then rethrow the exception.
Ex - 
Your program is performing Division of a Number,
Accept 2 numbers from the user. 
if the second number is 0 then a Divide By Zero Exception occured, 
then catch the exception , 
Print the message “ Please enter valid number to divide.” 
and then throw the exception.
 
 */
	static void divisionProgram(int a,int b) {
		
	
		try {
			int division=a/b;
			System.out.println("divison of two number="+division);
		}
		catch(ArithmeticException e) 
		{
			System.out.println(" Please enter valid number to divide");
			System.out.println((e));
		}
	
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number first number");
		int a = sc.nextInt();

		System.out.println("Enter number first number");
		
		int b=sc.nextInt();
		
		divisionProgram(a,b);
		
		
	}

}
