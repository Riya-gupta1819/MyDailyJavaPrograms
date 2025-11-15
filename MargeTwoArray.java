package com.riya.Array;

import java.util.Arrays;
public class MargeTwoArray {

    public static int[] mergeArr(int arr[], int brr[])
    {
        int crr[] = new int[arr.length+brr.length];
        int x = 0;
        for(int i = 0; i< arr.length; i++)
        {
            crr[x++] = arr[i];
        }
        for(int i = 0; i<brr.length; i++)
        {
            crr[x++] = brr[i];
        }
        return crr;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5};
        int brr[] = { 11, 22,33};
        int[] mergeArray = mergeArr(arr, brr);
        System.out.println(Arrays.toString(mergeArray));

    }

}
