package com.riya.reverse;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int n = arr.length;
        k = k % n;   // handle if k > n

        for (int r = 1; r <= k; r++) {
            int first = arr[0];

            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


	}

}
