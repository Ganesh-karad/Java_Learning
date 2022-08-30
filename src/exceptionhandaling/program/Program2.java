package com.exceptionhandaling.program;

import java.util.Scanner;

public class Program2 {

	/*
Write a program which will print “Program initiated..”, 
then accept a PhoneNumber from the user. 
If the Number entered is not equal to 10 digit, 
then throw an Exception with a message “Number should be 
10 digit”, Catch the Exception and print the message in 
the exception, and then the program should print “Program
 terminated.”
If the Number is equal to 
10 digit, then display the entered number and 
then print “Program Terminated.”
	
*/
	public static void isvalidMobilenum(String str) {
		try {	
			if(str.length()==10) {
				
				System.out.println(str);
			}
			
			else {
				throw new Exception("Number should be 10 digit");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			finally {
			System.out.println("Program Terminated.");
		}
			
	}
	
	
	
public static void main(String[] args) {
		
	int mobilenum = 0;
	System.out.println("Program initiated");
	System.out.println("Enter mobile number");
	
	Scanner sc= new Scanner(System.in);	
	String number=Integer.toString(mobilenum);
		number= sc.nextLine();
		
		isvalidMobilenum(number);
		
	

			
		}
	}


