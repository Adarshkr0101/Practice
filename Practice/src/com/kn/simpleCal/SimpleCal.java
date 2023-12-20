package com.kn.simpleCal;

import java.util.Scanner;

public class SimpleCal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers for add");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int add = addition(a, b);
		System.out.println("add=" + add);

		System.out.println("enter two numbers for sub");
		int c = scan.nextInt();
		int d = scan.nextInt();
		substraction(c, d);

		int mul = multiplication();
		System.out.println("mul=" + mul);
		
		div.division();
		scan.close();

	}

	

	public static int multiplication() {
		// TODO Auto-generated method stub
		System.out.println("enter two numbers for multiply");
		Scanner scan = new Scanner(System.in);
		int f = scan.nextInt();
		int g = scan.nextInt();
		int mul = f * g;
		scan.close();
		return mul;
	}

	public static void substraction(int c, int d) {
		// TODO Auto-generated method stub
		int sub = c - d;
		System.out.println("sub=" + sub);

	}

	public static int addition(int a, int b) {
		// TODO Auto-generated method stub
		int sum = a + b;
		return sum;
	}

}