package com.kn.insertAtPos;

import java.util.Scanner;

public class InsertAtPosDemo {

	public static void main(String[] args) {
		// Take the size as user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an Array = ");
		// Create an array
		int[] arr = new int[sc.nextInt()];
		// Initialize the array elements
		System.out.println("Enter Array Elements of size = " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// Take the user input of position and element of an array
		System.out.print("Enter the position = ");
		int pos = sc.nextInt();
		if(pos<arr.length) {
		System.out.print("Enter the Element to be inserted = ");
		int ele = sc.nextInt();
		// Print the original Array
		System.out.println("=>Elements before Inserting<=");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		// create an object of class InsertAtPos
		InsertAtPos i = new InsertAtPos();
		// Call the method of class InsertAtPos
		int[] brr = i.insert(arr, pos, ele);
		// Print the new inserted array
		System.out.println();
		System.out.println("=>Elements After Inserting<=");
		for (int num : brr) {
			System.out.print(num + " ");
		}
		}else {
			System.out.println("Invalid Position");
		}
		// Release the resource
		sc.close();
	}

}
