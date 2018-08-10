package com.array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int n[] = {1,2,3,-9,-8,-70,50,40};
		
		System.out.println("Before sorting :"+Arrays.toString(n));
		Arrays.sort(n);
		System.out.println("After sorting :"+Arrays.toString(n));	
		
	}

}
