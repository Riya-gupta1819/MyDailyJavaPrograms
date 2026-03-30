package com.riya.practice;

public class Test11 {
	
	static String concat(String... words) {

        String result = "";

        for (String word : words) {
            result = result + word;
        }

        return result;
    }

	public static void main(String[] args) {
		 String res = concat("Java ", "is ", "easy");

	        System.out.println(res);

	}

}
