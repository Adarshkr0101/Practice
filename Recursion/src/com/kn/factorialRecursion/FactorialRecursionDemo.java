package com.kn.factorialRecursion;

import java.util.Scanner;

public class FactorialRecursionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number = ");
		long n=sc.nextLong();
		System.out.println("Factorial = "+fact(n));
		sc.close();
	}

	public static long fact(long n) {
		if(n ==1) {
			return 1;
		}else
		return n*fact(n-1);
	}

}
