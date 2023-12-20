package com.kn.sum;

import java.util.Scanner;

public class SumofIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of sum of integers");
		int num = sc.nextInt();
		System.out.println("Sum of range of integers = " + calculate(num));
		sc.close();

	}

	private static int calculate(int num) {
		if (num == 0) {
			return 0;
		} else {
			return num + calculate(num - 1);
		}
	}

}
