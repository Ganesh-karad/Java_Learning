package com.exceptionhandaling.program;

import java.util.Scanner;

public class program3  {

	
	public static void Browser(String browser) throws  InvalidBrowserException {
		
		
		
		if(browser.equals("Google Chrome" )|| browser.equals("Firefox") || browser.equals("Safari"))
		{
			System.out.println("Awesome, We will launch the browser");	
	
		}
		else {
			throw new InvalidBrowserException(" InvalidBrowserException");	
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws InvalidBrowserException {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name");
		
		String browsername=sc.nextLine();
		browsername=browsername.toLowerCase();
		browsername=" "+browsername;
		String name="";
		for(int i=0;i<browsername.length();i++) {
			char ch=browsername.charAt(i);
			if(ch==' ') {
				name=name+ch;
				i++;
				ch=browsername.charAt(i);
				name=name+Character.toUpperCase(ch);
			}
			else {
				name=name+ch;
			}
			
			
		}
		name=name.trim();
		System.out.println(name);
		
		try {
			Browser(name);
		} catch (InvalidBrowserException e) {
			
		System.out.println("catch exception "+e);
		}
		
	}

}
