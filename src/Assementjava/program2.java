package Assementjava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class program2 {
/*
 2. Write a Java Program to Create an Employee Class. 20 Marks
a. Take input form the user about the number of Employee Records to be created
and Accept the Employee Details from the user - Name, Department, Salary. (5 Marks)
b. The Employee Id should be auto incremented for every record. (3 Marks)
c. The Company name for all the Employees should be “TECHNOGISE”. (2 Marks)
d.Take an input from the user asking the Department Name for which the user wants to
see the employee records and Print all the employee Records of the Department entered
by the User in below Format - (7 marks)
ID Name Department Salary Company
—------------------------------------------------------------------------------------------------------------
2 Rohit HR 125000 TECHNOGISE
33 Mayank HR 300000 TECHNOGISE
 */
	
	
	 static String company="TECHNOGOISE";

     /**
      * 
      * @this method accept user input and return user data in map
      */
     public static TreeMap<Integer,LinkedList<Object>> userInput() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter How Many Employe Data You Want To Store");
		
		int record;
		record=sc.nextInt();
		
		TreeMap<Integer,LinkedList<Object>>map=new TreeMap<Integer,LinkedList<Object>>();
		
		for(int i=1;i<=record;i++) {
			
			LinkedList<Object>list=new LinkedList<Object>();
			
			System.out.println("Enter Employe Detailes id is :"+i);
			
			System.out.println("Entre Employe name");
			String Emname;
			Emname=sc.next();
			
			System.out.println("Entre Employe department");
			String Emdepartment;
			Emdepartment=sc.next().toUpperCase();
			
			System.out.println("Enter Employe salary");
			int Emsalary;
			Emsalary=sc.nextInt();
			
			list.add(i);
			list.add(Emname);
			list.add(Emdepartment);
			list.add(company);
			
			map.put(i, list);
			
			
		}return map;
		
	}
     /**
      * 
      * @this method Take department from user and show Employe details
      */
     public static void Takedepartment(TreeMap<Integer,LinkedList<Object>>map) {
   	  
   	  Scanner input=new Scanner(System.in);
  
   	  System.out.println("Entre Department name You Want");
   	  
   String specificdep;
   	 
   	  specificdep=input.next().toUpperCase();
   	 
   	  System.out.println("ID   Emname	Department companyname");
   	  
   	  System.out.println("----------------------------------------------------------");
   	 for(Map.Entry<Integer,LinkedList<Object>>dep:map.entrySet()) {
   		 
   		 if(dep.getValue().contains(specificdep)) {// check specific deprtment is present
   		  
   			 Iterator it=dep.getValue().iterator();
   		   
   			 while(it.hasNext()) {
  			   
   				 System.out.print(it.next()+"\t");
   		   }
   		   	 System.out.println();
   		 }
   		
   	 
   	 } 
   	  LinkedList<Object>li=new LinkedList<Object>();
   	  
   	  for(Map.Entry<Integer,LinkedList<Object>>dep:map.entrySet()) {
   		 
   		  Object[]list=dep.getValue().toArray();
   		  
   		  li.add(list[2]);// department presernt in array of index 2
   		 
   	  }
   	  if(!li.contains(specificdep)) {// department is not present 
			  System.out.println("No record Found ");
		  }
   	
    	 }
   		 public static void main(String[] args) {
		
		TreeMap<Integer, LinkedList<Object>> trmp = userInput() ;
		for(Map.Entry<Integer,LinkedList<Object>>mp:trmp.entrySet()) {
			System.out.println(mp.getValue());
		}
		Takedepartment(trmp);
	}

}
