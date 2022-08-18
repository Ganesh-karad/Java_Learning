package com.patterns.printing;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		    *
		*	*	*
    *	*	*	*	*
 *	*	*	*	*	*	*
	
	
	*	*	*	*	*
		*	*	*
			*


*/
		
		
		
		
		
		for(int i=1;i<=3;i++) {
			
			for(int j=4;j>=i;j--) {
				
				System.out.print("   ");			}
			for(int k=1;k<(i*2);k++) {
				System.out.print("*  ");
			}
	         System.out.println();
		
		}

		
	
		for(int i=1;i<=4;i++) {//loop
			for(int j=1;j<=i;j++) {//space
				System.out.print("   ");
			}
			for(int k=9;k>(i*2);k--) {//print
				System.out.print("*  ");
			}
	         System.out.println();
		
		}
		
		
	}

}
