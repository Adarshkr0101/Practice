package com.kn.fibonnaci;

import java.util.Scanner;

public class FibonnaciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position of the fibonacci series");
		int num = sc.nextInt();
		System.out.println("Fibonnaaci number at position " + num + " = " + calculate(num));
		sc.close();
	}

	private static int calculate(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else {
			return calculate(num - 1) + calculate(num - 2);
		}

	}

}
