package com.string;

public class PalindromeTest {

	public static void main(String[] args) {
		
		if(isPali("Selenium")) {
			System.out.println("Selenium is a Palindrome");
		}else {
			System.out.println("Selenium is not a Palindrome");
		}
		
		
		if(isPali("Madam")) {
			System.out.println("Madam is a palindrome");
		}else {
			System.out.println("Madam is not a palindrome");
		}
		
		if(isPali("Nan")) {
			System.out.println("Nan is a palindrome");
		}else {
			System.out.println("Nan is not a palindrome");
		}		
		
	}

	public static boolean isPali(String s) {

		int len = s.length();
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + (s.charAt(i));
		}
		if (s.equalsIgnoreCase(rev)) {
			return true;
		}
		return false;

	}

}
