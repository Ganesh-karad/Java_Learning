package com.patterns.printing;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
  	55555
  	4444
  	333
  	22
  	1
 
 	*/
		
		
		int i,j,row=5;
		
		for(i=row;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
