package Assementjava;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Program4 {
/*
 4. Write a Java Program - 15 Marks
a. To accept the array length from the user and then accept the integer array elements
from the user. (2 marks)
b . Print the original array received from the user. (2 Mark)
b. Reverse the array without using any library methods. (3 Mark)
c. Print the Sum of all the elements in the array. (2 Mark)
d. Print the Max element from the array. (3 Marks)
e. Remove the duplicates from the array and Print the unique values. (You can convert
the array into any suitable Collection if needed.) (3 Marks
 */
	/**
	 * 
	 * @param array
	 * @return Print array
	 */
	public static int[] printuserArray(int array[]) {
		System.out.println("Array Element");
		for(int i=0;i<array.length;i++) {
		return array;
		}
		return null;
		}

	
	 /**
	  * 
	  * @param arr
	  * @return Reverse Order Array Element
	  */
	public static int[] printreveseArray(int[]arr) {
		System.out.println("Reverse Order Array Element");
		for(int i=arr.length-1;i>=0;i--) {
			return arr;
		}
		return null;
	}
	
	/**
	 * 
	 * @param ar
	 * @return Sum of Array Element
	 */
	 public static int sumofArray(int[]ar) {
		 System.out.println("Sum of Array Element");
		 
		 int sum=0;
		 for(int i=0;i<ar.length;i++) {
			 sum=sum+ar[i];
		 }

		return sum;
	 }	
	 /**
	  * 
	  * @param max
	  * 
	  * This method find Maximum element in Array
	  */
	 public static void MaxelementArray(int max[]) {
		System.out.println("Max Element in Array");
		 int maximum= max[0];
		 // find maximum array elemet
		 for(int i=0;i<max.length;i++) {
			 if(maximum<max[i]) {
				 maximum=max[i];
			 }
		 }
		
		System.out.println(maximum);	 
		 }
	 /**
	  * 
	  * @param re
	  * This methood Remove Duplicate Element
	  */
	 public static void removeduplicate(int[]re) {
		
		 System.out.println("Remove Duplicate Element");
		// int a[]=re;
		 LinkedHashSet<Integer>hs=new LinkedHashSet<Integer>();

		  for(int i:re) {
			  hs.add(i);
		  }
	   for(int i:hs) {
		   System.out.println(i);
	   }

	 }
		
		public static void main(String[] args) {
			
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Entre the size of Array");
		int size= sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter Array Elemnet "+i+" Index");
		   array[i]=sc.nextInt();
		}
		int arr[]=printuserArray(array);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int ar[]=printreveseArray(arr);
		for(int i=ar.length-1;i>=0;i--) {
			System.out.println(ar[i]);
		}	
	System.out.println(	sumofArray(array));
	MaxelementArray(array);
	removeduplicate(array);
		}

	}
