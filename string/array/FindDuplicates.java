package com.aug3;

public class FindDuplicates {

	public static void main(String[] args) {
		
		int a[] = {1,2,2,3,3,4,5};
		findDuplicates(a);		

	}
	
	public static void findDuplicates(int n[]) {
		for(int i=0; i<n.length;i++) {
			for(int j =i+1; j<n.length;j++) {
				if(n[i] == n[j]) {
					System.out.println("duplicate is "+n[i]);
				}
			}
		}
	}

}
