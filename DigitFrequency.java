package com.riya.reverse;

import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int[] freq = new int[10];  // 0-9 digits
        
        while (num > 0) {
            int digit = num % 10;  // get last digit
            freq[digit]++;         // increase count
            num = num / 10;        // remove last digit
        }
        
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " occurs " + freq[i] + " times");
            }
        }
        
        sc.close();
	}

}
