package com.number.program;

public class Program1 {
//Write a program to print  first 20 Fibonacci Series

	public static int fibonacciseries(int n) {
		int firsttream=0,  secondtream=1,     constant=1;	
		for(int i=1;i<=n;i++) {
			constant=firsttream+secondtream;
		
			firsttream=secondtream;
			secondtream=constant;
			
		}
		return constant;
		
	}
	
	
	 
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=20;
		 
		 for(int i=1;i<=num;i++) {
	System.out.println( fibonacciseries(i));	
		 }
		
		
		
	}

}
