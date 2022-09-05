package com.commandline.program;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Write a Java Program to accept 4 arguments from the user as command line arguments.
//		1st Param should be Name {eg - Ganesh}
//		2nd Param should be Age {eg - 15}
//		3rd Param should be Vehicle Type eg - (2 Wheeler / 4 Wheeler )
//		4th Param should be RTO Office { eg, Pune RTO, Satara RTO..}
//
//		IF the age is between 16 or 17 and Vehicle Type is “4 Wheeler” display below Message - 
//		“OOPS!!! Ganesh Since your age is less than 18, You are not eligible to apply for a 4 Wheeler License .
//		Regards
//		Pune RTO”
//
//		IF the age is between 16 or 17 and Vehicle Type is “2 Wheeler” display below Message - 
//		“CONGRATULATIONS!!! Ganesh, You are not eligible to apply for a 2 Wheeler License .
//		Regards
//		Pune RTO”
//
//
//		IF the age is less than 16 display below Message - 
//		“OOPS!!! Ganesh Since your age is less than 16, You are not eligible to apply for any License .
//		Regards
//		Pune RTO”


			
			String name=args[0];  // storing name in commondline
			
			int age=Integer.parseInt(args[1]); //from string to int
			
			String vehicle=args[2];
			
			String office=args[3];
			String v1="fourWheeler";
			String v2="twoWheeler";
			
			
			
			
			if(age>=16) {
				  if(age<=17 ) {
					  if(vehicle.equals(v1) ||vehicle.equals(v2)) {
						  System.out.println("“OOPS!!!"+name+" Since your age is less than 18, You are not eligible to apply for a 4 Wheeler Licens Regards "+office);
					  }
				  }if(age>17 ) {
					  if(vehicle.equals(v2) || vehicle.equals(v1) ) {
						  System.out.println("“CONGRATULATIONS!!!"+name+" You are not eligible to apply for a 2 Wheeler License Regards "+office);
					  }
				
				  }
			}
			else if(age<16) {
				System.out.println("“OOPS!!!"+ name +" Since your age is less than 16, You are not eligible to apply for any License Regards "+office);
			}
			
			
			
			
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
