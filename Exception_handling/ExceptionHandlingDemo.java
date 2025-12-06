package com.riya.Exception_handling;

import java.util.Scanner;
public class ExceptionHandlingDemo {
	public static void handleExceptions(String input)
	{
		try
		{
			if(input==null) {
				throw new NullPointerException();
			}
			System.out.println("length of the string : "+input.length());
			
			int number = Integer.parseInt(input);
			System.out.println("Converted to integer:  "+number);
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException: Input is not a valid integer.");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException: Input is null.");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.nextLine();
		if("null".equalsIgnoreCase(s)) {
			s = null;
		}
		handleExceptions(s);
		sc.close();
		
	}

}
