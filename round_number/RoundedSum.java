package com.riya.round_number;

public class RoundedSum {
	public static int  sumOfRoundedValues(int num1, int num2, int num3)
	{
		int a = ((num1+5)/10)*10;
		int b = ((num2+5)/10)*10;
		int c = ((num3+5)/10)*10;
		return a+b+c;
	}

}
