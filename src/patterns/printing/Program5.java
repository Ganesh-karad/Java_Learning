package com.patterns.printing;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 
    *
  	##
  	***
  	####
  	*****

 
*/

		int i,j,row=5;
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				if(i%2==1) {
					System.out.print("*");
				}
				else {
					System.out.print("#");
				}
			
			}
			System.out.println();
		}
	
	
	
	
	
	
	
	}

}
