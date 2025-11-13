package com.riya.reverse;


import java.util.Scanner;
public class Reverse2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String to reverse : ");
		String input = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		System.out.println(sb.reverse());
		

	}

}
