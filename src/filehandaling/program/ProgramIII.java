package com.filehandaling.program;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ProgramIII {
/*
 Write a Java Program to read the content of a file and use it in the program as mentioned below - 
There will be a file in which there will be names of fruits and you need to read these fruit names and store it in an array. If the fruit name is duplicate, then don’t add it in the array.
Once adding the elements in the array is done, print the array elements.
For example the file will have below content - 
Apple,Mango,Banana,Papaya,Water Mellon,Jack Fruit, Berries, Orange, Apple, Papaya, Cucumber, Mush Mellon
 */

	public static void removeDuplicatefilecontent(String loc)  {
		try{
			FileReader file = new FileReader(loc);
		
		
		

		int i;char c;
			String str = "";//create empty string storing charcter i
		while ((i = file.read()) != -1) 
		{
			System.out.print((char) i);
			c = (char) i;
			str = str + String.valueOf(c); //convert in string

		}
		System.out.println();
		str = str.replaceAll(" ", "");// remove spaces
		String arr[] = str.split(","); //convert in array
	
		
		Arrays.sort(arr);// sorting element
		int l = arr.length;
		
		System.out.println("remove duplicate content present in file:");
		for (int k = 0; k < l - 1; k++) {
			for (int m = k + 1; m < l; m++) {
				if (arr[k].equalsIgnoreCase(arr[m])) {
					arr[m] = arr[l - 1];
					l--;
					
				}
			}
		}

		for (int q = 0; q < l; q++) {
			System.out.println(arr[q] );

		}
		}
		catch(Exception e) {
        System.out.println(e);			
		}
	
	}

	public static void main(String[] args) throws IOException {
		
		String path = "E:\\fruit.txt";
		removeDuplicatefilecontent(path);

	}

}