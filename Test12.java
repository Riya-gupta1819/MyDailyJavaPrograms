package com.riya.reverse;

class Login {

    static int count = 0;   // static variable

    static void loginAttempt() {
        count++;   // increment on every attempt
        System.out.println("Login attempt count: " + count);
    }
}

public class Test12 {

	public static void main(String[] args) {
		Login.loginAttempt();
        Login.loginAttempt();
        Login.loginAttempt();

	}

}
