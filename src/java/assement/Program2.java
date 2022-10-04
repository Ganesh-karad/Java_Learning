package com.java.assement;

import java.util.Scanner;

public class Program2 {
 static String companyname; 
 
   
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner (System.in);
      
      String empname,department;
      int empid;
      System.out.println("Entre employe name");
      empname=sc.next();
      System.out.println("Entre employe id");
      empid=sc.nextInt();
      System.out.println("Entre company name");
      companyname=sc.next();
      
      
	}

}
