package com.string;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		// Sort strings alphabetically
		String s1 ="google";
		String s2 ="apple";
		
		System.out.println(sort(s1));
		System.out.println(sort(s2));

	}
	
	public static String sort(String s) {
		char c[] =s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}

}
