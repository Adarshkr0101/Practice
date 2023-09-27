package com.kn.demoClass;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// Take user input base size for a jagged array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of base array");
		// Declare a array and create a jagged array
		int[][] arr = new int[sc.nextInt()][];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the size of array " + (i + 1) + " = ");
			arr[i] = new int[sc.nextInt()];
		}
		// Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter data for " + (i + 1) + " array");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter the element " + (j + 1) + "=");
				arr[i][j] = sc.nextInt();
			}
		}
		// Traversing the array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" data for " + (i + 1) + " array  ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Data for  the element " + (j + 1) + "=" + (arr[i][j]));
			}
		}
		sc.close();
	}

}
