package com.riya.short_the_string;

import java.util.Scanner;
public class ShortString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string for shorting ");
		String str = sc.nextLine();
		
		char[] c = str.toCharArray();
		
		for(int i = 0; i<c.length; i++)
		{
			for(int j = i+1; j<c.length; j++)
			{
				if(c[i]>c[j])
				{
					char temp = c[i];
					c[i] = c[j];
					c[j]= temp;
				}
			}
		}
		System.out.println(new String(c));

	}

}
