package com.filehandaling.program;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
/*
 Write a program which will create a java file if not present, and then append the content to the file.
Example  if a file already has some content in it, then the program should not override the content rather it should append the new text after the previous content.

 */
public class ProgramIV {

	public static void appendMethod(String location) 
	{
		File file=new File(location);
		try {
		
		if(file.exists()) 
		{
		FileWriter f1=new FileWriter(location,true);
		PrintWriter p1=new PrintWriter(f1);
		p1.print("file is already exist");
		p1.close();
		f1.close();
		System.out.println("file is already exist");
		
		}
		else 
		{
			FileWriter f1=new FileWriter(location,true);
			f1.write("first time writing");
			PrintWriter p1=new PrintWriter(f1);
			p1.print("appended from");
			p1.close();
			f1.close();
			System.out.println("fil is not exist first time write ");
		}
		
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	
	
	}
	
	public static void main(String[] args) {
		
		String location="D:\\gk23.txt";
		appendMethod(location);
	}

}
