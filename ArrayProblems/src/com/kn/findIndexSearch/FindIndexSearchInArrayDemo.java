package com.kn.findIndexSearch;

import java.util.Scanner;

public class FindIndexSearchInArrayDemo {

	public static void main(String[] args) {
		// Take the user input size
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		// create an array
		int[] arr = new int[sc.nextInt()];
		// User input of Initializing the array elements
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + " Element of array");
			arr[i] = sc.nextInt();

		}
		// user input element to search in array
		System.out.println("Enter the element to search");
		int ele = sc.nextInt();
		sc.close();
		// create an object of class FindIndexSearchInArray
		FindIndexSearchInArray f = new FindIndexSearchInArray();
		// Create a method to return the index
		int index = f.search(ele, arr);
		// Checking the index should be greater than or equal to 0
		if (index >= 0) {
			System.out.println("Element found at index = " + index);

		} else
			System.out.println("Element not found then index = " + index);
		sc.close();
	}

}
