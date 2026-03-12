package com.riya.reverse;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int max, min;

        System.out.print("Enter number 1: ");
        int num = sc.nextInt();

        max = num;
        min = num;

        for(int i = 2; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            num = sc.nextInt();

            if(num > max) {
                max = num;
            }

            if(num < min) {
                min = num;
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

	}

}

