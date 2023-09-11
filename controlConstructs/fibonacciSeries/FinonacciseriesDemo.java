package com.kn.fibonacciSeries;

import java.util.Scanner;

public class FinonacciseriesDemo {

	public static void main(String[] args) {
		// Take the user input of range
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of the series");
		int range = sc.nextInt();
		// create a new object
		FibonacciSeries series = new FibonacciSeries();
		series.findrange(range);
		// release the resourse
		sc.close();
	}

}
