package com.riya.remove_charecter;

import java.util.Scanner;
public class RemoveCharecter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = sc.nextLine();
		
		System.out.println("Enter a character you want to remove : ");
		char removeChar= sc.next().charAt(0);
		
		StringBuilder r = new StringBuilder();
		
		for(char c : str.toCharArray())
		{
			if(c != removeChar)
			{
				r.append(c);
			}
		}
		System.out.println(r);
		

	}

}
