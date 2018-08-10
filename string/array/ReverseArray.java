package com.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };
		String s[] = {"Java", "Python", "apple", "sql"};
		
		reverse(a);
		reverse(s);

	}

	public static void reverse(int n[]) {

		int len = n.length;
		int temp;

		for (int i = 0; i < len / 2; i++) {
			temp = n[i];
			n[i] = n[len - 1 - i];
			n[len - 1 - i] = temp;
		}
		System.out.println("reverse of the int array is :" + Arrays.toString(n));
	}

	public static void reverse(String n[]) {

		int len = n.length;
		String temp;

		for (int i = 0; i < len / 2; i++) {
			temp = n[i];
			n[i] = n[len - 1 - i];
			n[len - 1 - i] = temp;
		}
		System.out.println("reverse of the string array is :" + Arrays.toString(n));
	}

}
