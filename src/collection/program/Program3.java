package com.collection.program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Program3 {
/*
 Write a Java Program to store PANCARD Numbers of Employees. 
i. Choose the right Collection to be used (ArrayList, LinkedList, Set)
ii. Make sure the Data is stored in the order they are inserted.
ii. Print the data.

 */
	
public static void getpancardNumber(LinkedHashSet<String> data) {
	
	
	Iterator it=data.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		
		set.add("DAK8556A");
		set.add("ABC5489B");
		set.add("KLM7562C");
		set.add("MKC1232D");
		set.add("ERW7564E");
		set.add("AQL4569F");
		set.add("POR6612G");
		
		
		getpancardNumber(set);
		
		
		
		
		
		
	}

}
