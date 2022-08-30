package com.string.program;

public class Program9 {
/*
 Write a program to remove all the duplicates from a give string.
Eg - Given String - SACHINTENDULKAR
OUTPUT - SCHITEDULKR

 
 */
	public static void removeduplicatechar(String str) {
		

	    for (int i=0;i<str.length();i++)
	    {
	        int k=0;
	        for (int j=0;j<str.length();j++)
	        {
	            // remove duplicate chracter in strin
	            if (str.charAt(i)==str.charAt(j) && i!= j)//char same but not in same position
	            {                                                                    
	            	
	                k=1;
	             
	            }
	        }
	        if (k==0)
	            System.out.print(str.charAt(i));
	    }

	}
	
	
	
	public static void main(String[] args) {
		

		
		String str = "SACHINTENDULKAR";
		 removeduplicatechar(str);
		 
		
		
		
	}

}
