package JavaAssesment2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class program3 {
/*
 Write a Java Program -
a. To accept product names from the user. Users can enter as many products the user
wants, until the user types in “Done” and store it in an appropriate Data structure.
b. Sort the products in descending order.
c. Now Create a Map to store the Products based on their initial Alphabets.
d. create a method getProductsBasedOnAlphabet() which will return the list of products
based on the alphabet typed in by the user.
Example →
>> Please Enter an alphabet to see the product list.
C
Product List:
1. Charger
2. Colgate
3. Coffee Powder
4. Coffee Jar
5. Cup
e. Create a Custom Exception called NoProductFound. This exception should be thrown
when the user enters an alphabet to get the list of products, but there are no products for
that alphabet. The message in the Exception should be “ There are no products starting
with {alphabet}”.
 */
	public static LinkedList<String> getinput() {
		LinkedList<String>arr=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre Your String");
		while(true) {
			String input=sc.next();
			if(input.equals("Done")){
			 System.out.println("You Entered Done");
			 break;
			}
			else {
				arr.add(input);
			}
		}
		return arr;
	}
	public static  HashMap<Character,LinkedList<String>> printkeyandValue(LinkedList<String>arr){
		
		HashMap<Character,LinkedList<String>>map= new HashMap<Character,LinkedList<String>>();
		Iterator<String>it=arr.iterator();
		
		String name=it.next();
		char key=name.charAt(0);
		if(map.containsKey(key)) {
			LinkedList<String>exlist=map.get(key);
			exlist.add(name);
		}
		else {
			LinkedList<String>list=new LinkedList<>();
		    list.add(name);
		    map.put(key, list);
		
		}
		for(Map.Entry<Character, LinkedList<String>>entry:map.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}return map;
		
	}
	public static void main(String[] args) {
		
		 LinkedList<String> list = getinput();
		System.out.println("original list"+list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Sort the products in descending order."+list);
		 
		HashMap<Character,LinkedList<String>> storemap= new HashMap<Character,LinkedList<String>>();
           storemap=printkeyandValue(list);
	  
		  
	
	}

}
