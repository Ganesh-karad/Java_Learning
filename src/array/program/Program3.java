package com.array.program;

public class Program3 {
//Write a Java program to remove the duplicate numbers from an array.

	public static int removeDuplicatenumber(int arr[]) {
	
	//sorting logic
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1+i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			
		}
		//remove duplicate
		int j=0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];  
			}    
		}
		 arr[j++]=arr[arr.length-1];
		            
		return j;
		
	}
	
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
         
	int[]arr= {10,20,30,40,40,50,30,20,80};
               
	int k=removeDuplicatenumber(arr);
	   for (int i = 0; i < k; i++)
           System.out.print(arr[i] + " ");
   }
	}


