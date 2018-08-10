package com.array;

public class RemoveArrayDuplicates {

	public static void main(String[] args) {
		
		int n[]= {1,2,3,3,4,5,5,6,7,8};
		removeDuplicates(n);
		
	}
	
	public static void removeDuplicates(int n[]) {
		for(int i=0; i<n.length; i++) {
			for(int j=i+1; j<n.length;j++) {
				if(n[i] ==n[j]) {
					System.out.println("duplicate is "+n[i]);					
				}
			}
		}
	}

}
