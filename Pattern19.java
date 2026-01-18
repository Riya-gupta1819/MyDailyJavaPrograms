package com.riya.pattern;

public class Pattern19 {

	public static void main(String[] args) {
		 int n = 4;

	        for (int i = 0; i < n; i++) {
	            int num = 1;

	            for (int s = 1; s <= n - i; s++)
	                System.out.print(" ");

	            for (int j = 0; j <= i; j++) {
	                System.out.print(num + " ");
	                num = num * (i - j) / (j + 1);
	            }
	            System.out.println();
	        }

	}

}
