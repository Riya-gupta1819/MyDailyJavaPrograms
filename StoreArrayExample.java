package com.riya.practice;

import java.util.Scanner;


public class StoreArrayExample {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int[] arr = new int[5];

	        System.out.println("Enter 5 elements:");

	        // Storing elements in array
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.println("Array elements are:");

	        // Displaying elements
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }

	        sc.close();

	}

}
