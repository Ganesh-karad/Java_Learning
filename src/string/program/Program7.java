package com.string.program;

public class Program7 {
/*
 Write a program which will take a string , start index and end index as parameters and will print the substring of the given string with both index inclusive. (Do not use inbuilt methods)
Ex : public void printSubstring(String str, int startIndex, int endIndex)
	{
	…
	}
printSubstring(“This is Java Program”,5,11)
Output = “is Java”

 
 
 */
	public static void printstartendIndex(String str,int startFrom,int endBefore){
		
		String newStr = "";// creating empty string store the chracter
		
		 for (int i = startFrom; i <= endBefore; i++) {
	         newStr = String.valueOf(str.charAt(i));
	     System.out.print(newStr);
	 }
	}
		
	
	public static void main(String[] args) {
		
		 String str = "This is Java Program";
	      
	       
		 int startFrom = 5, endBefore = 11;
	        printstartendIndex(str, startFrom, endBefore);  
	        
	    			
	
		
		
	}

}
