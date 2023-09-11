package com.kn.factorsOfNumber;

public class FactorsOfNumber {
	// creating the method to find factors of a number
	public void find(int num) {
		System.out.println("Factors of the " + num + " are : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i);
				System.out.print(" ");

			}
		}

	}

}
