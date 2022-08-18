package com.number.program;

public class Program4 {
//Write a program to check if the given number is a
//Palindrome Number or not.The method should return the value and print it in main().

	static boolean isPalindrome(int num) {
int remainder,original,sum=0;
		
		original=num;
		
		while(num>0) {
		
		
	      remainder= num%10; 
	      
	      sum = (sum*10)+remainder;
	      
	    num= num/10; 
		}
		return original==sum;
		} 
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=121;
		if(isPalindrome(num)) {
			System.out.println(num +" is pallindrome");
		}
		else {
			System.out.println(num+" is not pallindrome");
		}
		
		
		
		
	}

}
