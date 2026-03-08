package com.riya.reverse;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            sum = sum + num;
        }

        System.out.println("Sum = " + sum);

	}

}
