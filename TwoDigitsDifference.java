package com.riya.diifrence_of_digits;

public class TwoDigitsDifference {
	public static int getDiffOfDigits(int num)
	{
		int a = num/10;
		int b = num%10;
		return a-b;
	}


}
