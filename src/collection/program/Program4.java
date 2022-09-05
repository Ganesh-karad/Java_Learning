package com.collection.program;

import java.util.Map;
import java.util.TreeMap;

public class Program4 {

	/*
	 Write a Java Program to store values in Key Value Pair. The Collection should store Employee Id and Name.
i. The Employe Id should be alphanumeric , eg - TECH001
i. No Null Key should be allowed.
ii. The data should be stored in ascending order.
iii. Print the Data in the Below format - 
	Hello {Name} ({Emp_Id}),
		Welcome to Technogise.
	Regards,
	Team Technogise.
For example , Name is Martin, Employee Id is TECH2011, Then the data should be printed in below format.
Hello Martin (TECH2011),
		Welcome to Technogise.
	Regards,
	Team Technogise.

	 */
	
	public static void prientEmploydetail(TreeMap<String, String> entry) {
		
		
		for (Map.Entry<String, String> ma : entry.entrySet())

		{
			String id = ma.getKey();
			String name = ma.getValue();
			String print = String.format("Hello %s (%s),\nWelcome to Technogise.\nRegards,\nTeam Technogise.", name,id);
			System.out.println();
			System.out.println(print);

		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeMap<String, String> tre = new TreeMap<String, String>();
		tre.put("TECH001", "ganesh");
		tre.put("TECH002", "amit");
		tre.put("TECH003", "nabeel");
		tre.put("TECH004", "sumit");
		
		prientEmploydetail(tre);
		
		
	}

}
