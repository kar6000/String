package com.array;

public class MaxOfTwoArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 6, 7, 8, 9, 10,100, 4 };
		maxOfTwo(a);
		
		int b[] = {1,5,7,-9,-7,0,6,5,7, 70};
		maxOfTwo(b);

	}

	public static void maxOfTwo(int a[]) {

		int max1 = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max1) {
				max1 = a[i];
			}
		}
		System.out.println("max1 is " + max1);

		int max2 = Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max2 && a[i] < max1) {
				max2 = a[i];
			}
		}
		System.out.println("max2 is " + max2);

	}

}
