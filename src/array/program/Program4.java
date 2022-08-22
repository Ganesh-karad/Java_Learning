package com.array.program;

public class Program4 {
//Write a java program to reverse the given array without using any built in methods.

	public static int[] reverseArray(int []arrays) {

		int i=0;
		int len=arrays.length-1;
		int j=len;
		
		//reverse array logic
	
		while(i<j) {
			int temp;
			temp=arrays[i];
			arrays[i]=arrays[j];
			arrays[j]=temp;
			i++;
			j--;
		}
		return arrays;
		
	
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {10,20,30,40,50,90,100};
		int[] k=reverseArray(a);
		for(int i=0;i<k.length;i++) {
			System.out.println(k[i]);
		}
		
		
		
	}

}
