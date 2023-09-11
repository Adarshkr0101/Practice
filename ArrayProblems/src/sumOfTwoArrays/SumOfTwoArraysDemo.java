package sumOfTwoArrays;

import java.util.Scanner;

public class SumOfTwoArraysDemo {

	public static void main(String[] args) {
		// Take the size as user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array 1 = ");
		int size = sc.nextInt();
		System.out.print("Enter the size of array 1 = ");
		int size1 = sc.nextInt();
		// Create an two 1D arrays
		int[] arr = new int[size];
		int[] brr = new int[size1];
		if (arr.length == brr.length) {
			// Initialize the arrays 1
			System.out.println("==>Enter array 1 elements<==");
			for (int i = 0; i < arr.length; i++) {
				System.out.print("Enter the " + (i + 1) + " element of Array  = ");
				arr[i] = sc.nextInt();

			}
			// Initialize the arrays 2
			System.out.println("==>Enter array 2 elements<==");
			for (int i = 0; i < arr.length; i++) {
				System.out.print("Enter the " + (i + 1) + " element of Array = ");
				brr[i] = sc.nextInt();

			}

			// create an object of class SumOfTwoArrays
			SumOfTwoArrays s = new SumOfTwoArrays();
			// Call the method of sum of class SumOfTwoArrays
			int[] crr = s.sum(arr, brr);
			System.out.println("==>Array elements after adding<==");
			System.out.print("[");
			for (int i = 0; i < crr.length; i++) {
				if (i > 0) {
					System.out.print(" , " + crr[i]);
				} else
					System.out.print(crr[i]);
			}
			System.out.print("]");
			// Release the resource
			sc.close();
		} else
			System.out.println("Invalid Input, we can not do sum");
		System.exit(0);

	}

}
