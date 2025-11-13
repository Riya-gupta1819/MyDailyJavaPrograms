package com.riya.count;

import java.util.Scanner;
public class CountCapitalAndSmall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		int upperCase = 0, lowerCase = 0;
		for(int i =0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				upperCase++;
			}
			else if(Character.isLowerCase(ch))
			{
				lowerCase++;
			}
		}
		
		System.out.println("Uppercase letters "+upperCase);
		System.out.println("Lowercase letters "+lowerCase);

	}

}
