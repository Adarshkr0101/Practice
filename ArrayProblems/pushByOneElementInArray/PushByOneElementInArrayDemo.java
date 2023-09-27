package com.kn.pushByOneElementInArray;

import java.util.Scanner;

public class PushByOneElementInArrayDemo {

	public static void main(String[] args) {
		// Take size as a user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array = ");
		// Declare and Create an 1D array
		int[] arr = new int[sc.nextInt()];
		// Initialize the array elements
		System.out.println("=>Enter Array elements<=");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the " + (i + 1) + " element = ");
			arr[i] = sc.nextInt();
		}
		System.out.println("==>Array Elements are<==");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		//Release the resource
		sc.close();
		// Create an object of class PushByOneElementInArray
		PushByOneElementInArray p = new PushByOneElementInArray();
		// call the method push of class PushByOneElementInArray
		System.out.println();
		System.out.println("-> Elements After pushing by one <-");
		int[] brr = p.push(arr);
		// Traversing the array elements after push by one
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i]+"  ");
		}
		
		//call the method pushBefore of class PushByOneElementInArray
		int[] crr=p.pushBefore(arr);
		// Traversing the array elements after push by one
		System.out.println();
		System.out.println("-> Elements After pushing before by one <-");
				for (int i = 0; i < crr.length; i++) {
					System.out.print(crr[i]+"  ");
				}
	
	}

}
