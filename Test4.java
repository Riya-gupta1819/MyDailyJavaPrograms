package com.riya.reverse;

import java.util.Scanner;

public class Test4 {

    static void reverse(String str, int i) {

        if (i < 0) {   // base condition
            return;
        }

        System.out.print(str.charAt(i));
        reverse(str, i - 1);   // recursive call
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        reverse(str, str.length() - 1);
    }
}