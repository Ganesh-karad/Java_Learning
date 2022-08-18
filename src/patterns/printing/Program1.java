package com.patterns.printing;

public class Program1 {

	public static void main(String[] args) {
		/*
		 
  	1
  	23
  	456
  	78910

		*/
		
		
		int i,j,row=4,count=1;
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(count++);
			}
		System.out.println();
		}

	}

}
