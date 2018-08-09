package com.string;

public class RemoveVowels {

	public static void main(String[] args) {
		
		String s ="california";
		removeVowel(s);
		
		String s1 ="sunnyvale";
		removeVowel(s1);
		
		String s2 ="Selenium";
		removeVowel(s2);

	}
	
	public static void removeVowel(String s) {
		
		int len = s.length();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<len;i++) {
			char c = s.charAt(i);
			if(!(c =='a'| c =='A' | c== 'E' | c=='e'| c =='i'|c =='I'|c =='o'|c =='O'|c =='u'|c =='U')) {
				sb.append(c);
			}			
		}
		String s2=new String(sb);
		System.out.println("new string is "+s2);
	}

}
