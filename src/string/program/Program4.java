package com.string.program;
/*
 Write a program which will accept a character as a parameter and then print the count of the number of times the character is present in the string.
Eg: String = JAVA
Character = A
Output = “A is present 2 times”.

*/
public class Program4 {

	public static int countequalCharacter(String str) {
		
	int totalcount=str.length();//total length string
	
	String str2=str.replace("a", ""); //a replace
	
	int totalcountafterremove=str2.length();// after removing a count length
	
	int count=totalcount-totalcountafterremove;
		return count;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		

		String name= "Ganesh Tushar Karad";
		String string=String.format("character 'a' is present %d times",countequalCharacter(name));
		System.out.println(string);
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
