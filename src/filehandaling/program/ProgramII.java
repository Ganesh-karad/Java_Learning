package com.filehandaling.program;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 “This file is created using java program.”
Write a Java Program to take input from the user.
Take the below Inputs -
First Name, Last Name and PhoneNumber
Create a .txt file. the Name of the file should be {firstName}_{lastName)_{phoneNumber}.txt
    Hello {firstName},
	Welcome to Java Programming.
	Your Number {PhoneNumber} has been registered for updates.
	Thanks,
	Team Java.

 */

public class ProgramII {
	
	public static void readContentfile(String location, String data) {
		
		  try{
	            File file = new File(location); 
	            PrintWriter writer = new PrintWriter(file);
	            writer.write(data);
	            writer.close();
	        } catch(IOException e){
	          System.out.println(e);

	        }	
		
	}
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.println("First Name:");
	        String name = sc.next();
	        System.out.println("Last Name:");
	        String lastname =  sc.next();
	        System.out.println("Phone Number:");
	        long phonenum = sc.nextLong();
	       
	    	String filelocation=String.format("D:\\%s_%s_%d.txt", name,lastname,phonenum);
			System.out.println(filelocation);
			
			
			String details=String.format("Hello %s,\nWelcome to Java Programming.\nYour Number %d has been registered for updates.\nThanks,\nTeam Java.",name,phonenum);
			System.out.println(details);
			
			readContentfile(filelocation,details);

       }
	        
		
		
		
		
			
		
		
	}


