package com.riya.string;


import java.util.HashMap;
import java.util.Map;


public class CharFrequency {

	public static void main(String[] args) {
		 String str = "programming";

	        // Convert to lowercase and remove spaces if needed
	        str = str.toLowerCase().replaceAll("\\s", "");

	        Map<Character, Integer> freqMap = new HashMap<>();

	        for (char c : str.toCharArray()) {
	            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
	        }

	        // Print frequencies
	        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }

	}

}
