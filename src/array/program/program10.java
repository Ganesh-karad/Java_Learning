package com.array.program;

public class program10 {

	public static int[] doubleArray(int[] a) {
		int m=0;
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]*2;
		
		}
		return a;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={2,4,6};
		int[] result=doubleArray(a);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	
	
	
	
	
	
	
	}

}
