package com.kn.demoClass;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Declare and create the 3D Array
		int[][][] arr = new int[2][2][2];
		// Initialize the Array
		System.out.println("==>Enter the 3 D Array Elements<==");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println("==>Array elements in 3D Array==>");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		sc.close();
	}

}
