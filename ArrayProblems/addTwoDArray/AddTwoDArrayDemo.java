package com.kn.addTwoDArray;

import java.util.Scanner;

public class AddTwoDArrayDemo {

	public static void main(String[] args) {
		// Take the size as user input of 2 D Array for array 1
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size for array 1 = ");
		int s=sc.nextInt();
		// Create an 2 D Array
		int[][] arr = new int[s][s];
		// Take the size as user input of 2 D Array for array 2
		System.out.print("Enter size for array 2 = ");
		int s1=sc.nextInt();
		// Create an 2 D Array
		int[][] brr = new int[s1][s1];
		if (arr.length == brr.length) {
			// Initialize for Array 1
			System.out.println("==>Enter elements for Array 1<==");
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			// Initialize for Array 2
			System.out.println("==>Enter elements for Array 2<==");
			for (int i = 0; i < brr.length; i++) {
				for (int j = 0; j < brr[i].length; j++) {
					brr[i][j] = sc.nextInt();
				}
			}
			// Create an object of class AddTwoDArray
			AddTwoDArray a = new AddTwoDArray();
			// call the method of class AddTwoDArray
			int crr[][] = a.add(arr, brr);
			// Traverse the array after adding
			System.out.println("==> elements After Adding<==");
			for (int i = 0; i < crr.length; i++) {
				for (int j = 0; j < crr[i].length; j++) {
					System.out.print(crr[i][j]+",");
				}System.out.println();
			}
		} else
			System.out.println("Invalid input");
		sc.close();

	}

}
