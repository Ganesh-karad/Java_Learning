package com.number.program;

import java.util.ArrayList;
public class Program9 {
	
//Write a program to Print the Second Even Armstrong Number in 
//the range of 100-10000.The method should return the value and print it in main()	
	
	static int second;
    
	 static int secondAmstrongnum(int starting,int ending) {
	 
	 ArrayList arr1=new ArrayList();
	 int count=0;
	 //static int second;
	
	for(int j=starting;j<=ending ;j++)
	{
		int no=j;
		int t1=no;
		int length=0;
		
		while(t1>0)
		{
			length=length+1;
			t1=t1/10; 
		}
		
		int t2=no;
		int rem=0;
		int arm=0;
		while(t2>0)
		{
			int mul=1;
			rem=t2%10;
			for(int i=1;i<=length;i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==no)
		{
			System.out.println(no+" is amstrong");
			arr1.add(no);
			if(no%2==0) {
			 count++;
			if(count==2)
			{
				second=no;
			}}
		}
		
	}
	return second;	
	 
	 
	 
 }
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a=100;
	int b=10000;
		
		System.out.println("second even amstrong number "+secondAmstrongnum(a,b));
		
		
		
	}

}
