package com.kn.reverseString;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to Revere");
		String str = sc.next();
		System.out.println("Original String = " + str);
		System.out.println("Reversed String = " + reverse(str));
		sc.close();
	}

	private static String reverse(String str) {
		if (str.isEmpty() || str.length() == 1) {
			return str;
		}

		return reverse(str.substring(1)) + str.charAt(0);
	}

}
