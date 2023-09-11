package com.kn.demoClass;


import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// Take user input of row and column size
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row size array = ");
		int rs = sc.nextInt();
		System.out.print("Enter the coloum size array = ");
		int cs = sc.nextInt();
		// Create the array
		int[][] arr = new int[rs][cs];
		// Initialization of array
		System.out.println("==>Enter the array elements for initialization<==");
		for (int i = 0; i < rs; i++) {
			System.out.println("Enter the row element of " + (i + 1));
			for (int j = 0; j < cs; j++) {
				System.out.print("Enter the column element of " + (j + 1) + "=");
				arr[i][j] = sc.nextInt();
			}
		}
		// Traversing the array
		System.out.println("==>Array Elements are<==");
		for (int i = 0; i < rs; i++) {
			for (int j = 0; j < cs; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
