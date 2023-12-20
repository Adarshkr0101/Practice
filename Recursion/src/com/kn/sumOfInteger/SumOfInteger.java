package com.kn.sumOfInteger;

import java.util.Scanner;

public class SumOfInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("Sum of digits of number = " + calculateSum(number));
		sc.close();
	}

	private static int calculateSum(int number) {
		if (number < 10) {
			return number;
		}
		int digit = number % 10;
		int remainingDigit = number / 10;
		return digit + calculateSum(remainingDigit);
	}

}
