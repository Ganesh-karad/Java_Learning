package com.array.program;

import java.util.Arrays;

public class Program6 {
	public static int[] concatenatAndsorted(int [] a,int[] b)
	{    
		
		//join two array
	
		
		int length=a.length+b.length;
		
		int c[]=new int[length];
		
		for (int i=0;i<a.length;i++) {
			   c[i]=a[i];
		   }
			for(int i=0;i<b.length;i++) {
				c[a.length+i]=b[i];
			
			}
			for(int i=0;i<c.length;i++) {
				System.out.print(c[i]+" ");
			}
			System.out.println();
			
			//sorting
			
			
			int temp=0;
			for(int i=0;i<c.length;i++) {
				for(int j=1+i;j<c.length;j++) {
					if(c[i]>c[j]) {
						temp=c[i];
						c[i]=c[j];
						c[j]=temp;
					}
				}
			}
			for(int i=0;i<c.length;i++) {
				
			}
			
			
			return c;
			
			
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr1[]=	 {3,5,1,0,4};
		   
		   int arr2[]= {7,9,8,6,2};
		 
		  int k[]= concatenatAndsorted(arr1,arr2);
		   
		   for ( int i=0;i<k.length;i++) {
				System.out.print( k[i]+" ");	
				}
			
	}

}
