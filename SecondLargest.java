package com.riya.practice;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};
		Integer first = null, second = null;
		
		for(int n : arr) {
			if(first == null || n > first) {
				second = first;
				first = n;
			}
			else if((second == null || n>second) && n != first)
			{
				second = n;
			}
		}
		
		if(second != null) {
			System.out.println("Second largest: "+second);
		}
		else {
			System.out.println("No distinct second largest value.");
		}

	}

}
