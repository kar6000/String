package com.practice1;

public class BinSearch {

	public static void main(String[] args) {
		
		//Binary search in an array of Integers
		int a[] = {1,2,3,4,6,8,9};
		int index = binSearch(a, 1, 0,a.length-1);
		
		if(index>=0) {
			System.out.println("no found at index "+index);			
		}else {
			System.out.println("no not found");
		}
	}
	
	public static int binSearch(int n[], int num, int first, int last) {
		
		int middle = (first+last)/2;
		
		if(n[middle] ==num) {
			num =middle;
		}else if(n[middle] <num) {
			return binSearch(n,num,middle+1, last);
		}else
			return binSearch(n, num, first,middle-1);
		return middle;		
	}

}
