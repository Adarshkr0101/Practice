package com.kn.factorsOfNumber;

import java.util.Scanner;

public class FactorsOfNumberDemo {

	public static void main(String[] args) {
		// Take a number as user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		// create a object of class FactorsOfNumber
		FactorsOfNumber factorsOfNumber = new FactorsOfNumber();
		// calling the method of class FactorsOfNumber
		factorsOfNumber.find(num);
		// release resource
		sc.close();

	}

}
