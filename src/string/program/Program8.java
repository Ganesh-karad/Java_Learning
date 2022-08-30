package com.string.program;

public class Program8 {
 /*
  Write a program which will concat 2 strings and print the output. (Do not use inbuilt methods)
Eg : Str 1 = Rahul , Str2 = Dravid
Output = RahulDravid

  
  */
	public static void concateTwoString(String str1,String str2) {
		{
		int len1=str1.length();//length find
		int len2=str2.length();
		
		// crerate new char array and put length
		char arry[]=new char[len1+len2];
		
		for (int i = 0; i < len1; i++)
		{
			arry[i] = str1.charAt(i);
		}

		int index = 0; 
		// j store the string after i length
		for (int j = len1; j < arry.length; j++) 
		{

			arry[j] = str2.charAt(index);
			index++; 
		}
		
		System.out.println(arry);

		}
	
	
	
		}
	
	
	
	
	
	
	public static void main(String[] args) {
		

	String string1="Rahul";
	String string2="Dravid";
		
	concateTwoString(string1, string2);
		
	}

}
