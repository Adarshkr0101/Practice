package com.kn.gcdRecursion;

import java.util.Scanner;

public class GcdRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("GCD of two numbers = " + gcd(n1, n2));
		sc.close();
	}

	public static int gcd(int n1, int n2) {
		if (n2 == 0) {
			return n1;
		} else
			return gcd(n2, n1 % n2);
	}

}
