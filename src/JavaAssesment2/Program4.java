package JavaAssesment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Program4 {
/*
 * 4. Write a Java Program -
a. Accept an array length and int array elements from the user and store it in an array.
b. Give the count of the total number of PrimeNumbers in the array.
c. Write a method which will take the array as the input and then replace the Armstrong
Numbers in the array with 0. and return the array. Display the updated Arra
 */
	
	
	public static int [] printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			return arr;
		}return null;
	}
	
	public static void printPrimenmb(int arr[]) {
		ArrayList<Integer> result=new ArrayList<Integer>();
		
		System.out.println("Given array list prime number is");
		
		boolean isprime=true;
		for(int i=0;i<arr.length;i++) {
			for(int j=2;j<arr[i];j++) {
			if(arr[i]%j==0) {
				isprime=false;
				break;
			}}
		
		if(isprime) {
			
			
			System.out.println(arr[i]);
			result.add(arr[i]);
		}
		}
		
		System.out.println("Total Prime Number In given Array :"+result.size());
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Entre How many Element You Wnat to Store");
	
	      int size=sc.nextInt();
	      int[] array=new int[size];
	      
	      for(int i=0;i<array.length;i++) {
	    	  System.out.println("Entre Array Elenment of "+i+" Imdex");
	    	  array[i]=sc.nextInt();
	      }
	     int[] print = printArray(array);
	     System.out.println("Array Elemnts:");
	     for(int j=0;j<print.length;j++) {
	    	 System.out.println(print[j]);
	     }

	     printPrimenmb(array);
	}

}
