package com.java.assement;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program4 {

	
	public static void printUserarr(int n,int[] array) {
		Scanner sc=new Scanner(System.in);
		for( int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("array element are:");
	
	     for(int i=0;i<n;i++) {
	    	 System.out.println(array[i]);
	     }
	
	     System.out.println("reverse the array");
	     
	     for(int i=n-1;i>=0;i--) {
	    	 System.out.println(array[i]);
	     }
        System.out.println("sum of all array elements");
        int sum=0;
        for(int i=0;i<n;i++) {
        	
        sum=sum+array[i];
        	
        }
        System.out.println(sum);
	
	System.out.println("prient maximum element in the array");
	int max=array[0];
	for (int i=0;i<n;i++) {
		 if(array[i]>max) {
			 max=array[i];
		 }
		
	 }
	 System.out.println(max);
	System.out.println("remove duplicate element");
	 Set<Integer> set= new HashSet<>(); 
	for(Integer i:array) {
		set.add(i);
	}	 
	 System.out.println(set);
	
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the element you want to store");
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[] array=new int[10];
		System.out.println("entre the elment of the array");
	
		printUserarr(n, array);
		
		
	}

}
