package com.kn.mergeArray;

import java.util.Scanner;

public class MergeArrayDemo {

	public static void main(String[] args) {
		// Take the size as user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array 1 = ");
		// Array declaration and creation
		int[] arr = new int[sc.nextInt()];
		System.out.print("Enter the size of Array 2 = ");
		int[] brr = new int[sc.nextInt()];
		// Initialization of elements to arrays
		System.out.println("==>Enter the Array 1 Elements<==");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter " + (i + 1) + " Array element = ");
			arr[i] = sc.nextInt();
		}
		System.out.println("==>Enter the Array 2 Elements<==");
		for (int i = 0; i < brr.length; i++) {
			System.out.print("Enter " + (i + 1) + " Array element = ");
			brr[i] = sc.nextInt();
		}
		// Create an object of class MergeArray
		MergeArray ma = new MergeArray();
		// call the method of class MergeArray
		int[] mrr = ma.merge(arr, brr);
		// print the merged array
		System.out.println("==>Array elements after merging<==");
		for (int i = 0; i < mrr.length; i++) {
			System.out.print(mrr[i] + " ");
		}
		sc.close();
	}

}
