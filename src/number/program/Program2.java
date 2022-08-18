package com.number.program;


public class Program2 {
	//Write a program to Print if the given Number is a 
	//Prime Number or Not.The method should return the value 
	//and print it in main().
	public static boolean isPrime(int num) {
	int count=0;	
		
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			}
		return count==2;
			
		}
	
	
	 
	
	
	
	
	
	
	public static void main(String[] args) {


		int num=4;
		
		
		if(isPrime(num)) {
			
			System.out.println(num+"  is prime number");}
		else {
			System.out.println(num+ " is not prime number");
		
		}
		
		
		
		
		
		
		
	}

}
