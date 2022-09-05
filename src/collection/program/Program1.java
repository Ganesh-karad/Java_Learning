package com.collection.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
/*
 Write a Java Program to create a List which will store 4 wheeler manufacturing brand names.
i. Print only the Brand Names Starting with “M”
ii. Sort the List in Ascending Order.
iii. Display the No. of times each Brand is present in the list.

 */
public class Program1 {
		
	public static void getBrandnames(ArrayList<String> al) {
		

		for(int i=0;i<=al.size()-1;i++) {
			
			if(al.get(i).startsWith("M")) {
				System.out.println(al.get(i));
			}
		}
	
		Collections.sort(al);
		
		System.out.println("Assending order"+al);
	
	
System.out.println("Display the No.of times each Brand is present in the list");
	
TreeMap<String,Integer>valuesToStore=new TreeMap<>();
for(String tmp : al)
{
    if(valuesToStore.containsKey(tmp)) {
        int counter =  valuesToStore.get(tmp);
        counter = counter + 1;
        valuesToStore.put(tmp,counter);
    }
    else {
        valuesToStore.put(tmp,1);
    }
}
for (Entry<String, Integer> entry: valuesToStore.entrySet()){
    System.out.println(entry.getKey()+" : "+entry.getValue());
}

	}

	public static void main(String[] args) {
		

		
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("Ashok Leyland");
		list.add("Eicher Motors");
		list.add("Mahindra & Mahindra");
		list.add("Bajaj Auto");
		list.add("Tata Motors");
		list.add("Ashok Leyland");
		list.add("Mahindra & Mahindra");
		list.add("Maruti");
		
		getBrandnames(list);
		
	}

}
