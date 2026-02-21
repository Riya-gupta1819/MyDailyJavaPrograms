package com.riya.practice;

public class LeftRoatet {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 5};

	        int first = arr[0];  // store first element

	        for (int i = 0; i < arr.length - 1; i++) {
	            arr[i] = arr[i + 1];  // shift elements left
	        }

	        arr[arr.length - 1] = first;  // put first at last

	        // Print array
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	}

}
