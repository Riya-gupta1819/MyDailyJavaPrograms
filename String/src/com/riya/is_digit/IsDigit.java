package com.riya.is_digit;

import java.util.*;


public class IsDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = sc.nextLine();
		
		boolean containsDigits = false;
		
		for(int i = 0; i<str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				containsDigits = true;
				break;
			}
		}
		
		if(containsDigits)
		{
			System.out.println("The string contains digits.");
		}
		else
		{
		    System.out.println("The string does not contains string.");
		}

	}

}
