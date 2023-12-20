package com.kn.charcterInStringToUpperOrLower;

import java.util.Scanner;

public class CharcterInStringToUpperOrLower {
	// Program to convert the character to upper if it is lower and viceversa in a
	// String

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = sc.nextLine();
		sc.close();
		char[] crr = input.toCharArray();
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] >= 65 && crr[i] <= 90) {
				crr[i] = (char) (crr[i] + 32);
			} else if (crr[i] >= 97 && crr[i] <= 122) {
				crr[i] = (char) (crr[i] - 32);
			}
		}
		String result = new String(crr);
		System.out.println(result);
	}

}
