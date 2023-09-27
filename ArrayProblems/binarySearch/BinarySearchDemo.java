package com.kn.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {

	public static void main(String[] args) {
		// Take the size as user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the array = ");
		// Decalare and create the array
		int[] arr = new int[sc.nextInt()];
		// Initialize the array
		System.out.println("Enter the Array Elements of size " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// Take user input that element to be searched
		System.out.print("Enter the element to be searched = ");
		int ele = sc.nextInt();
		//sort the array for binary search
		Arrays.sort(arr);
		// create an object of class LinearSearch
		BinarySearch ls = new BinarySearch();
		// call the method of class LinearSearch
		int result = ls.binarysearch(arr, ele);
		// print the search element found or not
		if (result >= 0) {
			System.out.println("Element found at location = " + result);
		} else
			System.out.println("Element not found");
		// Release the resource
		sc.close();

	}

}
