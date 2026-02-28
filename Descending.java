package com.riya.day1;

import java.util.Arrays;

public class Descending {

	public static void main(String[] args) {
		int[] arr = {4,6,5,1,9};
		Arrays.sort(arr);
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
