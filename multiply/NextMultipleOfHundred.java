package com.riya.multiply;

public class NextMultipleOfHundred {
	public static int getNextMultipleOfHundred(int num)
	{
		int a = num/100;
		
		return  (a*100)+100;
	}

}
