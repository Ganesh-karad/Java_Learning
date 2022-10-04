package com.java.assement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class program1 {
/*
 1. Write a Java Program - 30 Marks
a. To read the given Sample file. (3 marks)
b. Extract its data into an appropriate Collection. (7 marks)
c. There should be only unique values stored. (3 marks)
d. If the Value in the given file is empty then throw a custom exception
“InvalidValueException”. (7 marks)
e. Handle the Exception and Replace the empty value with “DEFAULT_VALUE”. (6
marks)
f. Print all the Key and its value in the below format. (4 marks)
Key Value
Names Antony, James, Steve , Nick , Racheal, Andrew
Fruits Apple, Mango, Banana, Pineapple, Orange
Countries DEFAULT_VALUE
Animals Cat, Dog, Elephant, Monkey, Lion, Tiger, Zebra
Places Pune, Mumbai, Delhi
Plants DEFAULT_VALUE
Transports Car, Train, Plane, Ship, Boat, Cycle, Tram, Truck, Bik
 */
	public static void fileReade() throws FileNotFoundException {
		
		FileReader r= new FileReader("C:\\Users\\Admin\\Downloads\\sampleFile.txt");
	Scanner sc= new Scanner(r);
	try {
		

		while(sc.hasNextLine()) {
		System.out.println(sc.nextLine());
		
		}}
		catch(Exception e){
			System.out.println(e);
			}
		
	LinkedList<String>li= new LinkedList<String>();
	
	
	
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		//File path= new File("C:\\Users\\Admin\\Downloads\\sampleFile.txt");
		try {
			fileReade() ;
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
		}
	}

}
