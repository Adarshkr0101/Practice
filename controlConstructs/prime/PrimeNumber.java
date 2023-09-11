package com.kn.prime;

public class PrimeNumber {
// Method to check prime number
	public void find(int num) {
		int count = 0,num1=num;
		for (int i = 1; i <= num; i++) {
			if ( (num % i) == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(num1+" : is prime");
		} else
			System.out.println(num1+" : not prime");

	}

}
