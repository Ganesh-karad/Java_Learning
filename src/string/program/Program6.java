package com.string.program;

public class Program6 {

	
//Write a program to Convert a string to Array without using any inbuilt methods.
	
	
	public static void strconvertarray(char[] str,String s) {
		
		System.out.println("String to array");
		int n=str.length;
		for(int i=0;i<=n-1;i++) {
			str[i]=s.charAt(i);
			System.out.println(str[i]);
		}
	}
	

	public static void main(String[] args) {
	
		
		
		String s= "Ganesh";
		
		
		char str[]=new char[s.length()];
		
		strconvertarray(str, s);
		
		
		
		
		
	}

}
