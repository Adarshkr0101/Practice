package com.kn.fibonacciSeries;

public class FibonacciSeries {
	// method to find the series of range

	public void findrange(int range) {
		int first = 0, second = 1, next = 0;
		System.out.print("Fibonacci Series of range "+range+" :");
		if (range == 1) {
			System.out.println(first);
		} else if (range == 2) {
			System.out.println(first + " " + second);
		} else if (range >= 3) {
			System.out.print(first + " " + second);
			for (int i = 3; i <= range; i++) {
				next = first + second;
				first = second;
				second = next;

				System.out.print(" " + next);
			}

		} else {
			System.out.println("Invalid Input");
		}

	}
}
