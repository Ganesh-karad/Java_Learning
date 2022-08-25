package com.string.program;

public class Program1 {
//Write a program to reverse the string without using in-built methods (library methods).

	public static String reverseString(String str) {
		
		String b="";// create empty string storing reverse string
		
		int len=str.length();//find length
			
			for(int i=len-1;i>=0;i--) {
				b=b+str.charAt(i);
			}
			return b;
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="sandesh karad";
		 
	
		System.out.println("Reverse String= "+reverseString(a));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
