package com.string;

public class RemoveJunkFromString {

	public static void main(String[] args) {
		
		String s = "678654556777自分の名前 string";
		
		String s1 = s.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(s1);
		
	}

}
