package com.number.program;
//Write a program to print the factorial 
//of numbers in the range 
//of  10-30 (both inclusive).		

public class Program6 {
	static void factorialInteger(int start, int end) {
		  for (int i = start; i <= end; i++)
	        {
	            double k = 1;
	            for (int j = 1; j <= i; j++) {
	                k = k * j;
	            }
	 
	          System.out.println("The factorial of "+ i+ " is "+ k);
	        }
	    }
		
		
        
 
  
  
  
  
  
  
  
  
  
  
  public static void main(String[] args) {

    
	int b=30;
	int a=10;
	 
	factorialInteger(a,b);
	
	   
	    
	    

}}
