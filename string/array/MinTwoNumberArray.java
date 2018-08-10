package com.array;

public class MinTwoNumberArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,0};
		minTwo(a);
		
		int b[] = {9,60,70,5,40,-6};
		minTwo(b);
		
	}
	
	public static void minTwo(int n[]) {
		
		int min1 =n[0];
		for(int i=0; i<n.length; i++) {
			if(n[i]<min1) {
				min1 =n[i];
			}
		}
		System.out.println("min1 is "+min1);	
		
		int min2 = Integer.MAX_VALUE;
				
		for(int i=0; i<n.length; i++) {
			if(n[i]<min2 && n[i]>min1) {
				min2 =n[i];
			}
		}
		System.out.println("min2 is "+min2);
				
	}
	

	
	

}
