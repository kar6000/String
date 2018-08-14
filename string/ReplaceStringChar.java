package com.practice1;

public class ReplaceStringChar {

	public static void main(String[] args) {
		
		//change the entire string
		String s ="google";
		String s1 =s.replace("google", "facebook");
		System.out.println("old string is "+s);
		System.out.println("new string is "+s1);
		
		String m = "india";
		String m1=m.replace("i", "s");
		System.out.println(m1);
		
	}

}
