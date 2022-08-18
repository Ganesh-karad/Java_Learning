package com.patterns.printing;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	
	 
      	1
     	222
    	33333
   	    4444444
     	555555555

	
	
	
	*/
	
	int i,j,k;
	
	for( i=1;i<=5;i++) {
		
		k=2*i-1;
		for(j=1;j<=k;j++) {
			System.out.print(i);
		}
		
		System.out.println();
	}
	
	
	
	
	}

}
