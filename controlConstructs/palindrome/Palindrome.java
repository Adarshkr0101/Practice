package com.kn.palindrome;

public class Palindrome {
	// method to check number palindrome or not
	public void check(int num) {
		int digit = 0, sum = 0, temp = num;
		while (num != 0) {
			digit = num % 10;
			sum = sum * 10 + digit;
			num /= 10;
		}
		// check for palindrome with given number and sum variable
		if (temp == sum) {
			System.out.println(temp + " : is a palindrome");
		} else
			System.out.println(temp + " : is not a palindrome");
	}

}
