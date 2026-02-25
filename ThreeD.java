package com.riya.reverse;

public class ThreeD {

	public static void main(String[] args) {
		 int[][][] arr = new int[2][2][2];

	        // Assign values
	        arr[0][0][0] = 10;
	        arr[0][0][1] = 20;
	        arr[0][1][0] = 30;
	        arr[0][1][1] = 40;

	        arr[1][0][0] = 50;
	        arr[1][0][1] = 60;
	        arr[1][1][0] = 70;
	        arr[1][1][1] = 80;

	        // Access and print values
	        for(int i = 0; i < arr.length; i++) {
	            for(int j = 0; j < arr[i].length; j++) {
	                for(int k = 0; k < arr[i][j].length; k++) {
	                    System.out.print(arr[i][j][k] + " ");
	                }
	                System.out.println();
	            }
	            System.out.println();
	        }
	}

}
