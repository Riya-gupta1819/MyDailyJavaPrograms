package com.riya.swap;

public class NumberSwapper {
	public static void swapAndDisplay(int a, int b)
	{
		int t = a;
		a=b;
		b=t;
		
		System.out.println("Swap of two number is: "+a+ " and "+b);
	}

}
