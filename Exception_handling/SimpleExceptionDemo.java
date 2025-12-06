package com.riya.Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;
public class SimpleExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the value of a:");
			int a = sc.nextInt();
			System.out.println("Enter  the second number:");
			int b = sc.nextInt();
			System.out.println("you enter a = "+a+" and b = "+b);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter the correct value!!!");
			
			System.out.println("getMessage():"+e.getMessage());
			
			System.out.println("printStackTrace()");
			e.printStackTrace();
			
			System.out.println("println()");
			System.out.println(e);
			
			System.out.println("toString()"+e.toString());
		}
		System.out.println("Thank you for visiting..");
		sc.close();
		
		

	}

}
