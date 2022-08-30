package com.string.program;

import java.util.Arrays;
/*
 Write a program to check if the 2 Strings are anagram of each other.
Eg: Str1 = ARMY , Str2 = MARY
OUTPUT : String are Anagram.
*/

public class Program10 {
	  static void isAnagram(char[] str1,char[] str2) {
		Arrays.sort(str1);// sort char array
		Arrays.sort(str2);
		
		
		boolean result=Arrays.equals(str1, str2);
		
		if (result== true) {
			System.out.println("strings are Anagram");
		}
		else{
			System.out.println("strings are not Anagram");
		}
			
			
	}
	public static void main(String[] args) {
		

		
		String	s1 = "ARMY"; 
		String  s2 = "mARY";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char str1[]=s1.toCharArray();
		char str2[]=s2.toCharArray();
		
		isAnagram(str2, str2);
		
		
		
		
		
			
		
	
	
	
	
	
	
	
	}
		
		
		
		
		
		
		
		
		
		
		
	}


