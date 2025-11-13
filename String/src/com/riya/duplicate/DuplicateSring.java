package com.riya.duplicate;


import java.util.Scanner;

public class DuplicateSring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		
		int c = 0;
		char[] arr = str.toCharArray();
		
		System.out.println("duplicate charecters are : ");
		
		for(int i = 0; i<str.length(); i++)
		{
			for(int j = i+1; j<str.length(); j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					c++;
					break;
				}
			}
		}
		
		System.out.println("Total duplicate charecter are : "+c);

	}

}
