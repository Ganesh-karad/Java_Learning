package com.collection.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class program7 {

	public static LinkedList<String>getinput(){
		
		LinkedList<String> arr= new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your string: ");
		while(true) 
		{
			String input = scanner.next();
			if(input.equals("Done")) 
			{
				System.out.println("you entered 'Done' ");
				break;
				
			}
			else
			{
			arr.add(input);
			}
		}
		return(arr);
		
		}
public static HashMap <Character,LinkedList<String>> printkeyAndValue(LinkedList<String> arr) {

	
	HashMap <Character,LinkedList<String>> map= new HashMap <Character,LinkedList<String>> ();
	
    Iterator<String> it=arr.iterator();
    while(it.hasNext()) {
    	String name=it.next();
    	char key=name.charAt(0);
    	if(map.containsKey(key)) {
    		LinkedList<String> exlist=map.get(key);
    		exlist.add(name);
    	}
    	else {
    		LinkedList<String>list= new LinkedList<>();
    		list.add(name);
    		map.put(key, list);
    	}
    }
    for(Map.Entry<Character,LinkedList<String>> entry:map.entrySet()) {
    	System.out.println(entry.getKey()+" : "+entry.getValue());
    }
	return map;
}

public static String findMaxhashMapValues(HashMap<Character, LinkedList<String>> storedMap) 
	{
		
	
	HashMap<Character, LinkedList<String>> storedMatchingChar = new HashMap<Character, LinkedList<String>>();
		
		storedMatchingChar=storedMap;

		LinkedList<String> maxlen = new LinkedList<String>();

		HashMap<Character, Integer> maxfinder = new HashMap<>();

		for (Entry<Character, LinkedList<String>> me : storedMatchingChar.entrySet()) 
		{
			LinkedList<String> temp = me.getValue();
			char tempch = me.getKey();
			maxlen.addAll(temp);
			int length = temp.size();
			maxfinder.put(tempch, length);

		}
		int keyForMaxValue = Collections.max(maxfinder.values());

		for (Entry<Character, Integer> mapp : maxfinder.entrySet()) 
		{
			if (mapp.getValue().equals(keyForMaxValue)) 
			{
				String print = String.format("the Character with maximum product is '%c' it has %d products",
						mapp.getKey(), keyForMaxValue);
			
				System.out.println(print);
			}
		}
		return null;
		

	}

	public static void main(String[] args) {
		
		LinkedList<String> stsoreCallip=new LinkedList<String>();
		stsoreCallip= getinput();
		
		
		HashMap<Character, LinkedList<String>> storeMap = new HashMap<Character, LinkedList<String>>();
		storeMap=printkeyAndValue(stsoreCallip) ;
		
		findMaxhashMapValues(storeMap) ;
		
	}}