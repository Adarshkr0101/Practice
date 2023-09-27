package com.kn.linearSearch;

import java.util.Scanner;

public class LinearSearchDemo {

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
		// create an object of class LinearSearch
		LinearSearch ls = new LinearSearch();
		// call the method of class LinearSearch
		int result = ls.linearsearch(arr, ele);
		// print the search element found or not
		if (result >= 0) {
			System.out.println("Element found at location = " + result);
		} else
			System.out.println("Element not found");
		// Release the resource
		sc.close();

	}

}
