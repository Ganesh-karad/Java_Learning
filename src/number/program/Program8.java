package com.number.program;

public class Program8 {
//Write a program to Print the Armstrong Numbers from 50-1000.

	  static void isArmstrong(int a,int b) {
	
		  for(int i=a;i<=b;i++) {
				int num=i;
				int sum=0;
				int re;
				while(num>0) {
					re=num%10;
					sum=sum+(re*re*re);
					num=num/10;	
				}
				
				if(sum==i) {
					System.out.println("amstrong number "+sum);
				}}
			}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		int a=50;
		int b=1000;
		isArmstrong(a,b);
		
		
		
	}

}
