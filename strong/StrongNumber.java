package com.riya.strong;

public class StrongNumber {

	public static void main(String[] args) {
		int num = 145, temp = num, sum = 0;

        while (num != 0) {
            int d = num % 10;
            int fact = 1;
            for (int i = 1; i <= d; i++) {
                fact *= i;
            }
            sum += fact;
            num /= 10;
        }

        if (sum == temp)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong");

	}

}
