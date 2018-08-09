package com.string;

public class ReverseString {

	public static void main(String[] args) {
		String s ="aliva";
		reverse(s);
		
		String s1 = "Selenium";
		reverse(s1);
		
		String s2 = "California";
		reverse(s2);
		
	}
	
	public static void reverse(String a) {
		int len = a.length();
		
		String rev ="";
		
		for(int i=len-1; i>=0; i--) {
			rev = rev+(a.charAt(i));
		}
		System.out.println("reverse of string is "+rev);
		
	}

}
