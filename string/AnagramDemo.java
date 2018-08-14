package com.practice1;

import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) {
		// Test case 1
		String s1 = "Desperation";
		String s2 = "ARopeEndsIt";

		if (isAnagram(s1, s2)) {
			System.out.println("This is an Anagram");
		} else {
			System.out.println("This is not an anagram");
		}
		// Test case 2
		String s3 = "madam";
		String s4 = "mmdaa";

		if (isAnagram(s3, s4)) {
			System.out.println("This is an Anagram");
		} else {
			System.out.println("This is not an anagram");
		}

		// Test case 3
		String s5 = "python";
		String s6 = "java";

		if (isAnagram(s5, s6)) {
			System.out.println("This is an Anagram");
		} else {
			System.out.println("This is not an anagram");
		}

		// Test case 4
		String s7 = "yuu_12345";
		String s8 = "yuu12345";

		if (isAnagram(s7, s8)) {
			System.out.println("This is an Anagram");
		} else {
			System.out.println("This is not an anagram");
		}
		// Test case 5
		String s9 = "__foo";
		String s10 = "foo";

		if (isAnagram(s9, s10)) {
			System.out.println("This is an Anagram");
		} else {
			System.out.println("This is not an anagram");
		}

	}

	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		String s3 = new String(c1);
		String s4 = new String(c2);

		if (s3.equalsIgnoreCase(s4)) {
			return true;
		}
		return false;

	}

}
