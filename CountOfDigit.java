package com.riya.Array;

public class CountOfDigit {

    public static void main(String[] args){

        long arr[] = {11, 22, 33, 487,9834};

        for(int i=0; i<arr.length; i++)
        {
            long n = arr[i];
            int c = 0;
            while(n!=0)
            {
                c++;
                n=n/10;
            }
            System.out.println(arr[i]+ "=" +c);

    }

    }
}
