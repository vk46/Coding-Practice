package com.vk.strings;

public class PalindromeString {

	public static void main(String[] args) {
		String inputString = "racecar";
		String reverseString = new StringBuilder(inputString).reverse().toString();
		
		if (inputString.equals(reverseString)) {
            System.out.println("The string is a palindrome String.");
        } else {
            System.out.println("The string is not a palindrome String.");
        }
	}

}
