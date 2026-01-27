package com.riya.reverse;

public class CheckTwoArraysEqualOrNot {

	public static void main(String[] args) {
		 int[] a = {1, 2, 3};
	        int[] b = {1, 2, 3};

	        boolean equal = true;

	        if (a.length != b.length)
	            equal = false;
	        else {
	            for (int i = 0; i < a.length; i++) {
	                if (a[i] != b[i]) {
	                    equal = false;
	                    break;
	                }
	            }
	        }

	        System.out.println(equal ? "Equal" : "Not Equal");

	}

}
