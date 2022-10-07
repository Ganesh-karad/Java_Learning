package Assementjava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Program3 {
/*
 3. Write a Java Program - 15 Marks
a. Accept a Paragraph from the user. (2 marks)
b. Create a file programmatically and store the content which the user has entered. (5
Marks)
c. Convert the paragraph to UpperCase. (1 marks)
d. Print the total number of words are present in the Paragraph. (3 Marks)
d. Remove the duplicate words from the paragraph (You can convert the array into any
suitable Collection if needed.) (2 marks)
e. Print each unique word of the paragraph in a new line in the console.(2 Marks)
 */
	
	/**
	 * 
	 *
	 * @This method write content which user has enterd
	 */
	public static void filewrite(String path,String str) {
		try {
			FileWriter f= new FileWriter(path);
			f.write(str);
			f.close();
		} catch (IOException e) {
			
		System.out.println(e);
		}
		
	}
	/**
	 * 
	 * @param location
	 * @ This method Read content which user has enterd and  Print the total number of words are present in the Paragraph
	 * @throws IOException
	 */
	public static String [] reader(String location) throws IOException {
		String s="";
	
			FileReader r= new FileReader(location);
			int charcount=0;
	
			int i;
			while((i=r.read())!=-1) {
				
				System.out.print((char)i);
				
				char c=(char) i;
			s= s+String.valueOf(c);
				
			}
			System.out.println();
			String arr[]=s.split(" ");
			int world=arr.length;
			System.out.print("Total worlds in parograph :" +world);
			System.out.println();
			return arr;
	}
	/**
	 * 
	 * @This method Remove the duplicate words from the paragraph
	 */
	public static void removeDuplicate(String[]arr) {
		
		String a[]=arr;
		
		LinkedHashSet<String>hs= new LinkedHashSet<String>();
		for(String i:arr) {
			hs.add(i);
		}
		System.out.println("After removieng:");
		for(String i:hs) {
			System.out.println(i);
		}

	System.out.println("After removing dublicate element Total World:");
	System.out.println(hs.size());
	
	}
	
	public static void main(String[] args) {
	
		String filloc="D:\\ganeshkarad.txt";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a paragraph:");
		String print=sc.nextLine();
		
		String s=print.toUpperCase();
		
		filewrite(filloc, s);
		try {
			String arr[]=reader(filloc);
			removeDuplicate(arr);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
