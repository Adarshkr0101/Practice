package com.kn.reverseNumber;

import java.util.Scanner;

public class ReverseNumberDemo {

	public static void main(String[] args) {
		// Take the number s user number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter then number");
		int num = sc.nextInt();
		// Creating the object of class ReverseNum
		ReverseNum reverse = new ReverseNum();
		// calling the method of class ReverseNum
		reverse.find(num);
		// Release the resourse
		sc.close();

	}

}
