package com.number.program;

public class Program3 {
//Write a program to Print the Prime Numbers from 1-100.

	public static boolean isPrime(int a) {
		int count=0;	
			
			
			for(int i=1;i<=a;i++) {
				if(a%i==0) {
					count++;
				}
				}
			
			return count==2;

			}
	
	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=100;
		System.out.println("Prime number 1 to 100");
		for(int i=1;i<=num;i++) {
		
		if(isPrime(i)) {
			
			System.out.println(i);}
		
		
		}
		
}

}
