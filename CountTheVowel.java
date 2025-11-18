package com.riya.count_vowel;

import java.util.Scanner;
public class CountTheVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = sc.nextLine();
		
		int vowels = 0, cons =0;
		
		for(int i = 0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			
			if(c=='a' || c=='e' || c=='i'||  c=='o' || c=='u' ||
					c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
			{
				vowels++;
			}
			else
			{
				cons++;
			}
		}
		System.out.println("Vowels "+vowels);
		System.out.println("consonants "+cons);
	}

}
