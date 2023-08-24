package com.kn.checkMultipleOf10;

import java.util.Scanner;

public class CheckMultipleOf10 {

	public static void main(String[] args) {
		// Take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		// Create a new CheckMultiple object
		CheckMultiple check = new CheckMultiple();
		//Categorize the number
		check.multiple(num);
		// close the scanner object
		sc.close();
	}

}
