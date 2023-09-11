package com.kn.prime;

import java.util.Scanner;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		// Take number as a user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		// Create the object of the class
		PrimeNumber primeNumber = new PrimeNumber();
		// call the method of class primeNumber
		primeNumber.find(num);
		// release resouse
		sc.close();

	}

}
