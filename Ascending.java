package com.riya.day1;

import java.util.Arrays;

public class Ascending {

	public static void main(String[] args) {
		int[] arr = {5, 2, 9, 7, 1};
		
		Arrays.sort(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
