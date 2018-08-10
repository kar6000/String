package com.array;

public class ArrayMaxMinSumAvg {

	public static void main(String[] args) {
		//Find max, min, sum, avg from an int array
		
		int a[] = {1,2,3,4,40};
		max(a);
		min(a);
		sum(a);

	}
	//Find max
	public static void max(int a[]) {
		int max=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max =a[i];
			}
		}
		System.out.println("max number is :"+max);
	}
	//Find min
	public static void min(int a[]) {
		int min =a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]<min) {
				min =a[i];
			}
		}
		System.out.println("min number is :"+min);
	}
	
	//find sum, avg
	public static void sum(int a[]) {
		int sum =0;
		int avg = 0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum +a[i];
			avg = sum/a.length;			
		}
		System.out.println("sum is "+sum);
		System.out.println("avg is :"+avg);
		
	}
	

}
