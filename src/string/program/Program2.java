package com.string.program;

public class Program2 {
//Write a program to count the number of words in a paragraph.

	public static Integer countnumberofWorlds(String name) {
		
		int count=1;
		for(int i=0;i<name.length();i++) {
			
			if(name.charAt(i)==' ' && name.charAt(i+1)!=' ') {
				
				count++;
				
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
	

		String str="Ganesh Tushar karad" ;
		int count=countnumberofWorlds(str);
		System.out.println("number of words="+count);
		
	}

}
