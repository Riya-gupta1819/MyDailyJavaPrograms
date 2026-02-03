package com.riya.reverse;

public class Shorted {

	public static void main(String[] args) {
		  int[] arr = {1, 2, 3, 4, 5};
	        boolean sorted = true;

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < arr[i - 1]) {
	                sorted = false;
	                break;
	            }
	        }

	        System.out.println(sorted ? "Array is sorted" : "Array is not sorted");
	}

}
