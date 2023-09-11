package com.kn.reverseNumber;

public class ReverseNum {
	// Create the method to reverse the number
	public void find(int num) {
		int digit = 0, sum = 0, num1 = num;
		while (num != 0) {
			digit = num % 10;
			sum = sum * 10 + digit;
			num /= 10;
		}
		System.out.println("Reverse of " + num1 + " is :-> " + sum);
	}

}
