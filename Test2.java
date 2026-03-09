package com.riya.reverse;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        int count = words.length;

        System.out.println("Number of words = " + count);

	}

}
