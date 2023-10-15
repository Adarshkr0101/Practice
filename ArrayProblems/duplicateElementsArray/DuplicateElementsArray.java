package com.kn.duplicateElementsArray;

import java.util.Scanner;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array = ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("=>Array Initialization<=");
		System.out.println("Enter Array Elements of size = " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					System.out.println("Duplicate Elements = " + arr[j]);
				}
			}
		}
	}

}
