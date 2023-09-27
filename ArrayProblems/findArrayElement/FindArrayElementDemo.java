package com.kn.findArrayElement;

import java.util.Scanner;

public class FindArrayElementDemo {

	public static void main(String[] args) {
		// Take the size of user input of 1D Array
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array = ");
		// Create a integer 1D array
		int[] arr = new int[sc.nextInt()];
		// Create a object of class FindArrayElement
		FindArrayElement f = new FindArrayElement();
		// call the method search of class FindArrayElement
		boolean result = f.isFindElement(arr);
		if (result) {
			System.out.println("Element found");
		} else
			System.out.println("Element not found");
		sc.close();
	}

}
