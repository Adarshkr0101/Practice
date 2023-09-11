package com.kn.gcdOfTwoNumbers;

public class GcdOfTwoNumbers {
	// Creating method for calculating gcd of two numbers
	public int gcd(int num1, int num2) {
		while (num2 != 0) {
			if (num1 > num2) {
				num1 = num1 - num2;
			} else {
				num2 = num2 - num1;
			}
		}
		return num1;

	}

	public int lcm(int num1, int num2, int answer) {
		int lcmAnswer = (num1 * num2) / answer;

		return lcmAnswer;
	}
}
