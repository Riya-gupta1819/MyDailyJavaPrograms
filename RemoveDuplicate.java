package com.riya.practice;

public class RemoveDuplicate {
	

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;  // slow pointer

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,4,4};
        int length = removeDuplicates(arr);

        for (int k = 0; k < length; k++) {
            System.out.print(arr[k] + " ");
        }
	}

}
