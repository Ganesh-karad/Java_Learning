package JavaAssesment2;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

/*
 * 2. Write a Java Program to Create a FoodMenu Class.
a. Take input form the user about the number of Food Items to be inserted
and Accept the Food Item Details from the user - DishName, MenuType, Price and store
it in appropriate Object / Data structure.
b. The ItemCode should be auto incremented for every record.
c.Take an input from the user asking the MenuType for which the user wants to see the
Food Items and Print all the Food Items of the Menu Type entered by the User in below
Format -
ItemCode DishName MenuType Price
—------------------------------------------------------------------------------------------------------------
001 Mutter Paneer Veg 250
005 Veg Kolhapuri Veg 350
d. If the user enters the MenuType as All, then All the available dishes should be
displayed.
Example -
>>Please enter the Menu Type you want to see.
 */
public class Program2 {

	public static TreeMap<Integer, LinkedList<Object>> StoreUserInput() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("How Many Food Items to be inserted");
		 
		 int items=sc.nextInt();
		TreeMap<Integer,LinkedList<Object>> map=new TreeMap<Integer,LinkedList<Object>>();
		
		for(int i=1;i<=items;i++) {
			 LinkedList<Object>list=new  LinkedList<Object>();
			
			 System.out.println("Enter Item Name :"+i);
			list.add(i);
			String dishname=sc.next();
		    list.add(dishname);
			
			System.out.println("Enter Menu Type :");
			
			String menu=sc.next();
			list.add(menu);
			
			System.out.println("Entre Price :");
			
			int price=sc.nextInt();
			list.add(price);
			
			map.put(i, list);
			
		 }return map;
		 
	 
	
}
	
	 public static void Displaymethod(TreeMap<Integer,LinkedList<Object>> map) {
		 
		 
		 System.out.println("ItemCode    DishName     MenuType       Price");
		 System.out.println("--------------------------------------------------");                  
		 
		 for(Map.Entry<Integer, LinkedList<Object>> map2:map.entrySet()) {
			 java.util.Iterator<Object> it=map2.getValue().iterator();
			 
			 while(it.hasNext()) {
				 System.out.print(it.next()+"\t \t");
			 }
			 System.out.println();
		 }
		 
		 
	 }
	
 public static void userMenu(TreeMap<Integer,LinkedList<Object>> map) {
		 Scanner input=new Scanner(System.in);
		 System.out.println("Please enter the Menu Type you want to see.");
		 
		 String menuname=input.next();
		 System.out.println("ItemCode    DishName     MenuType       Price");
		 System.out.println("--------------------------------------------------");                  
		// String menuname1="all";
		 // menuname1=input.next();
		 for(Map.Entry<Integer, LinkedList<Object>> menu:map.entrySet()) {
			 if(menu.getValue().contains(menuname)) {
				 java.util.Iterator<Object> it=menu.getValue().iterator();{
					 while(it.hasNext()) {
						 System.out.print(it.next()+"\t \t");
					 }
					 System.out.println();
				 }
			 }
		 
			 LinkedList<Object>li=new LinkedList<Object>();
			 
			 
			 for(Map.Entry<Integer, LinkedList<Object>> menu1:map.entrySet()) {
				 Object[]list=menu1.getValue().toArray();
				 li.add(list[2]);
			 }
			 
			 if(!li.contains(menuname)) {
				 System.out.println("OOPs No Food Items available for the selected Menu Type.");
			 }
			 
		 }
		
	
		 }
	public static void main(String[] args) {
		
		TreeMap<Integer, LinkedList<Object>> store = StoreUserInput();
	     
		for(Map.Entry<Integer, LinkedList<Object>> entry:store.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	            
		Displaymethod(store);
		userMenu(store);
	
	
	}

}
