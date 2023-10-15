package com.kn.insertionSort;

import java.util.Scanner;

public class InsertionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array = ");
		// Create an array
		int[] arr = new int[sc.nextInt()];
		// Initialize the array
		System.out.println("Enter the Array elements of size = " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// Print array before sorting
		System.out.println("=>Elements before sorting<=");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// create an object of class InsertionSort
		InsertionSort in = new InsertionSort();
		// Call the method of class InsertionSort
		arr = in.sort(arr);
		// Print array After sorting
		System.out.println();
		System.out.println("=>Elements After sorting<=");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// Release the resource
		sc.close();

	}

}
