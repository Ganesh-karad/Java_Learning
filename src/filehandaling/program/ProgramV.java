package com.filehandaling.program;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
/*
 Write a program which will accept a file location from the user and read and display the content of the file.
If the file is not present in the machine then Handle the exception and display the message - 
“File is not found at the given location {location). Please verify the file location.”

 */
public class ProgramV {

	public static void filreadAndcheck(String filepath) 
	{
		File file=new File(filepath);
		try {
		if(file.exists()) {
			FileReader fread=new FileReader(filepath);
			int i;
			while((i=fread.read())!=-1) {
			System.out.print((char)i);
			}
			
		}
		else {
			String print=String.format("your File is not found current location { %s }.verify the file location.",filepath);
			throw new Exception(print);
		}
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
		
	}
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name:");
		String location=sc.nextLine();
		
		 filreadAndcheck(location);
	}

}
