package com.number.program;
//Write a program to print if 
//the given number is an Armstrong 
//number or not.The method should return 
//the value and print it in main().
public class Program7 {
  static boolean isArmstrong(int num) {
		int re,k;
		k=num;
		int sum=0;
		
		while(num>0)
		{
			re=num%10;
			sum=(re*re*re)+sum;
		   num=num/10;
			
		}
		return k==sum;
  }
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {


		int num=153;
		
		if(isArmstrong(num)) {
			System.out.println(num +" is Armstrong number");
		}
		else {
			System.out.println(num+"is not Armstrong number");
		}
		
		
		
		
	}

}
