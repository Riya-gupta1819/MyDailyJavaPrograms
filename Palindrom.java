package com.riya.palindrom;

import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
	    String str = sc.nextLine();
	    
	    boolean isPalindrome = true;
	    
	    for(int i = 0; i<str.length(); i++)
	    {
	    	if(str.charAt(i)!=str.charAt(str.length()-i-1))
	    	{
	    		isPalindrome = false;
	    		break;
	    	}
	    }
	    
	    if(isPalindrome)
	    {
	    	System.out.println(str+" is a palindrom");
	    }
	    else
	    {
	    	System.out.println(str+" is not a palindrom");
	    }

	}

}
