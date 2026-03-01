package com.riya.day1;

public class LeftRotateByD {

	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 7, 9};
        int n = arr.length;
        int d = 3;  // rotate by 3 places

        d = d % n;  // safety: agar D > size ho

        // repeat rotation D times
        for (int i = 0; i < d; i++) {

            int temp = arr[0];  // first element save

            // shift elements left by 1
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[n - 1] = temp;  // first element last me daal do
        }

        // print final array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
