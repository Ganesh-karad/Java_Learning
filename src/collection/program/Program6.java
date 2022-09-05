package com.collection.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/*
 Write a Java Program which will store List of Lists.
i. The First List will have names of Fruits. (Strings)
ii. The Second List will have Phone Numbers. (Integers)
iii. The Third List will store alphabets. (Char)
Store all these list in a Single List and then Print the values of the Lists in below Manner - 
The List of Strings are - {values}
The List of Integers are - {values}
The List of Characters are - {values}

 */

public class Program6 {

	
	public static void printDatatype(ArrayList<ArrayList> list) {
		
		
		LinkedList listOfStrings = new LinkedList<String>();
		
		LinkedList listOfLong = new LinkedList<String>();
		
		LinkedList listOfCharacters = new LinkedList<String>();
		
		for (ArrayList al : list) 
		{
			
			//for traversing lists inside the superList
			Iterator innerItr = al.iterator();
			while (innerItr.hasNext()) 
			{
				Object temp = innerItr.next();
				if (temp instanceof String)//checking the data is of string type 
				{

					listOfStrings.add(temp);

				}
				if (temp instanceof Long) //checking the data is of Long type 
				{

					listOfLong.add(temp);

				}
				if (temp instanceof Character)//checking the data is of Character type 
				{

					listOfCharacters.add(temp);

				}

			}
		}
		System.out.println("The List of Strings are :" + listOfStrings);
		System.out.println("The List of Integers are :" + listOfLong);
		System.out.println("The List of Characters are :" + listOfCharacters);

	}
	
	 public static void main(String[] args) {
		
		ArrayList<ArrayList> mainList = new ArrayList<ArrayList>();
		
		
		ArrayList<String> fruitlist = new ArrayList<String>();
		fruitlist.add("apple");
		fruitlist.add("Mango");
		fruitlist.add("Papaya");
		fruitlist.add("Guava");
	
		
		ArrayList<Long> phonenolist = new ArrayList<Long>();
		phonenolist.add((long) 9309159468L);
		phonenolist.add((long) 7066109142L);
		phonenolist.add((long) 9595536019L);
		phonenolist.add((long) 9860865641L);
		
		ArrayList<Character> character = new ArrayList<Character>();
		character.add('A');
		character.add('B');
		character.add('C');
		character.add('D');
		
		
		mainList.add(fruitlist);
		mainList.add(phonenolist);
		mainList.add(character);
		
		printDatatype(mainList);
	
	}

	
}

