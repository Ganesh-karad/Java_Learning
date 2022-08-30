package com.string.program;

public class Program5 {
//Write a program to verify if the given string is palindrome.

	public static boolean isPalindrome(String str) {
        
		
		String b="";
		
		int len=str.length();
			
			for(int i=len-1;i>=0;i--) {
				b=b+str.charAt(i);
			     }
			
			 if(b.equals(str)) {
		    	 return true;
		    	 
		      }
			 else {
				 return false;
			 }
		
		
	}
	
	public static void main(String[] args) {
	

		String str="Nitin";
		str= str.toLowerCase();
		System.out.println("given string is palindrome "+isPalindrome(str));
		
		
		
		
		
	}

}
