package com.kn.dempPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortandSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter array elements");
		for (int i = 0; i <= n-1; i++) {
			array[i] = sc.nextInt();

		}
		Arrays.sort(array); 
		System.out.println("Array elements after sorting");
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);	
		}
		System.out.println("Enter the element to be search");
		int search=sc.nextInt();
		int index=Arrays.binarySearch(array, search);
		System.out.println("Element found in index="+index);
		
		sc.close();
	}

}
