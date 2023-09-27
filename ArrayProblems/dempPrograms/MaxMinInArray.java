package com.kn.dempPrograms;

import java.util.Scanner;

public class MaxMinInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("Enter array elements of size " + n);
		int[] numbers = new int[n];
		for (int i = 0; i <=n-1 ; i++) {
			numbers[i] = sc.nextInt();

		}

		// Initialize max and min with the first element
		int max = numbers[0];
		int min = numbers[0];

		// Iterate through the array to find max and min
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}

		System.out.println("Maximum value: " + max);
		System.out.println("Minimum value: " + min);
		sc.close();
	}
}
