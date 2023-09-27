package com.kn.sumOfArray;

import java.util.Scanner;

public class SumOfArrayDemo {

	public static void main(String[] args) {
		// Take the size of array as user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array = ");
		// create an 1D array
		int[] arr = new int[sc.nextInt()];
		// create an object of class SumOfArray
		SumOfArray sArr = new SumOfArray();
		// call the method of sum of new class SumOfArray
		int result = sArr.sum(arr);
		// print the sum
		System.out.println("Sum of the Array Elements = " + result);
		// Release the resource
		sc.close();
	}

}
