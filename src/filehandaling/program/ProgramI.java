package com.filehandaling.program;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/*
Write a program to create a text file and 
write the below text in the file.
“This file is created using java program.”
 */

public class ProgramI {
	
	public static void createWrite(String location,String print) 
	{
		try
		{
			FileWriter fw = new FileWriter(location);
			fw.write(print);
			fw.close();
			
		}
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		System.out.println(print);
	}
	
	

	public static void main(String[] args) {
		
		String path="E:\\gk007.txt";
		String str="This file is created using java program";
		createWrite(path,str);
	}

}
