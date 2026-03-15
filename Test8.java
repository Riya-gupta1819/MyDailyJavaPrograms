package com.riya.reverse;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean isDigit = true;

        for(int i = 0; i < str.length(); i++) {

            if(!Character.isDigit(str.charAt(i))) {
                isDigit = false;
                break;
            }
        }

        if(isDigit)
            System.out.println("String contains only digits");
        else
            System.out.println("String does not contain only digits");

	}

}
