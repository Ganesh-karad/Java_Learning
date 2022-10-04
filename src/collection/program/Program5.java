package com.collection.program;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Program5 {
/*
 Write a Java Program which will contain Character as the Key and List of Product Names as values.
Example : 
‘A’ → Apple, Airpods, Antenna , Aeroplane
‘B’ → Bat, Banana, Bi-cycle, Boat, Bear, Beer.
‘C’ → Cycle, Car, Cat, Cake, Cap

 */
	
  public static LinkedList<String>callkeyAndvalue( HashMap<Character,LinkedList<String>> map,char ch ) 
  {
	 for(Map.Entry<Character, LinkedList<String>> data:map.entrySet()) {
		 if(data.getKey().equals(ch)) {
			 return(data.getValue());
		 }
	 }
	return null;
  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 HashMap<Character,LinkedList<String>> map= new HashMap<Character,LinkedList<String>>();
		
		 LinkedList<String>link1=new LinkedList<String>();
		 link1.add("Apple, Airpods, Antenna , Aeroplane");
		 LinkedList<String>link2=new LinkedList<String>();
		 link2.add("Bat, Banana, Bi-cycle, Boat, Bear, Beer");
		 LinkedList<String>link3=new LinkedList<String>();
		 link3.add("Cycle, Car, Cat, Cake, Cap");
		 
		 map.put('A', link1);
		 map.put('B', link2);
		 map.put('C', link3);
		 
		 
		 Scanner sc= new Scanner(System.in);
		 
		System.out.println("Enter Charcter in Capital letter");
		
		char c=sc.next().charAt(0);
		 LinkedList<String>l=new LinkedList<String>();
		
		 l=callkeyAndvalue(map, c);
		System.out.println(l);
		 
		
		
	}

}
