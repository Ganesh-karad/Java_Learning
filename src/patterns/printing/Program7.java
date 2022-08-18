package com.patterns.printing;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 
  	1
  	22
  	333
  	4444
  	55555
  	4444
  	333
  	22
  	1


	*/
	
		int i,j;
		
	for(i=1;i<=5;i++) {
		for(j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println();
	}	
	for(i=4;i>=1;i--) {
		for(j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println();
	}
		
		
		
	
	}

}
