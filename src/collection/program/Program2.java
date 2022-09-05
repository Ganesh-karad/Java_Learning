package com.collection.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Program2 {
/*
 
Write a Java Program to create a List, which will store Student names. Insert at least 10 names.
i. Print the student name which is present at the 3rd index.
ii. Insert a new student name at the 7th index.
iii. Remove the student name at the 4th index.
iv. Sort the List in Descending order and print the final list.

 */
	
	public static void studentName(LinkedList<String> al) {
		
	
//Print the student name which is present at the 3rd index.
		
	    System.out.println("print student name 3rd index :"+al.get(3));
		
//Insert a new student name at the 7th index.
		
		
		al.add(7, "rocky");
		System.out.println("after Insert new index :"+al);
    
// Remove the student name at the 4th index.   
		
	     al.remove(4);
         System.out.println("after remove 4th index :"+al);
	
//Sort the List in Descending order and print the final list.
    
          
          Collections.sort(al,Collections.reverseOrder());
	      System.out.println("print list Descending order :"+al);
	       
	}
	

	public static void main(String[] args) {
		

		LinkedList<String> studentname=new LinkedList<String>();	
	studentname.add("ganesh");
	studentname.add("ram");
	studentname.add("nabeel");
	studentname.add("amit");
	studentname.add("akshay");
	studentname.add("ajinkya");
	studentname.add("sandesh");
	studentname.add("manish");
	studentname.add("ajit");
	studentname.add("anita");
	
	
	studentName(studentname);
	
	}
}











	