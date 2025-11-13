package com.riya.vowel;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		boolean containsVowel = false;
		
		for(char c :str.toLowerCase().toCharArray())
		{
			if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
			{
				containsVowel = true;
				break;
			}
			
		}
	
	if(containsVowel)
	{
		System.out.println("The String contains vowel");
	}
	else
	{
		System.out.println("The String does not contain a vowel");
	}
	}
}


