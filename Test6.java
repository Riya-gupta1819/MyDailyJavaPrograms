package com.riya.reverse;

public class Test6 {

	public static void main(String[] args) {
		 int[] arr1 = {1, 2, 4, 5};
	        int[] arr2 = {2, 3, 5, 6};

	        int i = 0, j = 0;

	        while(i < arr1.length && j < arr2.length) {

	            if(arr1[i] < arr2[j]) {
	                System.out.print(arr1[i] + " ");
	                i++;
	            }
	            else if(arr1[i] > arr2[j]) {
	                System.out.print(arr2[j] + " ");
	                j++;
	            }
	            else {
	                System.out.print(arr1[i] + " ");
	                i++;
	                j++;
	            }
	        }

	        while(i < arr1.length) {
	            System.out.print(arr1[i] + " ");
	            i++;
	        }

	        while(j < arr2.length) {
	            System.out.print(arr2[j] + " ");
	            j++;
	        }

	}

}
