package com.kn.fibbonacciRecursion;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print(fibo(i) + " ");
		}
		sc.close();
	}

	public static int fibo(int n) {
		if(n==0||n==1) {
			return n;
		} else
			return fibo(n - 1) + fibo(n - 2);
	}

}