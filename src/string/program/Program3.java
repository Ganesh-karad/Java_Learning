package com.string.program;

public class Program3 {
	
/*
Write a program which will accept Name as parameter and will print the name as below :
Eg : Name - TECHNOGISE
Output : 
T
TEC
TECNO
TECNOGI
TECHNOGISE
*/
	public static void pattern(String s) {
	
		for(int i=1;i<s.length();i=i+2) {
				
				
				for(int j=i;j<=i;j++) {
				
					
				 if(i==9) {
					System.out.println(s.substring(0,j+1)); 
				        }
				 else {
					 System.out.println(s.substring(0,j));
				 }
					}
				
			}
			
		}
	public static void main(String[] args) {
	
		
		String s="TECHNOGISE";
		 
		pattern(s);

		
	}

}
