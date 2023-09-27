package com.kn.removeElement;

import java.util.Scanner;

public class RemoveArrayElementDemo {

	public static void main(String[] args) {
		// Take size as user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array = ");
		// Create , Declare and initialization of array
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the Array elements of size = " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// Take user input the element to be deleted
		System.out.print("Enter the element to be deleted = ");
		int key = sc.nextInt();
		// Elements before deleted
		System.out.println("==>Elements before deleted<==");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// create an object of RemoveArrayElement
		RemoveArrayElement R = new RemoveArrayElement();
		// call the method of class RemoveArrayElement
		int[] result = R.deleteElement(arr, key);
		// Print the array elements after deleted
		System.out.println();
		System.out.println("==>Elements After deleted<==");
		for (int i = 0; i < result.length - 1; i++) {
			System.out.print(result[i] + " ");
		}
		// Release the resource
		sc.close();
	}

}
