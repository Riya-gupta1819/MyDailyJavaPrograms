package com.riya.diifrence_of_digits;
import java.util.Scanner;
public class Difference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int sum = TwoDigitsDifference.getDiffOfDigits(num);
		System.out.println("diffrence of two number is:"+sum);

	}

}
