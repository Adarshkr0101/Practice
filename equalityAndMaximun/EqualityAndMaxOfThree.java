package com.kn.equalityAndMaximun;

import java.util.Scanner;

public class EqualityAndMaxOfThree {

	public static void main(String[] args) {
		// takes user input of three numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number-1");
		int num1 = sc.nextInt();
		System.out.println("Enter Number-2");
		int num2 = sc.nextInt();
		System.out.println("Enter Number-3");
		int num3 = sc.nextInt();
		// Creating Equality and maximum object
		EqualityAndMax number = new EqualityAndMax();
		//Categorize the numbers
		number.find(num1, num2, num3);
		// close the scanner object
		sc.close();
	}

}
