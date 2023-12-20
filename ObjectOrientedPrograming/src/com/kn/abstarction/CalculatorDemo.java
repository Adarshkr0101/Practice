package com.kn.abstarction;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		// Take user input of two numbers
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1 = ");
		int a = sc.nextInt();
		System.out.print("Enter number 2 = ");
		int b = sc.nextInt();
		// create an object of extends class
		SmartCal s = new SmartCal();
		// calling the methods of inherited class ie SmartCal
		s.add(a, b);
		s.sub(a, b);
		s.mul(a, b);
		s.div(a, b);
		// Release resource
		sc.close();
	}

}
