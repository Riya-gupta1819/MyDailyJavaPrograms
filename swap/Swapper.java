package com.riya.swap;

import java.util.Scanner;

public class Swapper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		NumberSwapper.swapAndDisplay(a, b);
	

	}

}
